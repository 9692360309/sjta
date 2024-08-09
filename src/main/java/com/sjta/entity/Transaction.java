package com.sjta.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tid;

	@ManyToOne
	@JoinColumn(name = "district_id")
	private District district;

	@ManyToOne
	@JoinColumn(name = "tahasil_id")
	private Tahasil tahasil;

	@ManyToOne
	@JoinColumn(name = "village_id")
	private Village village;

	@ManyToOne
	@JoinColumn(name = "khata_id")
	private Khata khata;

	@ManyToOne
	@JoinColumn(name = "plot_id")
	private Plot plot;

	private Date transactionDate;
	private String details;
}
