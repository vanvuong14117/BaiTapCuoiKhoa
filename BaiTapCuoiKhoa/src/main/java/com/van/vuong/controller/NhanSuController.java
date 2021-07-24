package com.van.vuong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.van.vuong.model.ChucVu;
import com.van.vuong.model.NhanSu;
import com.van.vuong.model.PhongBan;
import com.van.vuong.service.ChuVuSevice;
import com.van.vuong.service.NhanSuSevice;
import com.van.vuong.service.PhongBanSevice;

@Controller
public class NhanSuController {
	@Autowired
	NhanSuSevice nhanSuSevice;
	@Autowired
	ChuVuSevice chuVuSevice;
	@Autowired
	PhongBanSevice phongBanSevice;

	@RequestMapping(value = { "/listNhanSu" }, method = RequestMethod.GET)
	public String getAllNhanSu(Model model) {
		List<NhanSu> listNhanSus = new ArrayList<NhanSu>();
		listNhanSus = nhanSuSevice.getAllNhanSu();
		model.addAttribute("listNhanSus", listNhanSus);
		return "listNhanSus";
	}

	@RequestMapping(value = { "/showAddNhanSu" }, method = RequestMethod.GET)
	public String addNhanSu(Model model) {
		model.addAttribute("nhanSuModelTranfer", new NhanSu());
		return "addNhanSu";
	}

	@RequestMapping(value = { "/sauKhiAddNhanSu" }, method = RequestMethod.POST)
	public String doAddNhanSu(Model model, @RequestParam(name = "maPhongBan", required = false) String maPhongBan,
			@RequestParam(name = "maChucVu", required = false) String maChucVu,
			@ModelAttribute("nhanSuModelTranfer") NhanSu nhanSu) {
		ChucVu searchChucVu = new ChucVu();
		PhongBan searchPhongBan = new PhongBan();
		if (!maChucVu.isEmpty()) {
			searchChucVu = chuVuSevice.findByMaChucVu(maChucVu);
		}
		if (!maPhongBan.isEmpty()) {
			searchPhongBan = phongBanSevice.findByMaPhongBan(maPhongBan);
		}
		if (searchChucVu == null) {
			model.addAttribute("errorChucVu", "Chuc Vu khong ton tai");
			return "addNhanSu";
		} else if (searchPhongBan == null) {
			model.addAttribute("errorPhongBan", "Phong Ban khong ton tai");
			return "addNhanSu";
		}
		nhanSu.setChucVu(searchChucVu);
		nhanSu.setPhongBan(searchPhongBan);
		nhanSuSevice.addNhanSu(nhanSu);
		nhanSuSevice.getAllNhanSu();
		List<NhanSu> listNhanSus = new ArrayList<NhanSu>();
		listNhanSus = nhanSuSevice.getAllNhanSu();
		model.addAttribute("listNhanSus", listNhanSus);
		return "listNhanSus";
	}

	@RequestMapping(value = { "/searchNhanSu/{id}" }, method = RequestMethod.GET)
	public String searchNhanSu(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("nhanSu", nhanSuSevice.searchNhanSu(id));
		return "NhanSuDetails";
	}

	@RequestMapping(value = { "/deleteByIdNhanSu/{id}" }, method = RequestMethod.GET)
	public String deleteByIdNhanSu(Model model, @PathVariable(name = "id") int id) {
		nhanSuSevice.deleteByIdNhanSu(id);
		model.addAttribute("xoathanhcong", "da xoa nhan su thanh cong");
		getAllNhanSu(model);
		return "listNhanSus";
	}

	// edit 1 user
	@RequestMapping(value = { "/editByIdNhanSu/{id}" }, method = RequestMethod.GET)
	public String editByIdNhanSu(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("nhanSuEdit", nhanSuSevice.searchNhanSu(id));
		return "editNhanSu";
	}

	// update 1 user
	@RequestMapping(value = { "/editByIdNhanSu" }, method = RequestMethod.POST)
	public String updateByIdNhanSu(@RequestParam(name = "maPhongBan", required = false) String maPhongBan,
			@RequestParam(name = "maChucVu", required = false) String maChucVu,
			@ModelAttribute("nhanSuEdit") NhanSu nhanSu, Model model) {
		ChucVu searchChucVu = new ChucVu();
		PhongBan searchPhongBan = new PhongBan();
		if (StringUtils.hasText(maChucVu)) {
			searchChucVu = chuVuSevice.findByMaChucVu(maChucVu);
		}
		if (StringUtils.hasText(maPhongBan)) {
			searchPhongBan = phongBanSevice.findByMaPhongBan(maPhongBan);
		}
		if (searchChucVu == null) {
			model.addAttribute("errorChucVu", "Chuc Vu khong ton tai");
			return "addNhanSu";
		} else if (searchPhongBan == null) {
			model.addAttribute("errorPhongBan", "Phong Ban khong ton tai");
			return "addNhanSu";
		}
		nhanSu.setChucVu(searchChucVu);
		nhanSu.setPhongBan(searchPhongBan);
		nhanSuSevice.updateNhanSu(nhanSu);
		getAllNhanSu(model);
		return "listNhanSus";
	}

}
