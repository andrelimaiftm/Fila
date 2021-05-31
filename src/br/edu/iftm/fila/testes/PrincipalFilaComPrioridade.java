package br.edu.iftm.fila.testes;

import br.edu.iftm.fila.classes.Paciente;
import br.edu.iftm.fila.estruturadedados.FilaComPrioridade;

public class PrincipalFilaComPrioridade {

    public static void main(String[] args) {
        
        FilaComPrioridade<String> fila1 = new FilaComPrioridade<String>();

        fila1.enfileirar("A");
        fila1.enfileirar("C");
        fila1.enfileirar("B");
        System.out.println(fila1);

        FilaComPrioridade<Paciente> fila2 = new FilaComPrioridade<Paciente>();

        fila2.enfileirar(new Paciente("A", 2));
        fila2.enfileirar(new Paciente("B", 1));
        fila2.enfileirar(new Paciente("D", 1));
        fila2.enfileirar(new Paciente("C", 3));
        fila2.enfileirar(new Paciente("F", 2));
        System.out.println(fila2);
    }  

    
}
