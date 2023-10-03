package com.jass.jassv01.services;

import com.jass.jassv01.models.Contract;
import com.jass.jassv01.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements ContractService{
    private final ContractRepository contractRepository;

    @Autowired
    public ContractServiceImpl(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public boolean numberExists(Integer number) {
        return contractRepository.existsByNumber(number);
    }

    @Override
    public Contract getByNumber(Integer number) {
        if (contractRepository.findByNumber(number).isPresent()){
            return contractRepository.findByNumber(number).get();
        }
        return null;
    }


}
