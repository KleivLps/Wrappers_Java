import java.util.Scanner;

public class stringADouble {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Por favor, introduce una cadena: ");

        String salida = scanner.nextLine();

        try {
            Double numero = Double.valueOf(salida);
            System.out.println("El numero decimal es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("La entrada no es un número entero, por favor introdusca un numero válido.");
        }
        scanner.close();
    }
}