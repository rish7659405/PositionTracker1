package com.syne.positions.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.positions.dao.SubmissionDAO;
import com.syne.positions.dao.SubmissionRepository;
import com.syne.positions.entity.Submissions;

@Service
public class SubmissionDAOImpl implements SubmissionDAO{

	@Autowired
	SubmissionRepository submissionRepository;


	@Override
	public List<Submissions> getSubmissions() {
		return submissionRepository.findAll();
	}


	@Override
	public List<Submissions> getSubmissionsbyId(String id) {
		// TODO Auto-generated method stub
		return submissionRepository.findAllById(id);
	}



}
