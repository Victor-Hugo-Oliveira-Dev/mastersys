package dev.victor.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.victor.mastersys.domain.Modalidade;

public interface ModalidadeRepository extends JpaRepository<Modalidade, Long>{
    
}
