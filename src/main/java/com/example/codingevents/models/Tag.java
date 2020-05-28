package com.example.codingevents.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Tag extends AbstractEntity {

    @Size(min = 1, max = 20, message = "Name must be between 1 and 20 characters.")
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public Tag() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
