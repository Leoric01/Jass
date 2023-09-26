package com.jass.jassv01.repositories;

import com.jass.jassv01.models.Crane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CraneRepository extends JpaRepository<Crane, Long> {
}
