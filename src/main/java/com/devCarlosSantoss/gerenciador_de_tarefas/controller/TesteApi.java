package com.devCarlosSantoss.gerenciador_de_tarefas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApi {

    @GetMapping
    private String teste(){
        return "Teste";
    }

    @GetMapping("/teste")
    public ResponseEntity<String> testeDeString(@RequestParam(name = "nome") String nome){
        return ResponseEntity.ok("Carlos " + nome);
    }
}
