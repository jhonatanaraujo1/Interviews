package com.example.basiclogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicLogicApplication {

    public static void main(String[] args) {
        System.out.println("Chamando o metodo soma 3 valores. " + somaValores(2,4,5));
        System.out.println("Chamando o metodo media de  3 valores. " + mediaValores(2,4,5));
        System.out.println("Chamando o metodo menor numero . " + menorNumero(5,4));
        System.out.println("Chamando o metodo colocando celsion em Fahrenheit. " + transformandoEmF(50));
    }
    public static int somaValores(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public static int mediaValores (int n1, int n2, int n3){
        return  n1 + n2 + n3 /3;
    }

    public static int menorNumero(int n1, int n2){
        return n1 < n2 ? n1: n2;
    }

    public static double transformandoEmF(int n1){
        return n1 *(9.0/5.0) + 32.00;
    }


}
