package com.dibootcampfinal.apiecocitoyens.services;

import com.dibootcampfinal.apiecocitoyens.models.Collection;

import java.util.List;
import java.util.Optional;

public interface CollectionService {
    Collection AddCollection(Collection collection);
    List<Collection> ShowAll();
    Optional<Collection> Show(Long id);
    Collection UpdateCOllection(Long id,Collection collection);
    Collection DeleteCollection(Long id);
}
