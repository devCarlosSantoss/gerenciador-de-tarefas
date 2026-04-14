package com.devCarlosSantoss.gerenciador_de_tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApi {

    @GetMapping
    private String teste(){
        return "Teste";
    }
}
