public class VariablesTypes {
    public static void main(String[] args) {
        // EL tipo de dato Interger es una clase que representa un número entero y tinene métodos para operar con él
        Integer numberInterger = 5;
        // El tipo de dato int es un tipo de dato primitivo que representa un número entero y no tiene métodos para operar con él
        int numberPrimitive = 5;

        System.out.println("Suma de variable Interger y variable int: " + (numberInterger + numberPrimitive));

        // EL tipo de dato Double es una clase que representa un número decimal y tinene métodos para operar con él
        Double numberDouble = 5.5;
        // El tipo de dato double es un tipo de dato primitivo que representa un número decimal y no tiene métodos para operar con él
        double numberPrimitiveDouble = 5.5;

        System.out.println("Suma de variable Double y variable double: " + (numberDouble + numberPrimitiveDouble));

        // EL tipo de dato Boolean es una clase que representa un valor booleano y tinene métodos para operar con él
        Boolean booleanValue = true;
        // El tipo de dato boolean es un tipo de dato primitivo que representa un valor booleano y no tiene métodos para operar con él
        boolean booleanPrimitive = true;

        System.out.println("Concatenación de variable Boolean y variable boolean: " + (booleanValue && booleanPrimitive));

        // EL tipo de dato String es una clase que representa una cadena de caracteres y tinene métodos para operar con él
        // No existe un tipo de dato primitivo que represente una cadena de caracteres
        String stringValue = "Hola";

        System.out.println("Variable String (No hay primitivo): " + (stringValue));

        // El tipo var es una variable que se puede declarar sin especificar el tipo de dato, pero una vez asignado el valor, no se puede cambiar el tipo de dato
        var varValue = "Hola";
        // varValue = 5; // Esto no se puede hacer porque ya se asignó un valor de tipo String

        System.out.println("Variable var: " + (varValue));

    }
}
