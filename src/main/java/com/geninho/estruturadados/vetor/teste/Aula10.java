package com.geninho.estruturadados.vetor.teste;


import com.geninho.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetorObjetos = new VetorObjetos(3);

        Contato c1 = new Contato("Nome1","9999999","contato1@email.com");
        Contato c2 = new Contato("Nome2","8888888","contato2@email.com");
        Contato c3 = new Contato("Nome3","7777777","contato3@email.com");

        vetorObjetos.adiciona(c1);
        vetorObjetos.adiciona(c2);
        vetorObjetos.adiciona(c3);

        System.out.println("Tamanho: " + vetorObjetos.tamanho());
        System.out.println(vetorObjetos);
    }
}
