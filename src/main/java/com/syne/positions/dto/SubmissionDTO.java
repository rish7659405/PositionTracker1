package com.syne.positions.dto;

public class SubmissionDTO {


	private String syneSubmissionId;
	private String syneOptId;
	private String submissionDate;
	private String clientResponse;
	private String candidateName;
	
	
	
	public String getSyneSubmissionId() {
		return syneSubmissionId;
	}
	public void setSyneSubmissionId(String syneSubmissionId) {
		this.syneSubmissionId = syneSubmissionId;
	}
	public String getSyneOptId() {
		return syneOptId;
	}
	public void setSyneOptId(String syneOptId) {
		this.syneOptId = syneOptId;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	public String getClientResponse() {
		return clientResponse;
	}
	public void setClientResponse(String clientResponse) {
		this.clientResponse = clientResponse;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}


}
