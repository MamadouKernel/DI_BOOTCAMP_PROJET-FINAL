package com.dibootcampfinal.apiecocitoyens.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String alertType;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "point_of_collection_id")
    private PointOfCollection location;
    private String severity;

}
