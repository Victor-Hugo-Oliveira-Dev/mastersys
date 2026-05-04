package dev.victor.mastersys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.victor.mastersys.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
    
}
