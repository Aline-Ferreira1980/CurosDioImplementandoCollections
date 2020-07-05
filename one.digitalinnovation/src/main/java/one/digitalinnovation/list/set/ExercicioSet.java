package one.digitalinnovation.list.set;

import java.util.HashSet;
import java.util.TreeSet;

public class ExercicioSet {
    public static void main(String[] args) {
        TreeSet<Integer> numero=  new TreeSet<>();

        numero.add(3);
        numero.add(88);
        numero.add(20);
        numero.add(44);
        numero.add(3);

        for (int numerolista: numero){
            System.out.println(numerolista);
        }
        System.out.println(numero.pollFirst());

        numero.add(23);
        System.out.println(numero);
        System.out.println(numero.size());
        System.out.println(numero.isEmpty());

    }
}
