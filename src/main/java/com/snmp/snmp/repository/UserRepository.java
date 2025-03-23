package com.snmp.snmp.repository;

import com.snmp.snmp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    @Query("SELECT u FROM Users u LEFT JOIN FETCH u.addresses LEFT JOIN FETCH u.jobs " +
            "j LEFT JOIN FETCH j.company WHERE u.username = :username")
    List<Users> findUserWithDetails(String username);
}
