import java.util.Scanner;

public class stringAInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hola! Por favor introduce una cadena que represente un numero entero: ");

        String salida = scanner.nextLine();

        try {
            Integer numero = Integer.valueOf(salida);
            System.out.println("El numero entero es: " +numero);
        } catch ( NumberFormatException e) {
            System.out.println("La entrada no es un numero entero, por favor introduce un numero valido.");
        }
        scanner.close();
    }
}
