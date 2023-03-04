package com.dibootcampfinal.apiecocitoyens.repository;

import com.dibootcampfinal.apiecocitoyens.models.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert,Long> {
}
