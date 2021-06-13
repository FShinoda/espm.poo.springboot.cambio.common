package br.espm.springboot.cambio.common.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

// Datatypes
import br.espm.springboot.cambio.common.datatype.Cotacao;
import br.espm.springboot.cambio.common.datatype.Moeda;

@FeignClient("cambio-service") // nome vindo do app prop do cambio
public interface CambioController {

    // Devolve a lista de moedas
    @GetMapping("/moedas")
    List<Moeda> listMoedas();

    // Devolve moeda especifica
    @GetMapping("/moedas/{simbolo}")
    Moeda listMoedas(@PathVariable String simbolo);

    // Retorna uma cotacao especifica
    @GetMapping("/cotacao/{id}")
    Cotacao getCotacao(@PathVariable String id);

    // Retorna uma cotacao por simbolo e data
    @GetMapping("/cotacao/{simbolo}/{data}")
    Cotacao cotacao(@PathVariable String simbolo, @PathVariable String data);
    
    // Retorna a lista de cotacoes 
    @GetMapping("/cotacao")
    List<Cotacao> listCotacoes(
        @RequestParam String moeda, 
        @RequestParam String ini, 
        @RequestParam String fim
    );
}
