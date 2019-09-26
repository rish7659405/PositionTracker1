package com.syne.positions.dao;

import java.util.List;

import com.syne.positions.modal.LocationCount;

public interface LocationsDAO {

	List<LocationCount> getPositionsCount();

}
