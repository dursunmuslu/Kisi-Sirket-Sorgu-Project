package com.snmp.snmp.service.impl;

import com.snmp.snmp.dto.CompanyDto;
import com.snmp.snmp.entity.Company;
import com.snmp.snmp.repository.CompanyRepository;
import com.snmp.snmp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    @Override
    public CompanyDto save(CompanyDto companyDto) {
        Company company = new Company();
        company.setName(companyDto.getName());
        company.setEmail(companyDto.getEmail());
        company.setPhone(companyDto.getPhone());
        company.setEmployeeCount(companyDto.getEmployeeCount());
        company.setIndustry(companyDto.getIndustry());

        Company savedCompany = companyRepository.save(company);

        return new CompanyDto(
                savedCompany.getEmail(),
                savedCompany.getEmployeeCount(),
                savedCompany.getName(),
                savedCompany.getPhone(),
                savedCompany.getIndustry()
        );


    }



}
