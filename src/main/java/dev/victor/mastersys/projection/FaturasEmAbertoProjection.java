package dev.victor.mastersys.projection;

import java.math.BigDecimal;

public interface FaturasEmAbertoProjection {
    Long getMatriculaId();
    String getAlunoNome();
    String getDataVencimento();
    BigDecimal getValor();
}
