package com.jobapplication.controller;

import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobApplicationControllerImpl implements JobApplicationController {

  private final JobApplicationService jobApplicationService;

  @Autowired
  public JobApplicationControllerImpl(JobApplicationService jobApplicationService) {
    this.jobApplicationService = jobApplicationService;
  }

  @GetMapping("/job_applications")
  public ResponseEntity<List<JobApplicationResponseDTO>> listAllJobApplications() {
    return ResponseEntity.ok(jobApplicationService.getAllJobApplications());
  }
}
