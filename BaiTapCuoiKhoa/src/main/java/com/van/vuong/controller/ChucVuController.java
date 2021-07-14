package com.van.vuong.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.van.vuong.model.ChucVu;
import com.van.vuong.service.ChuVuSevice;

@Controller
public class ChucVuController {
	@Autowired
	ChuVuSevice chuVuSevice;

	@RequestMapping(value = { "/listChucVu" }, method = RequestMethod.GET)
	public String getAllUser(Model model) {
		List<ChucVu> listChucVus = new ArrayList<ChucVu>();
		listChucVus = chuVuSevice.getAllChucVu();
		model.addAttribute("listChucVus", listChucVus);
		// giong vs views
		return "listChucVus";
	}

	// show trang add student
	@RequestMapping(value = { "/showAddChucVu" }, method = RequestMethod.GET)
	public String addUser(Model model) {
		model.addAttribute("chucVuModelTranfer", new ChucVu());
		// giong vs views
		return "addChucVu";
	}

	// add student
	@RequestMapping(value = { "/saukhiaddChucVu" }, method = RequestMethod.POST)
	public String doAddUser(@Valid @ModelAttribute("chucVuModelTranfer") ChucVu model, BindingResult errors) {

		chuVuSevice.addChucVu(model);
		// giong vs views
		return "redirect:home";
	}
}
