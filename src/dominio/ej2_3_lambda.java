package dominio;

import java.util.stream.Stream;

public class ej2_3_lambda {
    public static int potencia (int base, int exponente) {

        return Stream.iterate(1, i -> i+1).limit(exponente).reduce(1,(a,b)->a*base);

    }
}
