package com.jobapplication.repository;


import com.jobapplication.model.JobApplicationEntity;
import com.jobapplication.model.JobApplicationPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobApplicationRepository extends CrudRepository<JobApplicationEntity, JobApplicationPk> {

  List<JobApplicationEntity> findAll();
}
