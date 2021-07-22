package com.jobapplication.repository;

import com.jobapplication.JobApplication;
import com.jobapplication.model.JobApplicationEntity;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@Sql({"db/migration/init_tests.sql"})
public class JobApplicationRepositoryTest {

    @Autowired
    private JobApplicationRepository jobApplicationRepository;

    @Test
    public void testLoadDataForTestClass() {
        assertEquals(5, jobApplicationRepository.findAll().size());
    }

//    @Test
//    public void givenJobApplicationEntityRepository_whenSaveAndRetreiveEntity_thenOK() {
//        JobApplicationEntity entity1 = jobApplicationRepository
//                .save(new JobApplicationEntity());
//        List<JobApplicationEntity> entityList =  jobApplicationRepository
//                .findAll();
//
//        assertNotNull(entityList);
//        assertEquals(entity1.getJobApplicationPk(), entityList.get(0).getJobApplicationPk());
//    }

//    @Test
//    public void should_find_all_entities() {
//
//        Iterable<JobApplicationEntity> applicationEntities = jobApplicationRepository.findAll();
//
//        int size = 5;
//        assertThat(applicationEntities).hasSize(size);
//    }
}