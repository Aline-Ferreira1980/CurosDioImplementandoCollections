package one.digitalinnovation.list.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> treeCapitais = new TreeMap<>();
        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG","Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstKey());

        //retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastKey());

        //retorna a primeira capital abaixo da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //retorna a primeira capital acima da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey()+"-"+treeCapitais.firstEntry().getValue());

        //retorna a última capital no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey() + "--"+ treeCapitais.lastEntry().getValue());

        //retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + "-"+ treeCapitais.lowerEntry("SC").getValue());

        //retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitais.higherEntry("SC").getKey()+ "--"+ treeCapitais.higherEntry("SC").getValue());

        System.out.println(treeCapitais);


        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry = treeCapitais.pollLastEntry();

        //retorna a primeira capital no topo da arvore removendo o map
        System.out.println(firstEntry.getKey()+"--" + firstEntry.getValue());

        //retorna a ultima capital no final da arvore removendo o map
        System.out.println(lastEntry.getKey()+"-" + lastEntry.getValue());


        System.out.println(treeCapitais);

        //navega em todas as chaves do iterator
        Iterator<String>iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String capital :treeCapitais.keySet()){
            System.out.println(capital + "--"+ treeCapitais.get(capital));
        }

        for (Map.Entry<String,String>capital :treeCapitais.entrySet()){
            System.out.println(capital.getKey()+ "-"+ capital.getValue());
        }




    }
}
