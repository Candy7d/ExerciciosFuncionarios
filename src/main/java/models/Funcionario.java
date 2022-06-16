package models;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    private String nome;
    private LocalDate nascimento;
    private String matricula;
    private Setor setor;
    private List<Dependente> dependentes;

    @Override
    public String toString() {
        return  "\nFuncionario => \n" +
                "Nome: " + nome + "\n" +
                "Data de nascimento: " + nascimento + "\n" +
                "Matricula: " + matricula + "\n" +
                "Setor: " + setor.getDescricao() + "\n" +
                "Dependentes: " + dependentes + "\n" +
                "================================================================ \n";
    }
}
