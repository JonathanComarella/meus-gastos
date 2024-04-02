package com.jonathancomarella.meusgastos.service;

import com.jonathancomarella.meusgastos.dto.request.UserCreateDTO;
import com.jonathancomarella.meusgastos.dto.response.UserDTO;


public interface UserService {

    UserDTO findById(Long id);
    UserDTO insert(UserCreateDTO request);
}
