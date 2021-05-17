package com.jobapplication.model;

import com.jobapplication.dto.JobApplicationResponseDTO;

public class JobApplicationMapper {

    public JobApplicationResponseDTO toDto(JobApplicationEntity entity) {
      JobApplicationResponseDTO dto = new JobApplicationResponseDTO();
      dto.setCompanyName(entity.getJobApplicationPk().getCompanyName());
      dto.setJobTitle(entity.getJobApplicationPk().getJobTitle());
      dto.setApplicationDate(entity.getApplicationDate());
      dto.setApplicationStatus(entity.getApplicationStatus());
      dto.setSalary(entity.getSalary());
      dto.setOffer(entity.getOffer());

      return dto;
    }


}
