package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExempleOptionalStates {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente"); //of não aceita nulo;

        System.out.println("---Valor opcional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null); //ofNullable aceita nulo.

        System.out.println("---Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));

        Optional<String> emptyOptional = Optional.empty(); //Se queremos construir sem valor;

        System.out.println("---Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("---Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));
    }
}
