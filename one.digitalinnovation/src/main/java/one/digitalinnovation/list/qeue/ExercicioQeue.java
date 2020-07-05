package one.digitalinnovation.list.qeue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQeue {
    public static void main(String[] args) {
        Queue<String> filaDeBanco = new LinkedList<>();

        /*filaDeBanco.add("Juliana");
        filaDeBanco.add("Pedro");
        filaDeBanco.add("Carlos");
        filaDeBanco.add("Larissa");
        filaDeBanco.add("João");

        for(String cliente:filaDeBanco){
            System.out.println(cliente);
    }
        String primeiroCliente = filaDeBanco.peek();*/
        String primeiroClienteRemovido = filaDeBanco.poll();
        /*filaDeBanco.offer("Daniel");
        System.out.println(filaDeBanco);
        System.out.println(filaDeBanco.size());
        System.out.println(filaDeBanco.isEmpty());
        System.out.println(filaDeBanco.contains("Carlos"));*/
    }
}
