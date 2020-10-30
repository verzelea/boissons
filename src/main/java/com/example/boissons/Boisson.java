package com.example.boissons;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Boisson {
    @Id
    private int id;
    private String name;

    public Boisson() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
