package com.sha.spring_boot_device_seller.service;

import com.sha.spring_boot_device_seller.model.Role;
import com.sha.spring_boot_device_seller.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
        //
    void changeRole(Role newRole, String username);
}
