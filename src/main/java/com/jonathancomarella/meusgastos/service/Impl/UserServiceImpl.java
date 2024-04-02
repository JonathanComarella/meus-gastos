package com.jonathancomarella.meusgastos.service.Impl;

import com.jonathancomarella.meusgastos.dto.request.UserCreateDTO;
import com.jonathancomarella.meusgastos.dto.response.UserDTO;
import com.jonathancomarella.meusgastos.model.User;
import com.jonathancomarella.meusgastos.repository.UserRepository;
import com.jonathancomarella.meusgastos.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public UserDTO findById(Long id) {
        Optional<User> user = repository.findById(id);
        if (!user.isPresent()) {
            throw new RuntimeException();
        }

        return modelMapper.map(user.get(), UserDTO.class);
    }

    @Override
    public UserDTO insert(UserCreateDTO request) {
        User user = modelMapper.map(request, User.class);
        user = repository.save(user);
        return modelMapper.map(user, UserDTO.class);
    }
}
