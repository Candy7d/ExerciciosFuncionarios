package utils;

import models.Setor;
import models.SetorEnum;

public class BuildSetor {

    public static Setor build(Integer codigo, SetorEnum setor){
        return Setor.builder()
                .codigo(codigo)
                .descricao(setor)
                .build();
    }
}
