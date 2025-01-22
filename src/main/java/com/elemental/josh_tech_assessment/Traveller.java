package com.elemental.josh_tech_assessment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Traveller {

    private @Id @GeneratedValue Long generatedId;
    private String uuid;
    private String id;
    private String name;
    private String likes;
    private String transport;
    private String avgSpeed;
    private String topSpeed;
}
