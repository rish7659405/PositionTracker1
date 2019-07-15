package com.syne.positions.dao;

import java.util.List;

import com.syne.positions.dto.SubmissionDTO;
import com.syne.positions.entity.Submissions;

public interface SubmissionDAO {
	public List<Submissions> getSubmissions();
	public List<Submissions> getSubmissionsbyId(String id);
}
