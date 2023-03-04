package com.dibootcampfinal.apiecocitoyens.repository;

import com.dibootcampfinal.apiecocitoyens.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
