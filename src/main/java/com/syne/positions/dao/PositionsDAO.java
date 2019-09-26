package com.syne.positions.dao;

import java.util.List;

import javax.validation.Valid;

import com.syne.positions.entity.OpenPositions;
import com.syne.positions.modal.LocationCount;

public interface PositionsDAO {

	public List<OpenPositions> getOpenPositions();

	public List<OpenPositions> getPositionsByLocation(String location);

	public List<OpenPositions> getPositionsByAging(String days);

	public boolean saveOpenPositions(OpenPositions openPositions);

	public boolean updateOpenPositions(String id, @Valid OpenPositions openpositions);

	/* public List<OpenPositions> getPositionsCount(); */


}
