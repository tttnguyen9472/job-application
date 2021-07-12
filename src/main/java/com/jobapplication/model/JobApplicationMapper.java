package com.jobapplication.model;

import com.jobapplication.dto.JobApplicationResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class JobApplicationMapper {

    public JobApplicationResponseDTO toDto(JobApplicationEntity entity) {
        if (entity == null || entity.getJobApplicationPk() == null){
            return new JobApplicationResponseDTO();
        }
      JobApplicationResponseDTO dto = new JobApplicationResponseDTO();

      dto.setCompanyName(entity.getJobApplicationPk().getCompanyName());
      dto.setJobTitle(entity.getJobApplicationPk().getJobTitle());
      dto.setApplicationDate(entity.getApplicationDate());
      dto.setApplicationStatus(entity.getApplicationStatus());
      dto.setSalary(entity.getSalary());
      dto.setOffer(entity.getOffer());

      return dto;
    }

//    TODO objectMapper, modelMapper

}
