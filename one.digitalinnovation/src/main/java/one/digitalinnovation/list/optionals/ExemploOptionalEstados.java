package one.digitalinnovation.list.optionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of ("Valor Presente");

        System.out.println("Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println,()->System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, ()-> System.out.println("null = não está presente"));

        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        optionalEmpty.ifPresentOrElse(System.out::println, ()-> System.out.println("Empty não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPoiterExceptional");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro= não está presente"));



    }
}
