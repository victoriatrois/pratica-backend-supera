package br.com.banco.service;

import br.com.banco.model.Transacao;
import java.util.List;

public interface TransacaoService {

    List<Transacao> getTodasTransacoes();

    List<Transacao> getTransacoesPorContaBancaria(int contaId);

    List<Transacao> getTransacoesPorPeriodoEOperador(String periodoInicio, String periodoFim, String operador);
}
