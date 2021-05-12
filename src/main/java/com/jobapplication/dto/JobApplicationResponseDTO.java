package com.jobapplication.dto;

import java.io.Serializable;
import java.util.Date;

public class JobApplicationResponseDTO implements Serializable {

  private String companyName;
  private String jobTitle;
  private Date applicationDate;
  private String applicationStatus;
  private Long salary;
  private Boolean offer;

  public JobApplicationResponseDTO() {
  }

  public JobApplicationResponseDTO(String companyName, String jobTitle, Date applicationDate,
                                   String applicationStatus, Long salary, Boolean offer) {
    this.companyName = companyName;
    this.jobTitle = jobTitle;
    this.applicationDate = applicationDate;
    this.applicationStatus = applicationStatus;
    this.salary = salary;
    this.offer = offer;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Date getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(Date applicationDate) {
    this.applicationDate = applicationDate;
  }

  public String getApplicationStatus() {
    return applicationStatus;
  }

  public void setApplicationStatus(String applicationStatus) {
    this.applicationStatus = applicationStatus;
  }

  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }

  public Boolean getOffer() {
    return offer;
  }

  public void setOffer(Boolean offer) {
    this.offer = offer;
  }

  @Override
  public String toString() {
    return "JobApplicationResponseDTO{" +
        "companyName='" + companyName + '\'' +
        ", jobTitle='" + jobTitle + '\'' +
        ", applicationDate=" + applicationDate +
        ", applicationStatus='" + applicationStatus + '\'' +
        ", salary=" + salary +
        ", offer=" + offer +
        '}';
  }
}
