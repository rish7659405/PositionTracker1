package com.syne.positions.dao.impl;

import java.util.List;

import javax.validation.Valid;

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
	/*
	 * @Autowired(required=true) private SessionFactory sessionFactory;
	 */
	

	static Specification<OpenPositions> hasProject(String project) {
		return (position, cq, cb) -> cb.equal(position.get("project"), project);
	}


	@Override
	public List<OpenPositions> getOpenPositions() {
		return repository.findAll();
	}


	@Override
	public List<OpenPositions> getPositionsByLocation(String location) {
		// TODO Auto-generated method stub
		return repository.findAllById(location);
	}


	@Override
	public List<OpenPositions> getPositionsByAging(String days) {
		// TODO Auto-generated method stub
		return repository.getPositionsByAging(days);
	}

	
	@Override
	
	public boolean saveOpenPositions(OpenPositions openPositions) {
		// TODO Auto-generated method stub
		
		
	OpenPositions openpositions=repository.save(openPositions);
	if(openpositions!=null)
	{
		return true;
	}
	return false;
		 }


	@Override
	public boolean updateOpenPositions(String id, @Valid OpenPositions openpositions) {
		// TODO Auto-generated method stub
		if(repository.findByID(id)!=null)
		{
			if(repository.save(openpositions)!=null)
			{return true;}
		}
		return false;
	}



}
