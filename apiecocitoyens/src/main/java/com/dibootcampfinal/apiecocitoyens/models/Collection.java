package com.dibootcampfinal.apiecocitoyens.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime collectionDateTime;
    private String typeOfWasteCollected;
    private Double quantityOfWasteCollected;
    @ManyToOne
    @JoinColumn(name = "point_of_collection_id")
    private PointOfCollection pointOfCollection;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "waste_id", nullable = false)
    private Wastes waste;
    private String collectorName;

}
