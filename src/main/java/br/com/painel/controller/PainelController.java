package br.com.painel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PainelController {
	
	
	@RequestMapping("index")
	public String inicio(){
		
		return "Moleque";
	}

}
