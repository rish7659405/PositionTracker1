package com.syne.positions.service;

import java.util.List;

import com.syne.positions.dto.InterviewDTO;
import com.syne.positions.dto.SubmissionDTO;

public interface InterviewService {

	
	public List<InterviewDTO> getInterviews();

	public List<InterviewDTO> getInterviewsById(String id);
}
