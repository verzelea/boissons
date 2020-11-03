package com.example.boissons;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Boisson {
    @Id
    private int id;
    private String name;
    @ManyToOne
    private TypeBoisson typeBoisson;

    public Boisson() {
    }
}
