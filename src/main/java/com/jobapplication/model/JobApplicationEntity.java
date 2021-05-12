package com.jobapplication.model.jobapplication;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "job_application", schema = "Jobs")
public class JobApplicationEntity {

  @EmbeddedId
  private JobApplicationPk jobApplicationPk;
  @Column(name = "application_date")
  private Date applicationDate;
  @Column(name = "application_status")
  private String applicationStatus;
  @Column(name = "salary")
  private Long salary;
  @Column(name = "offer")
  private Boolean offer;


  public JobApplicationPk getJobApplicationPk() {
    return jobApplicationPk;
  }

  public void setJobApplicationPk(JobApplicationPk jobApplicationPk) {
    this.jobApplicationPk = jobApplicationPk;
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
