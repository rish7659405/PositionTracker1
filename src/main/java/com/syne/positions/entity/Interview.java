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
	private String statusOfInterview;
	private String interviewType;
	private String l1panelist;
	private String l1interviewDate;
	private String l1feedback;
	private String l2panelist;
	private String l2interviewDate;
	private String l2feedback;
	private String l3panelist;
	private String l3interviewDate;
	private String l3feedback;
	
	
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
	public String getL1panelist() {
		return l1panelist;
	}
	public void setL1panelist(String l1panelist) {
		this.l1panelist = l1panelist;
	}
	public String getL1interviewDate() {
		return l1interviewDate;
	}
	public void setL1interviewDate(String l1interviewDate) {
		this.l1interviewDate = l1interviewDate;
	}
	public String getL1feedback() {
		return l1feedback;
	}
	public void setL1feedback(String l1feedback) {
		this.l1feedback = l1feedback;
	}
	public String getL2panelist() {
		return l2panelist;
	}
	public void setL2panelist(String l2panelist) {
		this.l2panelist = l2panelist;
	}
	public String getL2interviewDate() {
		return l2interviewDate;
	}
	public void setL2interviewDate(String l2interviewDate) {
		this.l2interviewDate = l2interviewDate;
	}
	public String getL2feedback() {
		return l2feedback;
	}
	public void setL2feedback(String l2feedback) {
		this.l2feedback = l2feedback;
	}
	public String getL3panelist() {
		return l3panelist;
	}
	public void setL3panelist(String l3panelist) {
		this.l3panelist = l3panelist;
	}
	public String getL3interviewDate() {
		return l3interviewDate;
	}
	public void setL3interviewDate(String l3interviewDate) {
		this.l3interviewDate = l3interviewDate;
	}
	public String getL3feedback() {
		return l3feedback;
	}
	public void setL3feedback(String l3feedback) {
		this.l3feedback = l3feedback;
	}
	
	
	
}
