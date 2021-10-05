package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExempleVector {
    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        //Adiciona 4 esportes no vetor;
        sports.add("Futebol");
        sports.add("Basquete");
        sports.add("Tênis");
        sports.add("Handbol");
        System.out.println(sports);

        //altera o valor da posição 2;
        sports.set(2, "Ping Pong");

        //Remove o sport da posição 2;
        sports.remove(2);

        //Remove o sport Handebol;
        sports.remove("Handebol");

        //Retorna o primeiro item do vetor;
        System.out.println(sports.get(0));

        //Navega nos sports;
        for (String sport: sports) {
            System.out.println(sport);
        }
    }
}
