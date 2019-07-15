package com.syne.positions.service;

import java.util.List;

import com.syne.positions.dto.SubmissionDTO;

public interface SubmissionService {
	public List<SubmissionDTO> getSubmissions();

	public List<SubmissionDTO> getSubmissionsbyId(String id);
}
