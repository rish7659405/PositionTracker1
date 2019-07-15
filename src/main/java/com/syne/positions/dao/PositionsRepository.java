package com.syne.positions.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.syne.positions.entity.OpenPositions;

@Repository
public interface PositionsRepository extends JpaRepository<OpenPositions, Long>, JpaSpecificationExecutor<OpenPositions>{
}
