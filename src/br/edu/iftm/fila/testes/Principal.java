package br.edu.iftm.fila.testes;

import br.edu.iftm.fila.estruturadedados.Fila;

public class Principal {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>();
        System.out.println("A lista esta vazia? " + fila.estaVazia());
        System.out.printf("O tamanho da lista é %d \n", fila.tamanho());
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");        
        System.out.println("A lista esta vazia? " + fila.estaVazia());
        System.out.printf("O tamanho da lista é %d \n", fila.tamanho());
        System.out.println(fila);
        System.out.printf("O primeira elemento da lista é : %s \n",fila.espiar());
        String valor = fila.desenfileira();
        System.out.printf("O valor desenfileirado foi: %s \n", valor);
        System.out.println("A lista esta vazia? " + fila.estaVazia());
        System.out.printf("O tamanho da lista é %d \n", fila.tamanho());
        System.out.println(fila);
        System.out.printf("O primeira elemento da lista é : %s \n",fila.espiar());
    }
}
