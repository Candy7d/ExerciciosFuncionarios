package models;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Setor {

    private Integer codigo;
    private SetorEnum descricao;
}
