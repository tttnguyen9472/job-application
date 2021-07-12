package com.jobapplication.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
    return new ToStringBuilder(this)
            .append("companyName", companyName)
            .append("jobTitle", jobTitle)
            .append("applicationDate", applicationDate)
            .append("applicationStatus", applicationStatus)
            .append("salary", salary)
            .append("offer", offer)
            .toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    JobApplicationResponseDTO that = (JobApplicationResponseDTO) o;

    return new EqualsBuilder().append(companyName, that.companyName).append(jobTitle, that.jobTitle).append(applicationDate, that.applicationDate).append(applicationStatus, that.applicationStatus).append(salary, that.salary).append(offer, that.offer).isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37).append(companyName).append(jobTitle).append(applicationDate).append(applicationStatus).append(salary).append(offer).toHashCode();
  }
}
