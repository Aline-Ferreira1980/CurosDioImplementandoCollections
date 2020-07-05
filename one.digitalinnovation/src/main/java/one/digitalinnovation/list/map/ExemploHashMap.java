package one.digitalinnovation.list.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeonatoMundialFifa = new HashMap<>();

        campeonatoMundialFifa.put("Brasil", 5);
        campeonatoMundialFifa.put("Alemanha",4);
        campeonatoMundialFifa.put("Itália",4);
        campeonatoMundialFifa.put("Uruguai", 2);
        campeonatoMundialFifa.put("Argentina", 2);
        campeonatoMundialFifa.put("França",2);
        campeonatoMundialFifa.put("Inglaterra",1);
        campeonatoMundialFifa.put("Espanha",1);

        System.out.println(campeonatoMundialFifa);

        //atualiza o valor do Brasil
        campeonatoMundialFifa.put("Brasil",6);
        System.out.println(campeonatoMundialFifa);

        //retorna a Argentina
        System.out.println(campeonatoMundialFifa.get("Argentina"));

        //retorna se existe ou não um campeão na França
        System.out.println(campeonatoMundialFifa.containsKey("França"));

        //remove o campeão França
        campeonatoMundialFifa.remove("França");

        //retorna se tem ou nao um campeão na França
        System.out.println(campeonatoMundialFifa.containsKey("França"));

        //retorna se existe ou não uma seleção hexacampeã
        System.out.println(campeonatoMundialFifa.containsValue(6));

        //retorna o tamanho do Map
        System.out.println(campeonatoMundialFifa.size());

        System.out.println(campeonatoMundialFifa);

        //navega nos registros do mapa
        for (Map.Entry<String,Integer> entry: campeonatoMundialFifa.entrySet()){
            System.out.println(entry.getKey()+ "=="+ entry.getValue());
        }
        for (String key: campeonatoMundialFifa.keySet()){
            System.out.println(key+ "--"+campeonatoMundialFifa.get(key));
        }
        System.out.println(campeonatoMundialFifa);

        //verifica se o mapa contaem a chave Estados Inidos
        System.out.println(campeonatoMundialFifa.containsKey("Estados Unidos"));

        //verifica se o mapa contem o valor 5
        System.out.println(campeonatoMundialFifa.containsValue(5));

        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeonatoMundialFifa.size());

        campeonatoMundialFifa.clear();
        System.out.println(campeonatoMundialFifa.size());


    }
}
