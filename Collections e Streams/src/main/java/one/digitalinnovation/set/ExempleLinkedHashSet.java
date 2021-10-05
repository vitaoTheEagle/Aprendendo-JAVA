package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet; //Mantem ordem de insercao;

public class ExempleLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona os numeros no set;
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(10);
        System.out.println(sequenciaNumerica);

        //Remove o numero do set;
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens do set;
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os items;
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println("---" + iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("----->" + numero);
        }

        //Retorna se o set esta vazio ou nao;
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
