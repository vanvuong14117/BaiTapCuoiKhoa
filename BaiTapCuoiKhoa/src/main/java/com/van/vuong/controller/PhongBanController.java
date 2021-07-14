package com.van.vuong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.van.vuong.service.PhongBanSevice;

@Controller
public class PhongBanController {
	@Autowired
	PhongBanSevice userSevice;
}
