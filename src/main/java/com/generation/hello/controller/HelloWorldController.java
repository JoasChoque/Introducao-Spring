package com.generation.hello.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//transforma a classe em controller
@RequestMapping("/hello-world")//Endpoint, o endereço a ser encontrado na URL
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/lista-bsm")
	public String listaBsm() {
		ArrayList <String> bsm = new ArrayList<String>();
		bsm.add("Responsabilidade Pessoal");
		bsm.add("Mentalidade de Crescimento");
		bsm.add("Orientação ao Futuro");
		bsm.add("Persistência");
		bsm.add("Comunicação");
		bsm.add("Trabalho em Equipe");
		bsm.add("Proatividade");
		bsm.add("Orientação ao Detalhe");
		
		return "BSMs: "+bsm;
	}
	
	@GetMapping("/objetivos-pessoais")
	public String objetivos() {
			ArrayList<String> obj = new ArrayList<String>(); 
			obj.add("Estudar mais Spring");
			obj.add("Focar mais na aula");
			obj.add("Pesquisar em mais lugares sobre o tema das aulas");
		return "Objetivos: "+obj; 
	}
}
