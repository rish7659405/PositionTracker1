package com.syne.positions.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.syne.positions.dto.OpenPositionsDTO;
import com.syne.positions.entity.OpenPositions;
import com.syne.positions.modal.LocationCount;
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
	   
	  @PostMapping("/saveOpenPositions")
	  public String saveOpenPositions(@ModelAttribute("openPositions") OpenPositions openPositions)
	  {
		  if(positionsService.saveOpenPositions(openPositions))
		  {return "Positions saved successfully";}
		  return "Something went wrong";
		  
	  }
	  
	  @PutMapping("/updateOpenPositions/{id}")
	  public String updateOpenPositions(@PathVariable("id") String id,@ModelAttribute("openPositions") OpenPositions openpositions)
	  {
		  if(positionsService.updateOpenPositions(id,openpositions))
		  {return "Positions updated successfully";}
		  return "Positions not found";
		  
	  }
	  
	/*
	 * @GetMapping("/getPositionsCount1") public List<OpenPositionsDTO>
	 * getPositionsCount(){ List<OpenPositionsDTO> locationcount =
	 * positionsService.getPositionsCount(); return locationcount; }
	 */
}
