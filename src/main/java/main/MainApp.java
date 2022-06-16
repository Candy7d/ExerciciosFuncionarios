package main;

import models.Dependente;
import models.Funcionario;
import models.Setor;
import models.SetorEnum;
import services.FuncionarioService;
import utils.BuildDependente;
import utils.BuildFuncionario;
import utils.BuildSetor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {

        Setor administrativo = BuildSetor.build(1, SetorEnum.ADMINISTRATIVO);
        Setor desenvolvimento = BuildSetor.build(1, SetorEnum.DESENVOLVIMENTO);

        Dependente maria = BuildDependente.build("Maria", LocalDate.of(1993, 3, 7));
        Dependente rafael = BuildDependente.build("Rafael", LocalDate.of(1995, 3, 10));
        Dependente michelangelo = BuildDependente.build("Michelangelo", LocalDate.of(1985, 8, 12));
        Dependente danilo = BuildDependente.build("Danilo", LocalDate.of(1992, 4, 3));
        Dependente maiara = BuildDependente.build("Maiara", LocalDate.of(1969, 8, 11));

        List<Dependente> dependentesDimitri = new ArrayList<>();
        dependentesDimitri.add(maria);
        dependentesDimitri.add(rafael);

        List<Dependente> dependentesThiago = new ArrayList<>();
        dependentesThiago.add(michelangelo);
        dependentesThiago.add(danilo);

        List<Dependente> dependentesFabricio = new ArrayList<>();
        dependentesFabricio.add(maiara);

        Funcionario dimitri = BuildFuncionario.build("Dimitri", "20210102", LocalDate.of(1998, 3, 7), desenvolvimento, dependentesDimitri);
        Funcionario thiago = BuildFuncionario.build("Thiago", "20210103", LocalDate.of(1993, 1, 1), desenvolvimento, dependentesThiago);
        Funcionario fabricio = BuildFuncionario.build("Fabricio", "20210104", LocalDate.of(1992, 4, 24), administrativo, dependentesFabricio);

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(dimitri);
        funcionarios.add(thiago);
        funcionarios.add(fabricio);


        List<Funcionario> funcionariosAdministrativo = FuncionarioService.funcionariosPorSetor(funcionarios, SetorEnum.ADMINISTRATIVO);
        List<Funcionario> funcionariosDesenvolvimento = FuncionarioService.funcionariosPorSetor(funcionarios, SetorEnum.DESENVOLVIMENTO);

        System.out.println("Setor desenvolvimento" + "(" + funcionariosDesenvolvimento.size() + ")" + ": " + funcionariosDesenvolvimento);
        System.out.println("Setor administrativo" + "(" + funcionariosAdministrativo.size() + ")" + ": " + funcionariosAdministrativo);

    }


}

