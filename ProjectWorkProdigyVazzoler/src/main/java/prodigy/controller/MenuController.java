package prodigy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
	
	@GetMapping("/")
	public String inviaMenu() {
		return "menu";
	}
	
	@GetMapping("/cliente")
	public String inviaApiario() {
		return "cliente";
	}
	
	@GetMapping("/offerta")
	public String inviaOfferta() {
		return "offerta";
	}
	
	@GetMapping("/preventivo")
	public String inviaPreventivo() {
		return "preventivo";
	}

}
