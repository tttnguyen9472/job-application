package com.jobapplication.service;


import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.model.jobapplication.JobApplicationEntity;

import java.util.List;

public interface JobApplicationService {

  List<JobApplicationResponseDTO> getAllJobApplications();

}
