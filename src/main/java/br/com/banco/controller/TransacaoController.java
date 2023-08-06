package br.com.banco.controller;

import br.com.banco.model.Transacao;
import br.com.banco.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transferencias")
public class TransacaoController {

    private final TransacaoService transacaoService;

    @Autowired
    public TransacaoController(TransacaoService transferenciaService) {
        this.transacaoService = transferenciaService;
    }

    @GetMapping("/")
    public List<Transacao> getAllTransferencias() {
        return transacaoService.getTodasTransacoes();
    }

    @GetMapping("/conta/{contaBancariaId}")
    public List<Transacao> getTransferenciasByContaBancaria(@PathVariable int contaId) {
        return transacaoService.getTransacoesPorContaBancaria(contaId);
    }

    @GetMapping("/periodo-operador")
    public List<Transacao> getTransferenciasByPeriodoAndOperador(@RequestParam String periodoInicio,
                                                                     @RequestParam String periodoFim,
                                                                     @RequestParam String operador) {
        return transacaoService.getTransacoesPorPeriodoEOperador(periodoInicio, periodoFim, operador);
    }
}
