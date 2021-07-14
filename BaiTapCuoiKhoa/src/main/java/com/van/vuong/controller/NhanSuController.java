package com.van.vuong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.van.vuong.service.NhanSuSevice;

@Controller
public class NhanSuController {
	@Autowired
	NhanSuSevice userSevice;
}
