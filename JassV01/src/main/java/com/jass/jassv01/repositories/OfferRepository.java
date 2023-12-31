package com.jass.jassv01.repositories;

import com.jass.jassv01.models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
    List<Optional<Offer>> findByNumber(int number);

}
