package com.jobapplication.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class JobApplicationPk implements Serializable {

  @Column(name = "company_names")
  private String companyName;

  @Column(name = "job_titles")
  private String jobTitle;

  public JobApplicationPk() {
  }

  public JobApplicationPk(String companyName, String jobTitle) {
    this.companyName = companyName;
    this.jobTitle = jobTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobApplicationPk that = (JobApplicationPk) o;
    return companyName.equals(that.companyName) && jobTitle.equals(that.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, jobTitle);
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

  @Override
  public String toString() {
    return "JobApplicationPk{" +
        "companyName='" + companyName + '\'' +
        ", jobTitle='" + jobTitle + '\'' +
        '}';
  }
}
