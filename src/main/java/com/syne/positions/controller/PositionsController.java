package com.syne.positions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syne.positions.dto.OpenPositionsDTO;
import com.syne.positions.service.PositionsService;

@RestController
public class PositionsController {

	@Autowired
	PositionsService positionsService;

	  @CrossOrigin(origins = "http://localhost:4201")
	@GetMapping("/getOpenPositions")
	public List<OpenPositionsDTO> getOpenPositions(){
		List<OpenPositionsDTO> openPositions = positionsService.getOpenPositions();
		return openPositions;
	}

}
