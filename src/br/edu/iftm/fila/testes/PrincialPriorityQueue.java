package br.edu.iftm.fila.testes;

import java.util.Queue;

import br.edu.iftm.fila.classes.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PrincialPriorityQueue {

    public static void main(String[] args) {
        
        
        
		Queue<Paciente> filaComPrioridade = new PriorityQueue<Paciente>(
            new Comparator<Paciente>(){

                @Override
                public int compare(Paciente p1, Paciente p2) {
                    return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
                }
                
            }
        );        

        filaComPrioridade.offer(new Paciente("A", 2));        
        filaComPrioridade.offer(new Paciente("C", 1));        
        filaComPrioridade.offer(new Paciente("B", 3));              
        filaComPrioridade.offer(new Paciente("D", 3));        
        filaComPrioridade.offer(new Paciente("E", 1));       
        filaComPrioridade.offer(new Paciente("F", 2));

        //C - E - A - F - D - B 

        System.out.println("Impressão percorrendo a lista");
        for (Paciente paciente : filaComPrioridade) {
            System.out.println(paciente);
        }
        
        System.out.println("Impressão desempilhando a lista");
        while(!filaComPrioridade.isEmpty()){
            System.out.println(filaComPrioridade.poll());
        }

        
    }

}
