package com.mural.mural.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mural.mural.model.Mural;

@RestController
@RequestMapping("/mural")
public class MuralController {
	
	
	@PostMapping()
	public ResponseEntity<?> save(@RequestBody Mural mural, HttpServletRequest request) throws Exception {
		
		System.out.println(mural);
		return ResponseEntity.ok().body(mural);
	}
	
	
	@GetMapping()
	public ResponseEntity<?> getAll(HttpServletRequest request) throws Exception {
		
		List<Mural> lista = new ArrayList<Mural>();
		lista.add(new Mural());
		lista.add(new Mural());
		lista.add(new Mural());
		lista.add(new Mural());
		
		return ResponseEntity.ok().body(lista);
	}

}
