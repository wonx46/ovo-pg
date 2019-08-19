package com.skul.backend.jbsfina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skul.backend.jbsfina.domain.VnoKasSmp;

@Repository
public interface VNokasSmpRepository extends JpaRepository<VnoKasSmp, String> {

	@Query(value= "select o from VnoKasSmp o")
	public VnoKasSmp getLastNoKaz();
	 
	
}
