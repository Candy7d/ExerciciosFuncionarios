package services;

import models.Funcionario;
import models.SetorEnum;

import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioService {

    public static List<Funcionario> funcionariosPorSetor(List<Funcionario> funcionarios, SetorEnum setor) {
        List<Funcionario> funcionariosFiltro = funcionarios.stream().filter(f -> f.getSetor().getDescricao() == setor).collect(Collectors.toList());
        funcionariosFiltro.sort((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
        return funcionariosFiltro;
    }

}
