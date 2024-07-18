import java.util.Scanner;

public class enteroYdecimalValueOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce una cadena que represente un número entero: ");
        String numeroEntero = scanner.nextLine();

        System.out.println("Por favor, introduce una cadena que represente un numero decimal: ");
        String numeroDecimal = scanner.nextLine();

        try {
            Integer entradaEntera = Integer.valueOf(numeroEntero);

            Double entradaDecimal = Double.valueOf(numeroDecimal);

            Double suma = entradaEntera + entradaDecimal;

            System.out.println("La suma de los valores es: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Una o ambas de las entradas no son números válidos. ");
        }
        scanner.close();
    }
}
