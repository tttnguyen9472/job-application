package com.jobapplication.controller;

import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.model.User;
import com.jobapplication.service.JobApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobApplicationController {

  private final JobApplicationServiceImpl jobApplicationService;

  @Autowired
  public JobApplicationController(JobApplicationServiceImpl jobApplicationService) {
    this.jobApplicationService = jobApplicationService;
  }

  @GetMapping("/job_applications")
  public ResponseEntity<List<JobApplicationResponseDTO>> listAllJobApplications(User user){
return ResponseEntity.ok(jobApplicationService.getAllJobApplicationsByUser(user));
  }
}
