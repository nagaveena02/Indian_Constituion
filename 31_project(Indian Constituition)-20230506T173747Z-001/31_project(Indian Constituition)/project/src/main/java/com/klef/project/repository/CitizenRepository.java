package com.klef.project.repository;

import com.klef.project.domain.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,String> {

	  Citizen findByEmailAndPassword(String email, String password);

	Citizen save(Citizen model);

	}