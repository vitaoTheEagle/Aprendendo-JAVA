package one.digitalinnovation.map;

import java.util.HashMap; //Armazena Chave e Valor;
import java.util.Map;

public class ExempleHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adiciona chave e valor;
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor;
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        //Retorna o valor;
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe uma chave;
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove a chave;
        System.out.println(campeoesMundialFifa.remove("França"));

        //Retorna se existe uma chave;
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Retorna se existe um valor;
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho do mapa;
        System.out.println(campeoesMundialFifa.size());

        //Navega nos registros do mapa;
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + "--" + campeoesMundialFifa.get(key));
        }
    }
}
