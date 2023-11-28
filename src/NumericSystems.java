public class NumericSystems {
    public static void main(String[] args) {

        int numeroDecimal = 500;

        System.out.println("Número Decimal: " + numeroDecimal);

        // El método toBinaryString de la clase Integer convierte un número decimal a binario
        System.out.println("Número binario de número decimal (" + numeroDecimal + "): " + Integer.toBinaryString(numeroDecimal));
        // La notación 0b al inicio de un número indica que es un número binario
        int numeroBinario = 0b111110100;
        System.out.println("Número decimal de número binario: " + numeroBinario);

        // El método toOctalString de la clase Integer convierte un número decimal a octal
        System.out.println("Número octal de número decimal (" + numeroDecimal + "): " + Integer.toOctalString(numeroDecimal));

        // El método toHexString de la clase Integer convierte un número decimal a hexadecimal
        System.out.println("Número hexadecimal de número decimal (" + numeroDecimal + "): " + Integer.toHexString(numeroDecimal));
        // La notación 0x al inicio de un número indica que es un número hexadecimal
        int numeroHexadecimal = 0x1f4;
        System.out.println("Número decimal de número hexadecimal: " + numeroHexadecimal);
    }
}
