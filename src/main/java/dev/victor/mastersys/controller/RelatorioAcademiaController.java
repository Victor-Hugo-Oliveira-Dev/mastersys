package dev.victor.mastersys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.victor.mastersys.projection.AlunosPorCidadeProjection;
import dev.victor.mastersys.projection.FaturamentoMensalProjection;
import dev.victor.mastersys.projection.FaturasEmAbertoProjection;
import dev.victor.mastersys.repository.RelatorioAcademiaRepository;

@RequestMapping("/relatorios")
@RestController
public class RelatorioAcademiaController {
    
    private final RelatorioAcademiaRepository relatorioAcademiaRepository;

    public RelatorioAcademiaController(RelatorioAcademiaRepository relatorioAcademiaRepository) {
        this.relatorioAcademiaRepository = relatorioAcademiaRepository;
    }

    @GetMapping("/faturamento-mensal")
    public List<FaturamentoMensalProjection> getFaturamentoMensal() {
        return relatorioAcademiaRepository.faturamentoMensal();
    }

    @GetMapping("/alunos-por-cidade")
    public List<AlunosPorCidadeProjection> getAlunosPorCidade() {
        return relatorioAcademiaRepository.alunosPorCidade();
    }

    @GetMapping("/faturas-em-aberto")
    public List<FaturasEmAbertoProjection> getFaturasEmAberto() {
        return relatorioAcademiaRepository.faturasEmAberto();
    }

}
