package com.jobapplication.repository;


import com.jobapplication.model.jobapplication.JobApplicationModel;
import com.jobapplication.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobApplicationRepository extends CrudRepository<JobApplicationModel, String> {

  List<JobApplicationModel> findAllByUser(User user);
}
