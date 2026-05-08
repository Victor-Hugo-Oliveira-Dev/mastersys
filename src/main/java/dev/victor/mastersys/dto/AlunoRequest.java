package dev.victor.mastersys.dto;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import dev.victor.mastersys.domain.Aluno;
import jakarta.validation.constraints.Size;

public record AlunoRequest( 
    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 150, message = "O nome deve conter no máximo 150 caracteres.")
    String nome,

    @Past(message = "A data de nascimento deve ser no passado.")
    LocalDate dataNascimento,

    @Size(max = 1, message = "O sexo deve conter no máximo 1 caractere.")
    String sexo,

    @Size(max = 20, message = "O telefone deve conter no máximo 20 caracteres.")
    String telefone,

    @Size(max = 20, message = "O celular deve conter no máximo 20 caracteres.")
    String celular,

    @Size(max = 100, message = "O email deve conter no máximo 100 caracteres.")
    String email,

    String observacao,

    @Size(max = 150, message = "O endereço deve conter no máximo 150 caracteres.")
    String endereco,
    
    @Size(max = 10, message = "O número deve conter no máximo 10 caracteres.")
    String numero,

    @Size(max = 100, message = "O complemento deve conter no máximo 100 caracteres.")
    String complemento,

    @Size(max = 100, message = "O bairro deve conter no máximo 100 caracteres.")
    String bairro,

    @Size(max = 100, message = "A cidade deve conter no máximo 100 caracteres.")
    String cidade,

    @Size(max = 2, message = "O estado deve conter no máximo 2 caracteres.")
    String estado,

    @Size(max = 20, message = "O CEP deve conter no máximo 20 caracteres.")
    String cep
    ){
    public Aluno toEntity(){
        Aluno aluno = new Aluno();
        preencher(aluno);
        return aluno;
    }

    public void preencher(Aluno aluno){
        aluno.setNome(nome);
        aluno.setDataNascimento(dataNascimento);
        aluno.setSexo(sexo);
        aluno.setTelefone(telefone);
        aluno.setCelular(celular);
        aluno.setEmail(email);
        aluno.setObservacao(observacao);
        aluno.setEndereco(endereco);
        aluno.setNumero(numero);
        aluno.setComplemento(complemento);
        aluno.setBairro(bairro);
        aluno.setCidade(cidade);
        aluno.setEstado(estado);
        aluno.setCep(cep);
    }

}
