package com.snmp.snmp.service;

import com.snmp.snmp.dto.UserDto;
import com.snmp.snmp.entity.Users;

import java.util.List;


public interface UserService {
    UserDto save(UserDto userDto);
    List<Users> findUserWithDetails(String username);


}
