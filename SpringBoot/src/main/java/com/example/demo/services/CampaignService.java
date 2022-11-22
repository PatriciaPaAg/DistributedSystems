package com.example.demo.services;

import com.example.demo.classes.Campaign;
import com.example.demo.interfaces.CampaignRepository;
import com.example.demo.services.exceptions.CampaignNotFoundException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class CampaignService {
      @Autowired
      private CampaignRepository campaignRepository;

      public Campaign getCampaign(Integer campaignId) {
        var campaignOptional = campaignRepository.findById(campaignId);
        if(campaignOptional.isPresent()){
            return campaignOptional.get();
        }
        throw new CampaignNotFoundException("No se encontro npd");
      }
      
      public Campaign addCampaign(Campaign campaign){
        return campaignRepository.save(campaign);

      };

//      public List<Campaign> getCampaign(){};

}