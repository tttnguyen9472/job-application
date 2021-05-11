package com.jobapplication.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class JobApplicationResponseDTO {

  private String companyName;
  private String jobTitle;
  private Date applicationDate;
  private String applicationStatus;
  private Long salary;
  private Boolean offer;

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
}
