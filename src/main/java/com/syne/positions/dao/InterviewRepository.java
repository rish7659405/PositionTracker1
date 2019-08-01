package com.syne.positions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.syne.positions.entity.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Long>{

	   @Query("SELECT i FROM Interview i WHERE i.syneSubmissionId =:id")
	List<Interview> findAllById(String id);
}
