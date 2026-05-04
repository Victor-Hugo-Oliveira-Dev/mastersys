package dev.victor.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.victor.mastersys.domain.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
    
}
