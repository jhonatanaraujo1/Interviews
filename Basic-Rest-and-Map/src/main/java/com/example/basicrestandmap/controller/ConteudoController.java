package com.example.basicrestandmap.controller;

import com.example.basicrestandmap.model.Conteudo;
import com.example.basicrestandmap.service.ConteudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value ="/conteudo")
public class ConteudoController {
    @Autowired
    private ConteudoService conteudoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getConteudo (@PathVariable("id") int id){
        try{
            return ResponseEntity.ok(conteudoService.getConteudo(id));
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createConteudo (@RequestBody Conteudo conteudo)  {
        try {
            conteudoService.createConteudo(conteudo);
        }catch (Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
        return ResponseEntity.created(null).build();
    }
}
