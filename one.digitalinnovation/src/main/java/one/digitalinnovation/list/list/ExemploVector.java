package one.digitalinnovation.list.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();


        //adiciona 4 esportes no vector
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de Mesa");
        esportes.add("Handbol");
        System.out.println(esportes);

        //altera o valor da posição 2
        esportes.set(2,"Ping Pong");
        System.out.println(esportes);
        //remove o esporte da posição 2
        esportes.remove(2);
        System.out.println(esportes);
        //remove o esporte do vetor
        esportes.remove("Handbol");

        //retorna o 1º item do vetor
        System.out.println(esportes.get(0));

        //navega nos esportes
        for (String esporte : esportes){
            System.out.println(esporte);
        }
    }
}
