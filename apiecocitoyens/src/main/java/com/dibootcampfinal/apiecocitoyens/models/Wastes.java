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
public class Wastes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String wasteType;
    private String category;
    private String treatmentInformation;
    private Double weight;
    @OneToMany(mappedBy = "waste", cascade = CascadeType.ALL)
    private List<Collection> collections;

}
