package com.snmp.snmp.service.impl;

import com.snmp.snmp.dto.JobDto;
import com.snmp.snmp.entity.Job;
import com.snmp.snmp.repository.JobRepository;
import com.snmp.snmp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public JobDto saveJob(JobDto jobDto) {
        Job job = new Job();
        job.setId(jobDto.getId());
        job.setPosition(jobDto.getPosition());

        Job savedJob = jobRepository.save(job);

        return new JobDto(
                savedJob.getId(),
                savedJob.getPosition()
        );
    }

    @Override
    public List<JobDto> getAllJobs() {

        List<Job> jobs = jobRepository.findAll();

        return jobs.stream()
                .map(job -> new JobDto(job.getId(), job.getPosition()))
                .collect(Collectors.toList());
    }
}
