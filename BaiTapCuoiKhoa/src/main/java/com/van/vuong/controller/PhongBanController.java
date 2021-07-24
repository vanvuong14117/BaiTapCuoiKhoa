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

import com.van.vuong.model.PhongBan;
import com.van.vuong.service.PhongBanSevice;

@Controller
public class PhongBanController {
	@Autowired
	PhongBanSevice phongBanSevice;

	@RequestMapping(value = { "/listPhongBan" }, method = RequestMethod.GET)
	public String getAllPhongBan(Model model) {
		List<PhongBan> listPhongBans = new ArrayList<PhongBan>();
		listPhongBans = phongBanSevice.getAllPhongBan();
		model.addAttribute("listPhongBans", listPhongBans);
		return "listPhongBans";
	}

	@RequestMapping(value = { "/showAddPhongBan" }, method = RequestMethod.GET)
	public String addPhongBan(Model model) {
		model.addAttribute("phongBanModelTranfer", new PhongBan());
		return "addPhongBan";
	}

	@RequestMapping(value = { "/sauKhiAddPhongBan" }, method = RequestMethod.POST)
	public String doAddPhongBan(@Valid @ModelAttribute("phongBanModelTranfer") PhongBan model, BindingResult errors) {
		phongBanSevice.addPhongBan(model);
		return "redirect:home";
	}

	@RequestMapping(value = { "/searchPhongBan/{id}" }, method = RequestMethod.GET)
	public String searchUser(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("phongBan", phongBanSevice.searchPhongBan(id));
		return "PhongBanDetails";
	}

	@RequestMapping(value = { "/deleteByIdPhongBan/{id}" }, method = RequestMethod.GET)
	public String deleteByIdPhongBan(Model model, @PathVariable(name = "id") int id) {
		phongBanSevice.deleteByIdPhongBan(id);
		model.addAttribute("xoathanhcong", "da xoa user thanh cong");
		getAllPhongBan(model);
		return "listPhongBans";
	}

	// edit 1 user
	@RequestMapping(value = { "/editByIdPhongBan/{id}" }, method = RequestMethod.GET)
	public String editByIdPhongBan(Model model, @PathVariable(name = "id") int id) {
		model.addAttribute("phongBanEdit", phongBanSevice.searchPhongBan(id));
		return "editPhongBan";
	}

	// update 1 user
	@RequestMapping(value = { "/editByIdPhongBan" }, method = RequestMethod.POST)
	public String updateByIdPhongBan(@ModelAttribute("phongBanEdit") PhongBan phongBan, Model model) {
		phongBanSevice.addPhongBan(phongBan);
		getAllPhongBan(model);
		return "listPhongBans";
	}
}
