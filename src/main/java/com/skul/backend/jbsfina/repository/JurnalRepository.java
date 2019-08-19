package com.skul.backend.jbsfina.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skul.backend.jbsfina.domain.Jurnal;

@Repository
public interface JurnalRepository extends JpaRepository<Jurnal, Integer> {

	@Query(value= "select o from Jurnal o where o.tanggal=:tgl and o.sumber=:sumber and o.nokas=:nokas")
	public Jurnal getLastJurnal(@Param(value = "tgl") Date tgl, @Param(value = "sumber")  String sumber, @Param(value = "nokas")  String nokas);
	
}
