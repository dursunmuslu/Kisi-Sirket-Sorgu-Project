package com.snmp.snmp.controller;

import com.snmp.snmp.dto.UserDto;
import com.snmp.snmp.entity.Users;
import com.snmp.snmp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto savedUser = userService.save(userDto);

        return ResponseEntity.ok(savedUser);
    }
    @GetMapping("/{username}")
    public List<Users> getUserWithDetails(@PathVariable String username) {
        return userService.findUserWithDetails(username);
    }



}
