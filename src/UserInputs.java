import javax.swing.*;

public class UserInputs {
    public static void main(String[] args) {
        // El método parseInt de la clase Integer convierte una cadena de caracteres a un número entero
        int decimalNumber = Integer.parseInt(
                // El método showInputDialog de la clase JOptionPane muestra un cuadro de diálogo para ingresar un valor
                JOptionPane.showInputDialog(null, "Ingrese un número entero")
        );

        String message = "";
        message += "Número Decimal: " + decimalNumber + "\n";
        message += "Número binario de número decimal (" + decimalNumber + "): " + Integer.toBinaryString(decimalNumber) + "\n";
        message += "Número octal de número decimal (" + decimalNumber + "): " + Integer.toOctalString(decimalNumber) + "\n";
        message += "Número hexadecimal de número decimal (" + decimalNumber + "): " + Integer.toHexString(decimalNumber) + "\n";

        // El método showMessageDialog de la clase JOptionPane muestra un cuadro de diálogo con un mensaje
        JOptionPane.showMessageDialog(null, message);
    }
}
