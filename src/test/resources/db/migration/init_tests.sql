DROP TABLE IF NOT EXISTS Jobs.job_application;

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

INSERT INTO Jobs.job_application (company_name, job_title, application_date, offer)
VALUES ('Lufthansa', 'Java Developer', '2021-05-06', 1);
INSERT INTO Jobs.job_application (company_name, job_title, application_date, offer)
VALUES ('EPAM', 'Frontend Developer', '2021-05-06', 0);
INSERT INTO Jobs.job_application (company_name, job_title, application_date, offer)
VALUES ('Accenture', 'Full-Stack Developer', '2021-05-04', 1);
INSERT INTO Jobs.job_application (company_name, job_title, application_date, offer)
VALUES ('IBM', 'DevOps Engineer', '2021-05-05', 1);
INSERT INTO Jobs.job_application (company_name, job_title, application_date, offer)
VALUES ('Facebook', 'Frontend Developer', '2021-05-02', 0);
