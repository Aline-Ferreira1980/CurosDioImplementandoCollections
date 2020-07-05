package one.digitalinnovation.list.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2,"Roberto");
        String nome = nomes.get(1);

        nomes.remove(4);
        nomes.remove("João");
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.contains("Juliano");
        System.out.println(nomes);

        List<String> acrescenta = new ArrayList<>();
        acrescenta.add("Ismael");
        acrescenta.add("Rodrigo");

        nomes.addAll(acrescenta);
        System.out.println(nomes);
        for (String nomeDoItem:nomes){
            System.out.println("-->"+nomeDoItem);
        }

        Collections.sort(nomes);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);
    }
}
