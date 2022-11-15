package com.example.demo.classes;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Campaign {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private double donationMinimum;
    private double targetAmount;
    
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="name", column = @Column(name="accountName"))
    })
    private Account account = new Account();
    // private Account account;

    @OneToMany(mappedBy = "campaign", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Donation> donations = new LinkedList<Donation>();

    public Integer id(){
        return id;
    };

    public String getName(){
        return name;
    };

    public double getDonationMinimum(){
        return donationMinimum;
    };

    public double getTargetAmount(){
        return targetAmount;
    };

}
