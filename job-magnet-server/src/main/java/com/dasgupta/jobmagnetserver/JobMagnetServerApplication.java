package com.dasgupta.jobmagnetserver;

import com.dasgupta.jobmagnetserver.job.Job;
import com.dasgupta.jobmagnetserver.job.JobRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Date;

@SpringBootApplication
public class JobMagnetServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobMagnetServerApplication.class, args);
	}

	@Bean
	@Profile("development")
	public CommandLineRunner seedData(JobRepository jobRepository) {
		return args -> {
			if (jobRepository.count() == 0) {
				Job job1 = new Job();
				job1.setTitle("Software Engineer");
				job1.setDatePosted(new Date());

				Job job2 = new Job();
				job2.setTitle("Data Scientist");
				job2.setDatePosted(new Date());

				jobRepository.save(job1);
				jobRepository.save(job2);
			}
		};
	}
}
