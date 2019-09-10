package com.syne.positions.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.syne.positions.entity.OpenPositions;
import com.syne.positions.entity.Submissions;

@Repository
public interface PositionsRepository extends JpaRepository<OpenPositions, Long>, JpaSpecificationExecutor<OpenPositions>{//: CURRENT_DATE- o.reqDate
	/*
	 * @Query
	 * ("UPDATE  OpenPositions x  SET x.totalAging =: DATEDIFF(CURRENT_DATE,x.reqDate)"
	 * 
	 * + " SELECT o FROM OpenPositions o ")
	 */
	  
	  @Query (value =
	  		"select(select DATEDIFF( CURDATE(),o.req_date) AS days) as aging ,o.* from (SELECT * FROM open_positions)as o", 
	  nativeQuery = true)
	  List<OpenPositions> findAll();
	  
	
	
}
