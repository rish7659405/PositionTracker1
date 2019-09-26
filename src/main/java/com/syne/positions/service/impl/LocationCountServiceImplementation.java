package com.syne.positions.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.positions.dao.LocationsDAO;
import com.syne.positions.modal.LocationCount;
import com.syne.positions.service.LocationCountService;


@Service
public class LocationCountServiceImplementation implements LocationCountService {

	@Autowired 
	private LocationsDAO locationdao;
	
	@Override
	public List<LocationCount> getPositionsCount() {
		// TODO Auto-generated method stub
		return locationdao.getPositionsCount();
		
	}
	
	

}
