package com.jass.jassv01.repositories;

import com.jass.jassv01.models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

    public boolean existsByNumber(Integer number);

    public Optional<Contract> findByNumber(Integer number);
}
