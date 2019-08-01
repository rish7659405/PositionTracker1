package com.syne.positions.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.positions.dao.InterviewDAO;
import com.syne.positions.dao.InterviewRepository;
import com.syne.positions.entity.Interview;

@Service
public class InterviewDaoImpl  implements InterviewDAO{

	@Autowired
	InterviewRepository interviewRepository;


	@Override
	public List<Interview> getInterviews() {
		return interviewRepository.findAll();
	}


	@Override
	public List<Interview> getInterviewsById(String id) {
		// TODO Auto-generated method stub
		return interviewRepository.findAllById(id);
	}

}
