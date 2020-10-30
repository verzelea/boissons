package com.example.boissons;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TypeBoisson {
    @Id
    private int id;
    private String name;
    @OneToMany
    @JoinColumn(name = "type_boisson_id")
    private Set<Boisson> boissons;
}
