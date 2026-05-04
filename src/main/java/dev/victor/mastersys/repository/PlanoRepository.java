package dev.victor.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.victor.mastersys.domain.Planos;

public interface PlanoRepository extends JpaRepository<Planos, Long>{
    
}
