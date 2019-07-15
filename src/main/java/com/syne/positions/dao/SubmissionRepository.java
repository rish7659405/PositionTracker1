package com.syne.positions.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.syne.positions.entity.Submissions;

@Repository
public interface SubmissionRepository extends JpaRepository<Submissions, Long>{

	   @Query("SELECT s FROM Submissions s WHERE s.syneOptId =:id")
	List<Submissions> findAllById(String id);
}
