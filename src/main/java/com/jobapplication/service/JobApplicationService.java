package com.jobapplication.service;


import com.jobapplication.dto.JobApplicationResponseDTO;

import java.util.List;

public interface JobApplicationService {

  List<JobApplicationResponseDTO> getAllJobApplications();

}
