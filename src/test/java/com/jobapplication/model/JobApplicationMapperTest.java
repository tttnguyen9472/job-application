package com.jobapplication.model;

import com.jobapplication.dto.JobApplicationResponseDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class JobApplicationMapperTest {

  @InjectMocks
  private JobApplicationMapper jobApplicationMapper;

  @Test
  public void toDto() {
    JobApplicationEntity entity = new JobApplicationEntity();
    JobApplicationResponseDTO dto = jobApplicationMapper.toDto(entity);

    assertEquals(dto, jobApplicationMapper.toDto(entity));
  }
}