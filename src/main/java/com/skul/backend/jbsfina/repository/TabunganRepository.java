package com.skul.backend.jbsfina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skul.backend.jbsfina.domain.Tabungan;

@Repository
public interface TabunganRepository extends JpaRepository<Tabungan, Integer> {

	
}
