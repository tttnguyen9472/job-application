package com.jobapplication.service;

import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.model.JobApplicationEntity;
import com.jobapplication.model.JobApplicationMapper;
import com.jobapplication.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

  private final JobApplicationRepository jobApplicationRepository;
  private JobApplicationMapper jobApplicationMapper;

  @Autowired
  public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository,
                                   JobApplicationMapper jobApplicationMapper) {
    this.jobApplicationRepository = jobApplicationRepository;
    this.jobApplicationMapper = jobApplicationMapper;
  }

  @Override
  public List<JobApplicationResponseDTO> getAllJobApplications() {
    List<JobApplicationEntity> jobApplicationList = jobApplicationRepository.findAll();
    List<JobApplicationResponseDTO> jobApplicationResponseDTOList = new ArrayList<>();
    for (JobApplicationEntity jobApplicationEntity : jobApplicationList) {
      jobApplicationResponseDTOList.add(jobApplicationMapper.toDto(jobApplicationEntity));
    }
    return jobApplicationResponseDTOList;
  }

}
