package com.snmp.snmp.repository;

import com.snmp.snmp.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query("SELECT c FROM Company c LEFT JOIN FETCH c.addresses LEFT JOIN FETCH " +
            "c.jobs j LEFT JOIN FETCH j.users WHERE c.name = :companyName")
    List<Company> findCompanyWithEmployees(String companyName);

}
