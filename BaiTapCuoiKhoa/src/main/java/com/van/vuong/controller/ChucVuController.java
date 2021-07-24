package com.van.vuong.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.van.vuong.model.ChucVu;
import com.van.vuong.service.ChuVuSevice;

@Controller
public class ChucVuController {
	@Autowired
	ChuVuSevice chuVuSevice;

	@RequestMapping(value = { "/listChucVu" }, method = RequestMethod.GET)
	public String getAllChucVu(Model model) {
		List<ChucVu> listChucVus = new ArrayList<ChucVu>();
		listChucVus = chuVuSevice.getAllChucVu();
		model.addAttribute("listChucVus", listChucVus);
		return "listChucVus";
	}

	@RequestMapping(value = { "/showAddChucVu" }, method = RequestMethod.GET)
	public String addChucVu(Model model) {
		model.addAttribute("chucVuModelTranfer", new ChucVu());
		return "addChucVu";
	}

	public String doAddChucVu(@Valid @ModelAttribute("chucVuModelTranfer") ChucVu model, BindingResult errors) {
		chuVuSevice.addChucVu(model);
		return "redirect:home";
	}

	@RequestMapping(value = { "/searchChucVu/{id}" }, method = RequestMethod.GET)
	public String searchChucVu(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("chucVu", chuVuSevice.searchChucVu(id));
		return "ChucVuDetails";
	}

	@RequestMapping(value = { "/deleteByIdChucVu/{id}" }, method = RequestMethod.GET)
	public String deleteByIdChucVu(Model model, @PathVariable(name = "id") int id) {
		chuVuSevice.deleteByIdChucVu(id);
		model.addAttribute("xoathanhcong", "da xoa user thanh cong");
		getAllChucVu(model);
		return "listChucVus";
	}

	// edit 1 user
	@RequestMapping(value = { "/editByIdChucVu/{id}" }, method = RequestMethod.GET)
	public String editByIdChucVu(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("chucVuEdit", chuVuSevice.searchChucVu(id));
		return "editChucVu";
	}

	// update 1 user
	@RequestMapping(value = { "/editByIdChucVu" }, method = RequestMethod.POST)
	public String updateByIdChucVu(@ModelAttribute("chucVuEdit") ChucVu chucVu, Model model) {
		chuVuSevice.addChucVu(chucVu);
		getAllChucVu(model);
		return "listChucVus";
	}

}
