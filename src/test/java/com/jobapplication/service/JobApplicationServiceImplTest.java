package com.jobapplication.service;

import com.jobapplication.dto.JobApplicationResponseDTO;
import com.jobapplication.model.JobApplicationEntity;
import com.jobapplication.model.JobApplicationMapper;
import com.jobapplication.repository.JobApplicationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class JobApplicationServiceImplTest {

  @InjectMocks
  private JobApplicationServiceImpl jobApplicationService;

  @Mock
  private JobApplicationRepository mockJobApplicationRepository;

  @Mock
  private JobApplicationMapper mockJobApplicationMapper;

  @Test
  public void getAllJobApplications() {
    List<JobApplicationEntity> jobApplicationList = new ArrayList<>();
    JobApplicationEntity mockEntity1 = new JobApplicationEntity();
    JobApplicationEntity mockEntity2 = new JobApplicationEntity();
    JobApplicationEntity mockEntity3 = new JobApplicationEntity();
    jobApplicationList.add(mockEntity1);
    jobApplicationList.add(mockEntity2);
    jobApplicationList.add(mockEntity3);

    when(mockJobApplicationRepository.findAll()).thenReturn(jobApplicationList);

    JobApplicationResponseDTO mockDTO1 = new JobApplicationResponseDTO();

    when(mockJobApplicationMapper.toDto(any())).thenReturn(mockDTO1);
    jobApplicationService.getAllJobApplications();
    verify(mockJobApplicationMapper, times(3)).toDto(any());


  }
}