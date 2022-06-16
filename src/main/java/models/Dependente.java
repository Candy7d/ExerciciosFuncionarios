package models;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dependente {

    private String nome;
    private LocalDate nascimento;
}





//2 – Crie um projeto Java com seu nome. Nele desenvolva um programa que seja capaz de manter
//informações de funcionários de uma empresa. Saiba que um funcionário possui nome, nascimento,
//matrícula, setor e uma lista de dependentes.Cada dependente possui nome e nascimento. Cada
//setor possui um código e uma descrição.
//2.1 – Crie uma estrutura, a seu critério, que gere sua própria massa de dados para a
//realização de testes.
//2.2 – Crie uma funcionalidade para listar funcionários por setor com seus respectivos
//dependentes, apresentando para cada setor um totalizador de quantidade de funcionários alocados.
//A listagem deve ser exibida ordenada pelo nome do funcionário.
//Nesse projeto implemente tudo o que você já aprendeu, desde design patterns a boas práticas.
//Bônus: Utilize os padrões de projeto Singleton e/ou Factory em sua implementação, se for cabível.
//OBS:
//● Os dados do programa devem ser armazenados apenas em memória;
//● Todas as informações devem ser exibidas no console da IDE;
//● Não é necessário realizar conexão com SGBD;
//● Pode utilizar libs a partir do maven ou se quiser importar direto no projeto;
//● Utilize a IDE que lhe for conveniente.