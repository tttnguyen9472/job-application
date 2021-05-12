CREATE TABLE Jobs.job_application
(
    company_name    varchar(16)     not null,
    job_title       varchar(30)     not null,
    application_date    date        not null,
    application_status  varchar(16),
    salary          bigint,
    offer           bit,
    primary key (company_name, job_title)
);

