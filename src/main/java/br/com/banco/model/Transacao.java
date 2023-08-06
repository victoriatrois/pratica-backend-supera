package br.com.banco.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transferencia")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_transferencia", nullable = false)
    private LocalDateTime dataDaTransacao;

    @Column(name = "valor", nullable = false, precision = 20, scale = 2)
    private BigDecimal valorDaTransacao;

    @Column(name = "tipo", nullable = false)
    private String tipoDaTransacao;

    @Column(name = "nome_operador_transacao")
    private String nomeDoOperador;

    @ManyToOne
    @JoinColumn(name = "conta_id", nullable = false)
    private Conta conta;
}