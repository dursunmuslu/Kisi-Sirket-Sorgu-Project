package com.snmp.snmp.service.impl;

import com.snmp.snmp.dto.UserDto;
import com.snmp.snmp.entity.Users;
import com.snmp.snmp.repository.UserRepository;
import com.snmp.snmp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto save(UserDto userDto) {
        Users users = new Users();
        users.setUsername(userDto.getUsername());
        users.setEmail(userDto.getEmail());
        users.setPhone(userDto.getPhone());

        Users savedUser = userRepository.save(users);

        return new UserDto(
                savedUser.getUsername(),
                savedUser.getPhone(),
                savedUser.getEmail()
        );
    }

    @Override
    public List<Users> findUserWithDetails(String username) {
        return userRepository.findUserWithDetails(username);
    }

}
