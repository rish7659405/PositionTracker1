package com.syne.positions.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syne.positions.dao.LocationsDAO;
import com.syne.positions.dao.PositionsRepository;
import com.syne.positions.modal.LocationCount;

@Service
public class LocationCountDAOImpl implements LocationsDAO{

  @Autowired
	PositionsRepository repository;

  @Override
	public List<LocationCount> getPositionsCount() {
		// TODO Auto-generated method stub
		
	  List<Object[]> obj= repository.getAllPositonsCount();
		ArrayList<LocationCount> loccounts=new ArrayList<LocationCount>();
		for(Object x : obj) {
			LocationCount loc=new LocationCount();
			loc.setCount(Integer.parseInt(((Object[])x)[0].toString()));
			loc.setLocation(((Object[])x)[1].toString());
			
			loccounts.add(loc);
		}
	
	return loccounts;
	}

}
