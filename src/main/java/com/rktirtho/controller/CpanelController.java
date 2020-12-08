package com.rktirtho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cpanel")
public class CpanelController {
	
	@RequestMapping("login")
	public String login() {
		return "cpanel-login";
	}

}
