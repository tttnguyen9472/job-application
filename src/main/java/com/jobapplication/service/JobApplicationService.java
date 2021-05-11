package com.jobapplication.service;


import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.model.jobapplication.JobApplicationModel;
import com.jobapplication.model.User;

import java.util.List;

public interface JobApplicationService {

  List<JobApplicationResponseDTO> getAllJobApplicationsByUser(User user);

  List<JobApplicationResponseDTO> jobApplicationToDTO(List<JobApplicationModel> jobApplicationList);

}
