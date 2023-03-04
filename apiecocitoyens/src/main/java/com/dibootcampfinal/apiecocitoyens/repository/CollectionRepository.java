package com.dibootcampfinal.apiecocitoyens.repository;

import com.dibootcampfinal.apiecocitoyens.models.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<Collection,Long> {
}
