package com.geninho.estruturadados.pilha;

import com.geninho.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super(10);
    }
    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha (T elemento){
        super.aumentaCapacidade();
        super.adiciona(elemento);
    }

    public T desempilha(){
        if (this.estaVazia()){
            return null;
        }

        T elemento = this.elementos[tamanho-1];
        tamanho--;
        return elemento;
    }
}
