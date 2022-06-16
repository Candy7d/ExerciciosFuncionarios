package utils;

import models.Dependente;
import models.Setor;

import java.time.LocalDate;

public class BuildDependente {

    public static Dependente build(String nome, LocalDate nascimento){
        return Dependente.builder()
                .nome(nome)
                .nascimento(nascimento)
                .build();
    }
}
