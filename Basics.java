public class Basics { 
    public static void main(String[] args) { 
        System.out.println("Hello World");

        // Call methods to demonstrate data types and type casting
        displayPrimitiveDataTypes();
        demonstrateTypeCasting();
    }

    // Method to display all primitive data types
    public static void displayPrimitiveDataTypes() {
        byte byteVar = 1;
        short shortVar = 12345;
        int intVar = 1234567890;
        long longVar = 1234567890123456789L;
        float floatVar = 123.45F;
        double doubleVar = 123.456789;
        char charVar = 'A';
        boolean booleanVar = true;

        System.out.println("Byte Value: " + byteVar);
        System.out.println("Short Value: " + shortVar);
        System.out.println("Int Value: " + intVar);
        System.out.println("Long Value: " + longVar);
        System.out.println("Float Value: " + floatVar);
        System.out.println("Double Value: " + doubleVar);
        System.out.println("Char Value: " + charVar);
        System.out.println("Boolean Value: " + booleanVar);
    }

    // Method to demonstrate type casting
    public static void demonstrateTypeCasting() {
        // Implicit Casting (Widening)
        int intVal = 100;
        long longVal = intVal; // int to long
        float floatVal = longVal; // long to float
        double doubleVal = floatVal; // float to double

        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);

        // Explicit Casting (Narrowing)
        double anotherDoubleVal = 100.04;
        float anotherFloatVal = (float) anotherDoubleVal; // double to float
        long anotherLongVal = (long) anotherFloatVal; // float to long
        int anotherIntVal = (int) anotherLongVal; // long to int

        System.out.println("Explicit Casting:");
        System.out.println("double to float: " + anotherFloatVal);
        System.out.println("float to long: " + anotherLongVal);
        System.out.println("long to int: " + anotherIntVal);
    }
}
