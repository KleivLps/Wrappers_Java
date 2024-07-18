import java.util.Scanner;

public class isLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce una cadena: ");

        String salida = scanner.nextLine();
        boolean letters = true;

        for (int i = 0; i < salida.length(); i++) {
            if (!Character.isLetter(salida.charAt(i))) {
                letters = false;
                break;
            }
        }
        if (letters) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena contiene letras, numeros o simbolos.");
        }
        scanner.close();
    }
}
