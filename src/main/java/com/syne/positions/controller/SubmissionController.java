package com.syne.positions.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.syne.positions.dto.SubmissionDTO;
import com.syne.positions.service.SubmissionService;


@RestController
public class SubmissionController {
	@Autowired
	//Submissions submissions;
	SubmissionService submissionService;

	@GetMapping("/getSubmissions")
	public List<SubmissionDTO> getSubmissions(){

		List<SubmissionDTO> submissionsList = submissionService.getSubmissions();
		return submissionsList;
	}
	@RequestMapping("/getSubmissionsbyId/{id}")
	@ResponseBody
	public List<SubmissionDTO> getSubmissionsbyId(@PathVariable("id") String id,HttpServletRequest req, HttpServletResponse res){

		List<SubmissionDTO> submissionsList = submissionService.getSubmissionsbyId(id);
		return submissionsList;
	}
}
