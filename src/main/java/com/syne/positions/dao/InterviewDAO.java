package com.syne.positions.dao;

import java.util.List;

import com.syne.positions.entity.Interview;

public interface InterviewDAO {

	
	public List<Interview> getInterviews();
	public List<Interview> getInterviewsById(String id);
}
