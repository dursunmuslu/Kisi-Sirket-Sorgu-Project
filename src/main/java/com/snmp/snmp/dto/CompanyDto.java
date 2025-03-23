package com.snmp.snmp.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {

    private int id;

    private String name;
    private String industry;
    private String phone;
    private String email;
    private int employeeCount;

    public CompanyDto(String email, int employeeCount, String name, String phone, String industry) {
        this.email = email;
        this.employeeCount = employeeCount;
        this.name = name;
        this.phone = phone;
        this.industry = industry;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
