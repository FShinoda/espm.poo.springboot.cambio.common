package br.espm.springboot.cambio.common.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// Datatypes
import br.espm.springboot.cambio.common.datatype.Cotacao;
import br.espm.springboot.cambio.common.datatype.Moeda;

@FeignClient("cambio-service") // nome vindo do app prop do cambio
public interface CambioController {

    // Devolve a lista de moedas
    @GetMapping("/moedas")
    List<Moeda> listMoedas();

    // Retorna uma cotacao especifica
    @GetMapping("/cotacao/{id}")
    Cotacao getCotacao(String id);
    
    // Retorna a lista de cotacoes de uma moeda
    @GetMapping("/cotacao/{moeda}")
    List<Cotacao> listCotacoes(String moeda);
}
