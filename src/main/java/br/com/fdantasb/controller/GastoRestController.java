package br.com.fdantasb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/gastosRest")
public class GastoRestController {

    @RequestMapping(name = "/incluir")
    public ResponseEntity<String> incluirGasto(){
        return ResponseEntity.ok("Hello!");
    }
}
