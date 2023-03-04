package com.dibootcampfinal.apiecocitoyens.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PointOfCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String localisation;
    private String typeOfWaste;
    private Integer storageCapacity;
    private String openingHours;
    @OneToMany(mappedBy = "pointOfCollection", cascade = CascadeType.ALL)
    private List<Collection> collections;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

}
