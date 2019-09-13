package com.syne.positions.service.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syne.positions.dao.PositionsDAO;
import com.syne.positions.dto.OpenPositionsDTO;
import com.syne.positions.dto.SubmissionDTO;
import com.syne.positions.entity.OpenPositions;
import com.syne.positions.entity.Submissions;
import com.syne.positions.service.PositionsService;


@Service
public class PositionsServiceImpl implements PositionsService{

	@Autowired
	private PositionsDAO positionsDAO;

	@Override
	public List<OpenPositionsDTO> getOpenPositions() {

		Type listType = new TypeToken<List<OpenPositionsDTO>>() {}.getType();
		List<OpenPositions> openPositionsEntityList = positionsDAO.getOpenPositions();
		List<OpenPositionsDTO> openPositions = new ModelMapper().map(openPositionsEntityList, listType);
		return  openPositions;
	}

	@Override
	public List<OpenPositionsDTO> getPositionsByLocation(String location) {
		// TODO Auto-generated method stub
		Type listType = new TypeToken<List<OpenPositionsDTO>>() {}.getType();
		List<OpenPositions> openPositionsEntityList = positionsDAO.getPositionsByLocation(location);
		List<OpenPositionsDTO> openPositionsDto = new ModelMapper().map(openPositionsEntityList, listType);
		return  openPositionsDto;
	}

	@Override
	public List<OpenPositionsDTO> getPositionsByAging(String days) {
		// TODO Auto-generated method stub
		Type listType = new TypeToken<List<OpenPositionsDTO>>() {}.getType();
		List<OpenPositions> openPositionsEntityList = positionsDAO.getPositionsByAging(days);
		List<OpenPositionsDTO> openPositionsDto = new ModelMapper().map(openPositionsEntityList, listType);
		return  openPositionsDto;
	}

}
