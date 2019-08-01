package com.syne.positions.service.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.positions.dao.InterviewDAO;
import com.syne.positions.dto.InterviewDTO;
import com.syne.positions.entity.Interview;
import com.syne.positions.service.InterviewService;



@Service
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewDAO interviewDao;

	@Override
	public List<InterviewDTO> getInterviews() {

		Type listType = new TypeToken<List<InterviewDTO>>() {}.getType();
		List<Interview> interviewEntityList = interviewDao.getInterviews();
		List<InterviewDTO> interviewDTO = new ModelMapper().map(interviewEntityList, listType);
		return  interviewDTO;
	}

	@Override
	public List<InterviewDTO> getInterviewsById(String id) {
		// TODO Auto-generated method stub
		Type listType = new TypeToken<List<InterviewDTO>>() {}.getType();
		List<Interview> interviewEntityList = interviewDao.getInterviewsById(id);
		List<InterviewDTO> interviewDTO = new ModelMapper().map(interviewEntityList, listType);
		return  interviewDTO;

	}
}
