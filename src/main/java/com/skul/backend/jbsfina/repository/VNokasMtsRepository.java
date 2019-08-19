package com.skul.backend.jbsfina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skul.backend.jbsfina.domain.VnoKasMts;

@Repository
public interface VNokasMtsRepository extends JpaRepository<VnoKasMts, String> {

	@Query(value= "select o from VnoKasMts o")
	public VnoKasMts getLastNoKaz();
	 
	
}
