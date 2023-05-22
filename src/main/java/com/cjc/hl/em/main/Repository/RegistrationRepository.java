package com.cjc.hl.em.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.hl.em.main.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

}
