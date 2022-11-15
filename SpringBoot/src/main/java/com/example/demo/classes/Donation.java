package com.example.demo.classes;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Donation {
    @Id
    @GeneratedValue
    private Integer id;

    private double amount;
    private boolean receitRequested;
    private String donorName;

    @Embedded
    private Account account = new Account();

    @ManyToOne
    private Campaign campaign;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Integer id(){
        return id;
    };

    public double getAmount(){
        return amount;
    };
    
    public boolean getReceitRequested(){
        return receitRequested;
    };

    public String getDonorName(){
        return donorName;
    };

    public Status getStatus(){
        return status;
    }

}
