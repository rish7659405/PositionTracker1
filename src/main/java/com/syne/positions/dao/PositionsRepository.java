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

	  @Query (value =
		  		"select(select DATEDIFF( CURDATE(),o.req_date) AS days) as aging ,o.* from (SELECT * FROM open_positions)as o where o.location=?", 
		  nativeQuery = true)
	List<OpenPositions> findAllById(String location);

	  
	  @Query (value =
		  		"select A.* from(select(select DATEDIFF( CURDATE(),o.req_date) AS days) as aging ,o.* from"
		  		+ " (SELECT syne_opt_id,serial_key"
		  		+ ",account_id," + 
		  		"fg_id,req_date,hiring_manager," + 
		  		"hiring_comment,priority,project,line_of_business,role_category,tfr,location,skill_id,must_have_skills,"
		  		+ "experience,band," + 
		  		"final_status,client_submission,processing,biz_owner,rmg_spoc,recruiter_lead,recruiter,job_description "
		  		+ "FROM open_positions)" + 
		  		"as o)as A where A.aging<74", 
		  nativeQuery = true)
	List<OpenPositions> getPositionsByAging(String days);
	  
	
	
}
