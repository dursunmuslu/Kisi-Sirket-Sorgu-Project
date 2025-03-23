package com.snmp.snmp.controller;

import com.snmp.snmp.dto.CompanyDto;
import com.snmp.snmp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/create")
    public ResponseEntity<CompanyDto> saveCompany(@RequestBody CompanyDto companyDto) {
        CompanyDto savedCompany = companyService.save(companyDto);
        return ResponseEntity.ok().body(savedCompany);
    }


}
