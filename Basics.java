public class Basics { 
    public static void main(String[] args) { 
        System.out.println("Hello World");

        // Call methods to demonstrate data types, type casting, and conversions
        displayPrimitiveDataTypes();
        demonstrateTypeCasting();
        demonstratePrimitiveToNonPrimitive();
        demonstrateNonPrimitiveToPrimitive();
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

    // Method to demonstrate conversion from primitive to non-primitive (wrapper) types
    public static void demonstratePrimitiveToNonPrimitive() {
        int intVar = 5;
        Integer integerWrapper = intVar; // Auto-boxing primitive int to Integer

        double doubleVar = 5.5;
        Double doubleWrapper = doubleVar; // Auto-boxing primitive double to Double

        System.out.println("Primitive to Non-Primitive:");
        System.out.println("int to Integer: " + integerWrapper);
        System.out.println("double to Double: " + doubleWrapper);
    }

    // Method to demonstrate conversion from non-primitive (wrapper) types to primitive
    public static void demonstrateNonPrimitiveToPrimitive() {
        Integer integerWrapper = 10; // Auto-boxing
        int intVar = integerWrapper; // Unboxing Integer to primitive int

        Double doubleWrapper = 10.5; // Auto-boxing
        double doubleVar = doubleWrapper; // Unboxing Double to primitive double

        System.out.println("Non-Primitive to Primitive:");
        System.out.println("Integer to int: " + intVar);
        System.out.println("Double to double: " + doubleVar);
    }
}
