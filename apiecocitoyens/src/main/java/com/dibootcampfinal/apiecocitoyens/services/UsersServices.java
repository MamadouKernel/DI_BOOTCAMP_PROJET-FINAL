package com.dibootcampfinal.apiecocitoyens.services;

import com.dibootcampfinal.apiecocitoyens.models.Users;

import java.util.List;
import java.util.Optional;

public interface UsersServices {
    Users AddUser(Users users);
    List<Users> ShowAll();
    Optional<Users> Show(Long id);
    Users UppdateUser(Long id,Users users);
    Users DeleteUser(Long id);
}
