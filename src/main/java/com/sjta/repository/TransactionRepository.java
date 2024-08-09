package com.sjta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sjta.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	@Query(value = "SELECT t.tid, t.mname, "
			+ "(SELECT d.dname FROM district d WHERE t.district_id = d.did) AS districtname, "
			+ "(SELECT th.tname FROM tahasil th WHERE t.tahasil_id = th.tid) AS tahasilName, "
			+ "(SELECT v.vname FROM village v WHERE t.village_id = v.vid) AS villageName, "
			+ "(SELECT k.kname FROM khata k WHERE t.khata_id = k.kid) AS khataName, "
			+ "(SELECT p.pname FROM plot p WHERE t.plot_id = p.pid) AS plotName "
			+ "FROM transaction t", nativeQuery = true)
	List<Object[]> findAllTransactionDetails();

}
