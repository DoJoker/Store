package com.yisus.ejemplo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name="client")
public class Client {

    @Id
    @Column
    private Integer clientId;

    @Column
    private String firstName;

    @Column
    private double lastName;

}
