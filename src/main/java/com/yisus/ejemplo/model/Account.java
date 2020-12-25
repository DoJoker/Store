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
@Table(name="account")
public class Account {

    @Id
    @Column
    private Integer accountId;

    @Column
    private String accountNumber;

    @Column
    private double balance;

}
