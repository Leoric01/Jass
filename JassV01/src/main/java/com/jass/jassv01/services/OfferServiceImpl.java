package com.jass.jassv01.services;

import com.jass.jassv01.models.Offer;
import com.jass.jassv01.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService {

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
        List<Optional<Offer>> offers = offerRepository.findByNumber(number);

        if (!offers.isEmpty()) {
            return offers.get(0).get();
        } else {
            return null;
        }
    }
}
