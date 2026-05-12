package dev.victor.mastersys.specification;

import org.springframework.data.jpa.domain.Specification;
import dev.victor.mastersys.domain.Aluno;
import dev.victor.mastersys.dto.AlunoFiltroRequest;

public class AlunoSpecification {

    public static Specification<Aluno> comFiltros(AlunoFiltroRequest filtro) {
        return Specification.where(nomeContem(filtro.nome()))
                .and(emailContem(filtro.email()))
                .and(telefoneContem(filtro.telefone()))
                .and(cidadeContem(filtro.cidade()))
                .and(estadoIgual(filtro.estado()));
    }

    private static Specification<Aluno> nomeContem(String nome) {
        return (root, query, cb) -> {
            if(nome == null || nome.isEmpty()) {
                return cb.conjunction();
            }
            return cb.like(cb.lower(root.get("nome")), "%" + nome.toLowerCase() + "%");
        };
    }

    private static Specification<Aluno> emailContem(String email) {
        return (root, query, cb) -> {
            if(email == null || email.isEmpty()) {
                return cb.conjunction();
            }
            return cb.like(cb.lower(root.get("email")), "%" + email.toLowerCase() + "%");
        };
    }

    private static Specification<Aluno> telefoneContem(String telefone) {
        return (root, query, cb) -> {
            if(telefone == null || telefone.isEmpty()) {
                return cb.conjunction();
            }
            return cb.like(root.get("telefone"), "%" + telefone + "%");
        };
    }

    private static Specification<Aluno> cidadeContem(String cidade) {
        return (root, query, cb) -> {
            if(cidade == null || cidade.isEmpty()) {
                return cb.conjunction();
            }
            return cb.like(cb.lower(root.get("cidade")), "%" + cidade.toLowerCase() + "%");
        };
    }

    private static Specification<Aluno> estadoIgual(String estado) {
        return (root, query, cb) -> {
            if(estado == null || estado.isEmpty()) {
                return cb.conjunction();
            }
            return cb.equal(cb.upper(root.get("estado")), estado.toUpperCase());
        };
    }
}
 
