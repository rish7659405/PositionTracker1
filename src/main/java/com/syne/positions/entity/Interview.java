package com.syne.positions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Interview {
	@Id
    @GeneratedValue
	private String syneInterviewId;
	private String syneSubmissionId;
	private String levelOfInterview;
	private String statusOfInterview;
	private String interviewType;
	private String interviewDate;
	private String feedback;
	
	


	
	
	public String getSyneInterviewId() {
		return syneInterviewId;
	}
	public void setSyneInterviewId(String syneInterviewId) {
		this.syneInterviewId = syneInterviewId;
	}
	public String getSyneSubmissionId() {
		return syneSubmissionId;
	}
	public void setSyneSubmissionId(String syneSubmissionId) {
		this.syneSubmissionId = syneSubmissionId;
	}
	public String getStatusOfInterview() {
		return statusOfInterview;
	}
	public void setStatusOfInterview(String statusOfInterview) {
		this.statusOfInterview = statusOfInterview;
	}
	public String getInterviewType() {
		return interviewType;
	}
	public void setInterviewType(String interviewType) {
		this.interviewType = interviewType;
	}
	public String getLevelOfInterview() {
		return levelOfInterview;
	}
	public void setLevelOfInterview(String levelOfInterview) {
		this.levelOfInterview = levelOfInterview;
	}
	public String getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	
}
