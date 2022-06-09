package com.geninho.estruturadados.fila.teste;

import com.geninho.estruturadados.fila.FilaComPrioridade;
import com.geninho.estruturadados.fila.Paciente;

import java.util.LinkedList;
import java.util.Queue;

public class Aula24 {
    public static void main(String[] args) {
        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
        fila.enfileira(new Paciente("A",3));
        fila.enfileira(new Paciente("B",2));
        fila.enfileira(new Paciente("C",1));
        System.out.println(fila);
    }
}
