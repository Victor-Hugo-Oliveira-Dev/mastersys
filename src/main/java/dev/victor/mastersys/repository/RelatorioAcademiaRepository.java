package dev.victor.mastersys.repository;

import dev.victor.mastersys.domain.FaturaMatricula;
import dev.victor.mastersys.projection.AlunosPorCidadeProjection;
import dev.victor.mastersys.projection.FaturamentoMensalProjection;
import dev.victor.mastersys.projection.FaturasEmAbertoProjection;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.Query;


public interface RelatorioAcademiaRepository extends Repository<FaturaMatricula, Long> {
    
    @Query(value = """
        SELECT 
        TO_CHAR(data_vencimento, 'YYYY-MM') AS mes,
        SUM(valor) as total_faturamento
        FROM faturas_matriculas
        WHERE status = 'PAGA'
        GROUP BY TO_CHAR(data_vencimento, 'YYYY-MM')
        ORDER BY mes
        """,
        nativeQuery = true
    )

    List<FaturamentoMensalProjection> faturamentoMensal();

    @Query(value = """
        SELECT 
            cidade,
            count(*) as quantidade
        FROM alunos 
        GROUP BY cidade
        ORDER BY quantidade desc
        """,
        nativeQuery = true
    )

    List<AlunosPorCidadeProjection> alunosPorCidade();

    @Query(value = """
    SELECT 
        f.id AS faturaId,
        a.nome AS alunoNome,
        a.cidade AS cidade,
        m.id AS matriculaId,
        f.data_vencimento AS dataVencimento,
        f.valor AS valorFatura,
        f.status AS statusFatura
    FROM faturas_matriculas f
    JOIN matriculas m ON f.matricula_id = m.id
    JOIN alunos a ON m.aluno_id = a.id
    WHERE f.status = 'ABERTA'
    ORDER BY f.data_vencimento DESC
    """,
    nativeQuery = true
    )
    List<FaturasEmAbertoProjection> faturasEmAberto();
}
