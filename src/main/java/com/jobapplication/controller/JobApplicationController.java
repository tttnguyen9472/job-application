package com.jobapplication.controller;

import com.jobapplication.dto.JobApplicationResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface JobApplicationController {

  ResponseEntity<List<JobApplicationResponseDTO>> listAllJobApplications();
}
