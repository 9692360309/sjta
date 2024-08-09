package com.sjta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Tahasil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tid;
	private String tname;

	@ManyToOne
	@JoinColumn(name = "did")
	private District district;

}
