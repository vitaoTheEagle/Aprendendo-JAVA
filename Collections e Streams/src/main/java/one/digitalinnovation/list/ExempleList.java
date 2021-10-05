package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Carlos"); //Adiciona item a lista;
        names.add("Pedro");
        names.add("Juliana");
        names.add("Anderson");
        names.add("Maria");
        names.add("João");

        names.set(2, "Larissa"); //ALtera valor do indice n;
        System.out.println(names);

        Collections.sort(names); //Ordena em ordem alfabetica;
        System.out.println(names);

        names.remove(4); //Remove valor no indice n;
        System.out.println(names);

        names.remove("João"); //Remove objeto da lista;
        System.out.println(names);

        String name = names.get(1); //Devolve valor no indice n;
        System.out.println(name);

        int length = names.size(); // Retorna Tamanho da lista;
        System.out.println(length);

        boolean hasAnderson = names.contains("Anderson"); //Retorna se um elemento está na lista;
        System.out.println(hasAnderson);

        boolean listaIsEmpty = names.isEmpty(); //retorna se lista esta vazia;
        System.out.println(listaIsEmpty);

        int position = names.indexOf("Carlos"); //Retorna indice do elemento na lista;
        System.out.println(position);

        for (String nameOfItem: names) {
            System.out.println(nameOfItem);
        } //For Each itera todos os items;

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println("---" + iterator.next());
        } //While Itera todos os items;
    }
}
