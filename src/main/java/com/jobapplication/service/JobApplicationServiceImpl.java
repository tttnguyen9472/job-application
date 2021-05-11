package com.jobapplication.service;

import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.model.jobapplication.JobApplicationModel;
import com.jobapplication.model.User;
import com.jobapplication.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

  private final JobApplicationRepository jobApplicationRepository;

  @Autowired
  public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository) {
    this.jobApplicationRepository = jobApplicationRepository;
  }


  @Override
  public List<JobApplicationResponseDTO> getAllJobApplicationsByUser(User user) {
    return jobApplicationToDTO(jobApplicationRepository.findAllByUser(user));
  }

  @Override
  public List<JobApplicationResponseDTO> jobApplicationToDTO(List<JobApplicationModel> jobApplicationList) {
    return jobApplicationList.stream()
        .map(j -> new JobApplicationResponseDTO(j.getCompanyName(), j.getJobTitle(), j.getApplicationDate(),
            j.getApplicationStatus(), j.getSalary(), j.getOffer())).collect(
            Collectors.toList());
  }
}
