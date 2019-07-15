package com.syne.positions.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.syne.positions.dao.PositionsDAO;
import com.syne.positions.dao.PositionsRepository;
import com.syne.positions.entity.OpenPositions;

@Service
public class PositionsDAOImpl implements PositionsDAO{

	@Autowired
	PositionsRepository repository;

	static Specification<OpenPositions> hasProject(String project) {
		return (position, cq, cb) -> cb.equal(position.get("project"), project);
	}


	@Override
	public List<OpenPositions> getOpenPositions() {
		return repository.findAll();
	}



}
