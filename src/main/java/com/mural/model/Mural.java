package com.mural.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mural implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, precision = 0)
	private Long id;
	private String title;
	private String description;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate publish;
	
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private LocalDate visualization;
	
}
