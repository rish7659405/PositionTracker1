package com.syne.positions.service;

import java.util.List;

import javax.validation.Valid;

import com.syne.positions.dto.OpenPositionsDTO;
import com.syne.positions.entity.OpenPositions;
import com.syne.positions.modal.LocationCount;

public interface PositionsService {

	public List<OpenPositionsDTO> getOpenPositions();

	public List<OpenPositionsDTO> getPositionsByLocation(String location);

	public List<OpenPositionsDTO> getPositionsByAging(String days);

	public boolean saveOpenPositions(OpenPositions openPositions);

	public boolean updateOpenPositions(String id, @Valid OpenPositions openpositions);

	/* public List<OpenPositionsDTO> getPositionsCount(); */

	

}
