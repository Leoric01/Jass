package com.jass.jassv01.repositories;

import com.jass.jassv01.models.Demand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemandRepository extends JpaRepository<Demand, Long> {
    Optional<Demand> findByNumber(Integer number);
}
