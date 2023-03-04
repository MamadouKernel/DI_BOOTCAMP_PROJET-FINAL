package com.dibootcampfinal.apiecocitoyens.services;

import com.dibootcampfinal.apiecocitoyens.models.Wastes;

import java.util.List;
import java.util.Optional;

public interface WasteService {
    Wastes AddWaste(Wastes wastes);
    List<Wastes> ShowAll();
    Optional<Wastes>Show(Long id);
    Wastes UpdateWaste(Long id,Wastes wastes );
    Wastes DeleteWaste(Long id);
}