import java.util.Scanner;

public class contadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número: ");
        String salidaNumero = scanner.nextLine();

        //convertiendo en cadena
        String stringNumero = salidaNumero;


        //empezando el contador de digitos:
        int contadorDigito = 0;

        //Creando bucle para cada caracter de la cadena:

        for (int i = 0; i < stringNumero.length(); i++) {
            //contando el numero total de digitos

            if (Character.isDigit(stringNumero.charAt(i))) {
                contadorDigito++;
            }
        }

        System.out.println("El numero de digitos en el número es: " +contadorDigito);

        scanner.close();


    }
}
