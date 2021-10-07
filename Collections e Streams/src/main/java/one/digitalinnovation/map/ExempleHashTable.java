package one.digitalinnovation.map;

import java.util.Hashtable; //Pode ser utilizado em ambientes onde se tem concorrencia de threds (sincronizado), compartilha dados entre Threads;
import java.util.Map;

public class ExempleHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        //Atualiza um estudante;
        estudantes.put("Pedro", 55);

        System.out.println(estudantes);

        //Remove um estudante no indice 0;
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        //Recupera um estudante no indice 2;
        int idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        //Tamanho do Map;
        System.out.println(estudantes.size());

        //Navega nos registros do Map;
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (String key : estudantes.keySet()) {
            System.out.println(key + " --- " + estudantes.get(key));
        }
    }
}
