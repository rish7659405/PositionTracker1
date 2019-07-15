package com.syne.positions.dao;

import java.util.List;

import com.syne.positions.entity.OpenPositions;

public interface PositionsDAO {

	public List<OpenPositions> getOpenPositions();
}
