package com.syne.positions.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.syne.positions.dto.OpenPositionsDTO;
import com.syne.positions.dto.SubmissionDTO;
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
	  @RequestMapping("/getPositionsByLocation/{location}")
		@ResponseBody
		public List<OpenPositionsDTO> getPositionsByLocation(@PathVariable("location") String location,HttpServletRequest req, HttpServletResponse res){

			List<OpenPositionsDTO> openpositionssList = positionsService.getPositionsByLocation(location);
			return openpositionssList;
		}
	  
	  @RequestMapping("/getPositionsByAging/{days}")
		@ResponseBody
		public List<OpenPositionsDTO> getPositionsByAging(@PathVariable("days") String days,HttpServletRequest req, HttpServletResponse res){

			List<OpenPositionsDTO> openpositionssList = positionsService.getPositionsByAging(days);
			return openpositionssList;
		}
	   
	  
	  
	  

}
