package com.jobapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class JobApplication {

  public static void main(String[] args) {
    SpringApplication.run(JobApplication.class, args);
  }

  public Docket swaggerConfiguration() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .paths(PathSelectors.ant("/api/*"))
        .apis(RequestHandlerSelectors.basePackage("com"))
        .build()
        .apiInfo(apiDetails());
  }

  private ApiInfo apiDetails() {
    return new ApiInfo(
        "Job Application API",
        "Sample API for job application",
        "1.0",
        "Free to use",
        new springfox.documentation.service.Contact("Thanh Tung Nguyen", "https://github.com/tttnguyen9472",
            "tttnguyen.sport@gmail.com"),
        "API License",
        "https://github.com/tttnguyen9472",
        Collections.emptyList());

  }
}
