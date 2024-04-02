package com.jonathancomarella.meusgastos.repository;

import com.jonathancomarella.meusgastos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
