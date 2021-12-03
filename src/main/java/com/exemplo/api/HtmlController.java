package com.exemplo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HtmlController {
	
	@GetMapping(path="/login")
	public String paginaLogin() {
		return"index";
		
	}
	@GetMapping(path="/cadastro")
	public String paginaCadastro() {
		return"cadastro";
		
	}
}
