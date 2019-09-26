package com.syne.positions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syne.positions.modal.LocationCount;
import com.syne.positions.service.LocationCountService;

@RestController
public class LocationCountController {

	@Autowired
	LocationCountService locationscountService;
	
	@GetMapping("/getPositionsCount")
	public List<LocationCount> getPositionsCount(){
		List<LocationCount> locationcount = locationscountService.getPositionsCount();
		return locationcount;
	}
}
