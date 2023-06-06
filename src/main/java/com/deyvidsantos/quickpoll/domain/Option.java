package com.deyvidsantos.quickpoll.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Option {
    
    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private Long id;

    @Column(name = "OPTION_VALUE")
    private String value;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
