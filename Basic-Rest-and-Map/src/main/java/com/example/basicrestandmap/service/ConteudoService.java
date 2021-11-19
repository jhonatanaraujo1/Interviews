package com.example.basicrestandmap.service;

import com.example.basicrestandmap.model.Conteudo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConteudoService {
    private Map<Integer, Conteudo> conteudos = new HashMap<>();

    public Conteudo createConteudo(Conteudo conteudo) throws Exception {
        if (!conteudos.containsKey(conteudo.getId())) {
            conteudos.put(conteudo.getId(), conteudo);
            return conteudo;
        } else {
            throw new Exception("Esse ID já existe!");
        }
    }

    public Conteudo getConteudo(int id) throws Exception {
        if (conteudos.containsKey(id)) {
            return conteudos.get(id);
        } else {
            throw new Exception("Esse ID não existe");
        }
    }
}
