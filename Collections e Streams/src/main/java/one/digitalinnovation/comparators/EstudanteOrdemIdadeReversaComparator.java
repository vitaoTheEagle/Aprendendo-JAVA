package one.digitalinnovation.comparators;

import java.util.Comparator;//Interface Comparator recebe agora 2 argumentos e serve para ser utilizada na classe externa a classe de dominio;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
