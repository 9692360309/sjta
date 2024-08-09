package com.sjta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class District {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long did;
	private String dname;
	
	

}
