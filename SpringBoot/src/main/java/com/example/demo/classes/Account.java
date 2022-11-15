package com.example.demo.classes;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Account {
    @Id
    @GeneratedValue
    private Integer id;

    private String iban;
    private String name;
    private String nameOfBank;

    public String getIban(){
        return iban;
    };

    public String getName(){
        return name;
    }

    public String getNameOfBank(){
        return nameOfBank;
    }


}
