package one.digitalinnovation.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notaAluno = new HashSet<>();

        notaAluno.add(5.8);
        notaAluno.add(9.3);
        notaAluno.add(6.5);
        notaAluno.add(10.0);
        notaAluno.add(5.4);
        notaAluno.add(7.3);
        notaAluno.add(3.8);
        notaAluno.add(4.0);

        System.out.println(notaAluno);

        //remove nota do set
        notaAluno.remove(3.8);
        System.out.println(notaAluno);

        //retorna a quantidade de itens do set
        System.out.println(notaAluno.size());

        //navega em todos os itens do iterator
        Iterator<Double>iterator = notaAluno.iterator();
        while (iterator.hasNext()){
            System.out.println("==>"+iterator.next());
    }
        for(Double nota: notaAluno){
            System.out.println(nota);
        }
        notaAluno.clear();

        //retorna se o set está vazio
        System.out.println(notaAluno.isEmpty());
    }
}
