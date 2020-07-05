package one.digitalinnovation.list.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //monta a arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianóplis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio De Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore;
        System.out.println(treeCapitais.first());

        //retorna a ultima capital no fim da arvore;
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo da arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianóplis"));

        //retorna a primeira capital acima da arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianóplis"));

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore ,removendo do set
        System.out.println(treeCapitais.pollFirst());

        //retorna a primeira captial no final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        //navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()) {
            System.out.println("--->"+iterator.next());
        }
        for (String treeCapitaisNovas:treeCapitais){
            System.out.println(treeCapitaisNovas);
        }



    }
}
