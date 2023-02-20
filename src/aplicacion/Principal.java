package aplicacion;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        int exponente = sc.nextInt();
        System.out.println("El resultado es: " + dominio.ej2_3_lambda.potencia(base, exponente));
    }
}
