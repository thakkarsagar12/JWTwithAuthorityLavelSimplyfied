package com.usecase.usercasefinal.repository;

import com.usecase.usercasefinal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);

    User findUserByUsername(String username);

    @Transactional
    boolean deleteUserByUsername(String username);
}
