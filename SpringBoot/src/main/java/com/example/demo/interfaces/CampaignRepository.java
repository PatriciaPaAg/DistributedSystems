package com.example.demo.interfaces;
import com.example.demo.classes.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Integer>{
    
}