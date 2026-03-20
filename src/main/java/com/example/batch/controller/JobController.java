package com.example.batch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api")
public class JobController {
    private final JobLauncher jobLauncher;
    private final Job job;

    public JobController(JobLauncher jobLauncher, Job job) {
        this.jobLauncher = jobLauncher;
        this.job = job;
    }

    @GetMapping("/run-job")
    public String runJob() throws Exception {

        JobParameters params = new JobParametersBuilder()
                .addLong("startTime", System.currentTimeMillis()) // garante unicidade
                .toJobParameters();

        JobExecution execution = jobLauncher.run(job, params);

        return "Job Status: " + execution.getStatus();
    }
}
