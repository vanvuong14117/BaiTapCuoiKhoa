/**
 * 
 */
package com.van.vuong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Admin
 *
 */
@Controller
public class HomeController {
	// goi localhot cung ra trang home

	@RequestMapping(value = { "", "/", "/home" }, method = RequestMethod.GET)
	public String getHome(Model model) {

		return "home";
	}
}
