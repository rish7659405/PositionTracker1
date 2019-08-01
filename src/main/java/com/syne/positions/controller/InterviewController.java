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

import com.syne.positions.dto.InterviewDTO;
import com.syne.positions.service.InterviewService;

@RestController
public class InterviewController {

	@Autowired
	//Submissions submissions;
	InterviewService interviewService;

	  @CrossOrigin(origins = "http://localhost:4201")
	@GetMapping("/getInterviews")
	public List<InterviewDTO> getInterviews(){

		List<InterviewDTO> interviewList = interviewService.getInterviews();
		return interviewList;
	}

	  @CrossOrigin(origins = "http://localhost:4201")
	@RequestMapping("/getInterviewsById/{id}")
	@ResponseBody
	public List<InterviewDTO> getInterviewsById(@PathVariable("id") String id,HttpServletRequest req, HttpServletResponse res){

		List<InterviewDTO> interviewList = interviewService.getInterviewsById(id);
		return interviewList;
	}
}
	

