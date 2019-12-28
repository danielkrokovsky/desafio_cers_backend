package com.mural.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mural.model.Mural;
import com.mural.repository.MuralRepository;

@Service
public class MuralService {
	
	@Autowired
	private MuralRepository muralRepository;
	
	public Mural save(Mural mural) {
		
		return muralRepository.save(mural);
	}
	
	
	public List<Mural> getAll() {
		
		Iterable<Mural> findAll = muralRepository.findAll();
		List<Mural> result = new ArrayList<Mural>();
		findAll.forEach(result::add);
	 
		return result;
	}
	
	public void remove(Long id) {
		
		muralRepository.deleteById(id);
	}

}
