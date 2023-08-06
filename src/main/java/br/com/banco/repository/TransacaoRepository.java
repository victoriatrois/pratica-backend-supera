package br.com.banco.repository;

import br.com.banco.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findByIdDaConta(int contaId);

    List<Transacao> findByDataDaTransacaoBetweenAndNomeDoOperador(String periodoInicio, String periodoFim, String operador);

}
