package com.example.interviewproject.service;

import com.example.interviewproject.model.Conteudo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ConteudoService {

    public Map<Integer,Conteudo> conteudos = new HashMap<Integer,Conteudo>();

    public Conteudo createConteudo(Conteudo conteudo) throws Exception {


        if(conteudos.isEmpty()){
            conteudos.put(conteudo.getId(),conteudo);
            return conteudo;
        }else{
            for(Conteudo content : conteudos.values()){
                if (!conteudos.containsKey(conteudo.getId())) {
                    conteudos.put(conteudo.getId(),conteudo);
                    return conteudo;
                } else {
                    throw new Exception("Esse ID já existe!");
                }
            }
        }

        return null;
    }


    public Conteudo getConteudo(int id) throws Exception {

        for(Conteudo content : conteudos.values()){
            if (conteudos.containsKey(content)) {
                return conteudos.get(content.getId());
            } else {
                throw new Exception("Esse ID não existe");
            }
        }
        return null;
      }

}
