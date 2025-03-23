package com.snmp.snmp.controller;
import com.snmp.snmp.dto.JobDto;
import com.snmp.snmp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping("/create")
    public JobDto createJob(@RequestBody JobDto jobDto) {
        return jobService.saveJob(jobDto);
    }

    @GetMapping("jobs")
    public List<JobDto> getAllJobs() {
        return jobService.getAllJobs();
    }
}
