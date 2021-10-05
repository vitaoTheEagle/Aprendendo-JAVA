package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExempleLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>(); //Ao contrário da lista o Queue garante a rodem dos elementos;

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); //Remove o primeiro elemento;
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //Informa o primeiro elemento da fila;
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        //filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client); //Navega pela lista;
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("----" + iteratorFilaBanco.next()); //Navega pelo metodo;
        }

        System.out.println(filaBanco.size()); //retorna tamanho da lista;
    }
}
