package com.syne.positions.service;

import java.util.List;

import com.syne.positions.dto.OpenPositionsDTO;

public interface PositionsService {

	public List<OpenPositionsDTO> getOpenPositions();

	public List<OpenPositionsDTO> getPositionsByLocation(String location);

	public List<OpenPositionsDTO> getPositionsByAging(String days);

}
