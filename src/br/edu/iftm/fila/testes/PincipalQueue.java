package br.edu.iftm.fila.testes;

import java.util.Queue;
import java.util.LinkedList;

public class PincipalQueue {
    public static void main(String[] args) {

        Queue<Integer> fila =  new LinkedList<Integer>();
        fila.add(1);
        fila.add(3);
        fila.add(2);//enqueue - enfileirar
        System.out.println(fila);
        System.out.println(fila.peek());//espiar
        System.out.println(fila.remove());
        System.out.println(fila);
        System.out.println(fila.remove());//dequeue - desenfileirar
        System.out.println(fila);
        
    }
}
