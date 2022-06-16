package utils;

import models.Dependente;
import models.Funcionario;
import models.Setor;

import java.time.LocalDate;
import java.util.List;

public class BuildFuncionario {

    public static Funcionario build(String nome, String matricula, LocalDate nascimento, Setor setor, List<Dependente> dependentes){
        return Funcionario.builder()
                .nome(nome)
                .matricula(matricula)
                .nascimento(nascimento)
                .setor(setor)
                .dependentes(dependentes)
                .build();
    }
}

