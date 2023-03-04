package com.dibootcampfinal.apiecocitoyens.services;

import com.dibootcampfinal.apiecocitoyens.models.Alert;

import java.util.List;
import java.util.Optional;

public interface AlertService {
    Alert AddAlert(Alert alert);
    List<Alert> ShowAll();
    Optional<Alert> Show(Long id);
    Alert UpdateAlert(Long id,Alert alert);
    Alert DeleteAlert(Long id);
}
