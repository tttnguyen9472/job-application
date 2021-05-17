package com.jobapplication.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class JobApplicationPk implements Serializable {

  private String companyName;
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
}
