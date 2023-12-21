package org.roszak.service;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Routes {

    @GeneratedValue
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private TrainName trainName;
    private String timing;
    @Enumerated(EnumType.STRING)
    private RailwayStation station;
}
