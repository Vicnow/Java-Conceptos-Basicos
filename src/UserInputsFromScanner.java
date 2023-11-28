import java.util.Scanner;

public class UserInputsFromScanner {
    public static void main(String[] args) {

        // El tipo de dato Scanner es una clase que permite leer datos desde la consola
        // System.in es un objeto que representa la entrada estándar, en este caso, la consola
        Scanner scanner = new Scanner(System.in);
        int decimalNumber = 0;

        System.out.println("Ingrese un número entero");
        String stringNumber = scanner.nextLine();

        try {
            decimalNumber = Integer.parseInt(stringNumber);
        }catch (NumberFormatException e){
            System.out.println("El valor ingresado no es un número entero");
            System.exit(0);
        }

        System.out.println("Número Decimal: " + decimalNumber);
        System.out.println("Número binario de número decimal (" + decimalNumber + "): " + Integer.toBinaryString(decimalNumber));
        System.out.println("Número octal de número decimal (" + decimalNumber + "): " + Integer.toOctalString(decimalNumber));
        System.out.println("Número hexadecimal de número decimal (" + decimalNumber + "): " + Integer.toHexString(decimalNumber));
    }
}
