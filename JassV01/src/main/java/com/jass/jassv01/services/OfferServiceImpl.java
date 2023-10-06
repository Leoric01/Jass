package com.jass.jassv01.services;

import com.jass.jassv01.models.Offer;
import com.jass.jassv01.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService{

    private final OfferRepository offerRepository;
    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public void addOffer(Offer offer) {
        offerRepository.save(offer);
    }

    @Override
    public Offer getOfferByNumber(Integer number) {
        if (offerRepository.findByNumber(number).isPresent()){
            return offerRepository.findByNumber(number).get();
        }
        return null;
    }
}
