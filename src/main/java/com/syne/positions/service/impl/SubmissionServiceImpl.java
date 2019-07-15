package com.syne.positions.service.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.positions.dao.SubmissionDAO;
import com.syne.positions.dto.SubmissionDTO;
import com.syne.positions.entity.Submissions;
import com.syne.positions.service.SubmissionService;


@Service
public class SubmissionServiceImpl implements SubmissionService{

	@Autowired
	private SubmissionDAO submissionDAO;

	@Override
	public List<SubmissionDTO> getSubmissions() {

		Type listType = new TypeToken<List<SubmissionDTO>>() {}.getType();
		List<Submissions> submissionEntityList = submissionDAO.getSubmissions();
		List<SubmissionDTO> submissionsDto = new ModelMapper().map(submissionEntityList, listType);
		return  submissionsDto;
	}

	@Override
	public List<SubmissionDTO> getSubmissionsbyId(String id) {
		// TODO Auto-generated method stub
		Type listType = new TypeToken<List<SubmissionDTO>>() {}.getType();
		List<Submissions> submissionEntityList = submissionDAO.getSubmissionsbyId(id);
		List<SubmissionDTO> submissionsDto = new ModelMapper().map(submissionEntityList, listType);
		return  submissionsDto;

	}

}
