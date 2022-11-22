package com.example.demo.services;

import com.example.demo.classes.Campaign;
import com.example.demo.classes.Donation;
import com.example.demo.interfaces.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DonationService {
    @Autowired
    private DonationRepository donationRepository;

    public Donation addDonation(Donation donation, Integer campaignId) {
        CampaignService campaign;
        campaign.getCampaign(campaignId);
        return ;
    }
}