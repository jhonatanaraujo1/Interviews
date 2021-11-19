package com.example.basicrestandmap.model;

import java.util.List;

public class Conteudo {
    private int id;
    private String titulo;
    private List<Autor> autor;
    private List<Conteudo> relacionados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public List<Conteudo> getRelacionados() {
        return relacionados;
    }

    public void setRelacionados(List<Conteudo> relacionados) {
        this.relacionados = relacionados;
    }
}




