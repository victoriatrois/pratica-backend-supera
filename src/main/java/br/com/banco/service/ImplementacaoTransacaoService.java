package br.com.banco.service;

import br.com.banco.model.Transacao;
import br.com.banco.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplementacaoTransacaoService implements TransacaoService {
    private final TransacaoRepository transacaoRepository;

    @Autowired
    public ImplementacaoTransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @Override
    public List<Transacao> getTodasTransacoes() {
        return transacaoRepository.findAll();
    }

    @Override
    public List<Transacao> getTransacoesPorContaBancaria(int contaId) {
        return transacaoRepository.findByIdDaConta(contaId);
    }

    @Override
    public List<Transacao> getTransacoesPorPeriodoEOperador(String periodoInicio, String periodoFim, String operador) {
        return transacaoRepository.findByDataDaTransacaoBetweenAndNomeDoOperador(periodoInicio, periodoFim, operador);
    }
}
