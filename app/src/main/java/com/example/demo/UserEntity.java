package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
