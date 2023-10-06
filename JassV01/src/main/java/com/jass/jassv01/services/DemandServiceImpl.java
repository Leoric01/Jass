package com.jass.jassv01.services;

import com.jass.jassv01.models.Demand;
import com.jass.jassv01.repositories.DemandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemandServiceImpl implements DemandService {
    private final DemandRepository demandRepository;

    @Autowired
    public DemandServiceImpl(DemandRepository demandRepository) {
        this.demandRepository = demandRepository;
    }

    @Override
    public Demand getDemandByNumber(Integer demandNumber) {
        if (demandRepository.findByNumber(demandNumber).isPresent()) {
            return demandRepository.findByNumber(demandNumber).get();
        }
        return null;
    }
}
