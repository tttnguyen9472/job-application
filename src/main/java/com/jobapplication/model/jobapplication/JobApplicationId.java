package com.jobapplication.model.jobapplication;

import java.io.Serializable;
import java.util.Objects;

public class JobApplicationId implements Serializable {

  private String companyName;
  private String jobTitle;

  public JobApplicationId() {
  }

  public JobApplicationId(String companyName, String jobTitle) {
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
    JobApplicationId that = (JobApplicationId) o;
    return Objects.equals(companyName, that.companyName) && Objects.equals(jobTitle, that.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, jobTitle);
  }
}
