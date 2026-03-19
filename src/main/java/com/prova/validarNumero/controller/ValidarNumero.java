package com.prova.validarNumero.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/prova")
@CrossOrigin(origins = "*")
public class ValidarNumero {

    @GetMapping("/validarNumero")
    public Map<String, Object> validarNumero(@RequestParam double numero) {

        Map<String, Object> response = new HashMap<>();

        double restoDivisao = numero % 2;

        String imparPar;
        if (restoDivisao == 0) {
            imparPar = "Par";
        } else {
            imparPar = "Ímpar";
        }

        response.put("restoDivisao", restoDivisao);
        response.put("imparPar", imparPar);

        return response;
    }
}
