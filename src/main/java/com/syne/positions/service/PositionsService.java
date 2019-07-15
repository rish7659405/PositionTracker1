package com.syne.positions.service;

import java.util.List;

import com.syne.positions.dto.OpenPositionsDTO;

public interface PositionsService {

	public List<OpenPositionsDTO> getOpenPositions();

}
