package one.digitalinnovation.list.list;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String>nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        nomes.set(2,"Larissa"); // alterou a posição com outro objeto
        System.out.println(nomes);

        Collections.sort(nomes); // ordena por ordem alfabetica
        nomes.set(2,"Wesley");  //acrescenta um objeto à posição
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley"); //altera elemento da posição
        System.out.println(nomes);

        String nome = nomes.get(3); //retorna o elemento da posição, caso não exista o elemento retornará um numero negativo.
        System.out.println(nome);

        int posicao= nomes.indexOf("Carlos"); // mostra a posição do elemento dentro do array;
        System.out.println(posicao);

        int tamanho = nomes.size(); // tamanho do array
        System.out.println(tamanho);

        nomes.remove("Larissa"); //remove por indice ou por elemento
        System.out.println(nomes);

        tamanho = nomes.size(); // retorna o tamanho do array/lista
        System.out.println(tamanho);

        for (String nomeDoItem:nomes){
            System.out.println("-->"+nomeDoItem);
        }

        Iterator<String> iterator= nomes.iterator(); // retorna booleano true ou false
        while (iterator.hasNext()){
            System.out.println("==>>"+iterator.next()); // retorna o eleento que está na lista //
        }
        boolean listaestavazia = nomes.isEmpty();
        System.out.println(nomes);
        nomes.clear();
        System.out.println(nomes);


    }
}
