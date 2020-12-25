package com.yisus.ejemplo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="movement")
public class Movement {

    @Id
    @Column
    private Integer movementId;

    @Column
    private String name;
}
