package dev.victor.mastersys.dto;

public record AlunoFiltroRequest(
    String nome,
    String email,
    String telefone,
    String cidade,
    String estado
) {
    
}
