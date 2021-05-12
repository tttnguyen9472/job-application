package com.jobapplication.service;

import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.model.jobapplication.JobApplicationEntity;
import com.jobapplication.model.jobapplication.JobApplicationMapper;
import com.jobapplication.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

  private final JobApplicationRepository jobApplicationRepository;

  @Autowired
  public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository) {
    this.jobApplicationRepository = jobApplicationRepository;
  }

  @Override
  public List<JobApplicationResponseDTO> getAllJobApplications() {
    List<JobApplicationEntity> jobApplicationList = jobApplicationRepository.findAll();
    List<JobApplicationResponseDTO> jobApplicationResponseDTOList = new ArrayList<>();
    for (JobApplicationEntity jobApplicationEntity : jobApplicationList) {
      jobApplicationResponseDTOList.add(new JobApplicationMapper().toDto(jobApplicationEntity));
    }
    return jobApplicationResponseDTOList;
  }

}
