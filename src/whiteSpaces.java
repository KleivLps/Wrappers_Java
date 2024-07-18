import java.util.Scanner;

public class whiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce una cadena: ");

        String input = scanner.nextLine();
        int contandoEspaciosBlanco = 0;

        for (int i= 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                contandoEspaciosBlanco++;
            }
        }
        System.out.println("El numero de espacios en blanco en la cadena es: " +contandoEspaciosBlanco);

        scanner.close();
    }
}
