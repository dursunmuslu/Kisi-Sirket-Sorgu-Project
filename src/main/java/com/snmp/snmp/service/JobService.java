package com.snmp.snmp.service;

import com.snmp.snmp.dto.JobDto;

import java.util.List;

public interface JobService {

    JobDto saveJob(JobDto jobDto);

    List<JobDto> getAllJobs();
}
