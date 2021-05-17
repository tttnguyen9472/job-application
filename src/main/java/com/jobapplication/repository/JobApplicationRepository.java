package com.jobapplication.repository;


import com.jobapplication.model.JobApplicationEntity;
import com.jobapplication.model.JobApplicationPk;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobApplicationRepository extends CrudRepository<JobApplicationEntity, JobApplicationPk> {

  List<JobApplicationEntity> findAll();
}
