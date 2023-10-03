package com.jass.jassv01.services;

import com.jass.jassv01.models.Contract;
import org.springframework.stereotype.Service;

@Service
public interface ContractService {
    public boolean numberExists(Integer number);

    public Contract getByNumber(Integer number);
}
