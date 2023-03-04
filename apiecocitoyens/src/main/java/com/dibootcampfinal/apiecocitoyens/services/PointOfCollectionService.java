package com.dibootcampfinal.apiecocitoyens.services;

import com.dibootcampfinal.apiecocitoyens.models.PointOfCollection;

import java.util.List;
import java.util.Optional;

public interface PointOfCollectionService {
    PointOfCollection AddPointofcollection(PointOfCollection pointOfCollection);
    List<PointOfCollection> ShowAll();
    Optional<PointOfCollection> Show(Long id);
     PointOfCollection UpdatePointofcollection(Long id,PointOfCollection pointOfCollection);
     PointOfCollection DeletePointofcollection(Long id);
}
