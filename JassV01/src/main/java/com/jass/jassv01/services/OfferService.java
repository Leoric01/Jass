package com.jass.jassv01.services;

import com.jass.jassv01.models.Offer;
import org.springframework.stereotype.Service;

@Service
public interface OfferService {

    void addOffer(Offer offer);

    Offer getOfferByNumber(Integer number);
}
