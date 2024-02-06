package com.dasgupta.jobmagnetserver;

import com.dasgupta.jobmagnetserver.job.Job;
import com.dasgupta.jobmagnetserver.job.JobRepository;
import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class JobMagnetServerApplication {
    int NUM_RECORDS = 10;

    public static void main(String[] args) {
        SpringApplication.run(JobMagnetServerApplication.class, args);
    }

    @Bean
    @Profile("development")
    public CommandLineRunner seedData(JobRepository jobRepository) {
        Faker faker = new Faker();
        return args -> {
            createJobs(faker, jobRepository);
        };
    }

    private void createJobs(Faker faker, JobRepository jobRepository) {
        if (jobRepository.count() == NUM_RECORDS) {
            return;
        }

        for (int i = 0; i < NUM_RECORDS; ++i) {
            Job job = new Job();
            job.setTitle(faker.company().profession());
            job.setDatePosted(faker.date().past(14, TimeUnit.DAYS));

            jobRepository.save(job);
        }
    }
}
