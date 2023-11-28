import javax.swing.*;

public class UserInputsFromWindow {
    public static void main(String[] args) {
        int decimalNumber = 0;
        // El bloque try-catch permite capturar excepciones
        try {
            // El método parseInt de la clase Integer convierte una cadena de caracteres a un número entero
            decimalNumber = Integer.parseInt(
                    // El método showInputDialog de la clase JOptionPane muestra un cuadro de diálogo para ingresar un valor
                    JOptionPane.showInputDialog(null, "Ingrese un número entero")
            );
            // NumberFormatException es una excepción que se lanza cuando se intenta convertir una cadena de caracteres a un número entero y la cadena de caracteres no es un número entero
        } catch (NumberFormatException e) {
            // El método showMessageDialog de la clase JOptionPane muestra un cuadro de diálogo con un mensaje
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número entero");
            System.exit(0);
        }

        String message = "";
        message += "Número Decimal: " + decimalNumber + "\n";
        message += "Número binario de número decimal (" + decimalNumber + "): " + Integer.toBinaryString(decimalNumber) + "\n";
        message += "Número octal de número decimal (" + decimalNumber + "): " + Integer.toOctalString(decimalNumber) + "\n";
        message += "Número hexadecimal de número decimal (" + decimalNumber + "): " + Integer.toHexString(decimalNumber) + "\n";

        // El método showMessageDialog de la clase JOptionPane muestra un cuadro de diálogo con un mensaje
        JOptionPane.showMessageDialog(null, message);
    }
}
