package com.exemplo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HtmlController {
	
	@GetMapping(path="/c")
	public String paginaWeb() {
		return"index";
		
	}
}
