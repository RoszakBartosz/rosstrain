package org.roszak.service;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    private TrainName trainName;
    private String timing;
    private RailwayStation station;
}
