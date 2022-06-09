package com.geninho.estruturadados.fila.teste;

import com.geninho.estruturadados.fila.FilaComPrioridade;
import com.geninho.estruturadados.fila.Paciente;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Integer> filaComPrioridade = new PriorityQueue<>();
        filaComPrioridade.add(2);
        filaComPrioridade.add(1);
        System.out.println(filaComPrioridade);

        Queue<Paciente> fila = new PriorityQueue<>();
        fila.add(new Paciente("A",3));
        fila.add(new Paciente("B",2));
        fila.add(new Paciente("C",1));
        System.out.println(fila);
    }
}
