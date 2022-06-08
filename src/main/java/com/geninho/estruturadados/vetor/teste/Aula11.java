package com.geninho.estruturadados.vetor.teste;


import com.geninho.estruturadados.vetor.Lista;
import com.geninho.estruturadados.vetor.VetorObjetos;

public class Aula11 {
    public static void main(String[] args) {
        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("Nome1","9999999","contato1@email.com");
        Contato c2 = new Contato("Nome2","8888888","contato2@email.com");
        Contato c3 = new Contato("Nome3","7777777","contato3@email.com");

        vetor.adiciona(c1);
    }
}
