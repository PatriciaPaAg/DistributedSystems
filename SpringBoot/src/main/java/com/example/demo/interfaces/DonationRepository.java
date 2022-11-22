package com.example.demo.interfaces;
import com.example.demo.classes.Campaign;
import com.example.demo.classes.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Campaign, Integer>{
    
}