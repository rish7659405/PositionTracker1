package com.syne.positions.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OpenPositions {
	@Id
	@GeneratedValue
	private Long serialKey;
	private String syneOptId;
	private String fgId;
	private Date  reqDate;
	private Long aging;
	private String hiringManager;
	private String  hiringComment;
	private String  priority;
	private String project;
	private String lineOfBusiness;
	private String roleCategory;
	private String tfr;
	private String location;

	private String mustHaveSkills;
	private String experience;
	private String band;
	private String finalStatus;
	private Long clientSubmission;
	private Long processing;
	private String bizOwner;
	private String rmgSpoc;
	private String recruiterLead;
	private String recruiter;
	private String jobDescription;
	//private String totalAging;

	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Long getSerialKey() {
		return serialKey;
	}
	public void setSerialKey(Long serialKey) {
		this.serialKey = serialKey;
	}
	public String getSyneOptId() {
		return syneOptId;
	}
	public void setSyneOptid(String syneOptId) {
		this.syneOptId = syneOptId;
	}
	public String getFgId() {
		return fgId;
	}
	public void setFgId(String fgId) {
		this.fgId = fgId;
	}
	public Date getReqDate() {
		return reqDate;
	}
	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}
	public Long getAging() {
		return aging;
	}
	public void setAging(Long aging) {
		this.aging = aging;
	}
	public String getHiringManager() {
		return hiringManager;
	}
	public void setHiringManager(String hiringManager) {
		this.hiringManager = hiringManager;
	}
	public String getHiringComment() {
		return hiringComment;
	}
	public void setHiringComment(String hiringComment) {
		this.hiringComment = hiringComment;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}
	public String getRoleCategory() {
		return roleCategory;
	}
	public void setRoleCategory(String roleCategory) {
		this.roleCategory = roleCategory;
	}
	public String getTfr() {
		return tfr;
	}
	public void setTfr(String tfr) {
		this.tfr = tfr;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getMustHaveSkills() {
		return mustHaveSkills;
	}
	public void setMustHaveSkills(String mustHaveSkills) {
		this.mustHaveSkills = mustHaveSkills;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	public Long getClientSubmission() {
		return clientSubmission;
	}
	public void setClientSubmission(Long clientSubmission) {
		this.clientSubmission = clientSubmission;
	}
	public Long getProcessing() {
		return processing;
	}
	public void setProcessing(Long processing) {
		this.processing = processing;
	}
	public String getBizOwner() {
		return bizOwner;
	}
	public void setBizOwner(String bizOwner) {
		this.bizOwner = bizOwner;
	}
	public String getRmgSpoc() {
		return rmgSpoc;
	}
	public void setRmgSpoc(String rmgSpoc) {
		this.rmgSpoc = rmgSpoc;
	}
	public String getRecruiterLead() {
		return recruiterLead;
	}
	public void setRecruiterLead(String recruiterLead) {
		this.recruiterLead = recruiterLead;
	}
	public String getRecruiter() {
		return recruiter;
	}
	public void setRecruiter(String recruiter) {
		this.recruiter = recruiter;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}


}
