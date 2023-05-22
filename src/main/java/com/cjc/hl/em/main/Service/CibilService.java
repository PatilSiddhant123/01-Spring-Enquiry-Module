package com.cjc.hl.em.main.Service;

import java.util.List;

import com.cjc.hl.em.main.model.Cibil;

public interface CibilService {

	String createCibilScore(Cibil c, String panNo);


	List<Cibil> getAllCibil();

	List<Cibil> getAllApoveList();

}
