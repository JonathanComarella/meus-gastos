package com.jonathancomarella.meusgastos.controller;

import com.jonathancomarella.meusgastos.dto.request.UserCreateDTO;
import com.jonathancomarella.meusgastos.dto.response.UserDTO;
import com.jonathancomarella.meusgastos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO userDTO = service.findById(id);
        return ResponseEntity.ok().body(userDTO);
    }

    @PostMapping
    private ResponseEntity<UserDTO> insert(@RequestBody UserCreateDTO userRequest) {
        UserDTO user = service.insert(userRequest);
        return ResponseEntity.ok().body(user);
    }
}
