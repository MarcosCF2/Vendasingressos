package java.br.edu.famper.vendasingressos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cliente", length = 50)
    private long cliente;

    @Column(name = "evento", length = 100)
    private String Evento;


    @Column(name= "ingresso", length = 100)
    private String Indresso;

    @Column(name = "local", length = 50)
    private String Local;

    @Column(name = "pagamento")
    private String Pagamento;


}
