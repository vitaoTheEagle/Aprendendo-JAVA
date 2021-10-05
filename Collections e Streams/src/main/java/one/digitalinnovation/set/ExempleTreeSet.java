package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet; //Ordem de arvore; Ordem de insercao nao é mantida; Permite alteração de ordem;

public class ExempleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Monta a arvore com as capitais;
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis ");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore;
        System.out.println(treeCapitais.first());

        //Retorna a ultima capital no final da arvore;
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo na arvore da capital;
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima na arvore da capital;
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Exibe todas as capitais;
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore, remove do set;
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da arvore, remove do set;
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        //Navega em todos os itens;
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()) {
            System.out.println("---" + iterator.next());
        }

    }
}
