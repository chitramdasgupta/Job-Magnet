package com.dasgupta.jobmagnetserver.job;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    List<Job> findAll() {
        return StreamSupport.stream(jobRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
