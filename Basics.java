public class Basics { 
    public static void main(String[] args) { 
        displayPrimitiveDataTypes();
        demonstrateTypeCasting();
        demonstratePrimitiveToNonPrimitive();
        demonstrateNonPrimitiveToPrimitive();
    }

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
        // Output: Byte Value: 1
        System.out.println("Short Value: " + shortVar);
        // Output: Short Value: 12345
        System.out.println("Int Value: " + intVar);
        // Output: Int Value: 1234567890
        System.out.println("Long Value: " + longVar);
        // Output: Long Value: 1234567890123456789
        System.out.println("Float Value: " + floatVar);
        // Output: Float Value: 123.45
        System.out.println("Double Value: " + doubleVar);
        // Output: Double Value: 123.456789
        System.out.println("Char Value: " + charVar);
        // Output: Char Value: A
        System.out.println("Boolean Value: " + booleanVar);
        // Output: Boolean Value: true
    }

    public static void demonstrateTypeCasting() {
        int intVal = 100;
        long longVal = intVal; // int to long
        float floatVal = longVal; // long to float
        double doubleVal = floatVal; // float to double

        System.out.println("Implicit Casting:");
        System.out.println("int to long: " + longVal);
        // Output: int to long: 100
        System.out.println("long to float: " + floatVal);
        // Output: long to float: 100.0
        System.out.println("float to double: " + doubleVal);
        // Output: float to double: 100.0

        double anotherDoubleVal = 100.04;
        float anotherFloatVal = (float) anotherDoubleVal; // double to float
        long anotherLongVal = (long) anotherFloatVal; // float to long
        int anotherIntVal = (int) anotherLongVal; // long to int

        System.out.println("Explicit Casting:");
        System.out.println("double to float: " + anotherFloatVal);
        // Output: double to float: 100.04
        System.out.println("float to long: " + anotherLongVal);
        // Output: float to long: 100
        System.out.println("long to int: " + anotherIntVal);
        // Output: long to int: 100
    }

    public static void demonstratePrimitiveToNonPrimitive() {
        int intVar = 5;
        Integer integerWrapper = intVar; // Auto-boxing

        double doubleVar = 5.5;
        Double doubleWrapper = doubleVar; // Auto-boxing

        System.out.println("Primitive to Non-Primitive:");
        System.out.println("int to Integer: " + integerWrapper);
        // Output: int to Integer: 5
        System.out.println("double to Double: " + doubleWrapper);
        // Output: double to Double: 5.5
    }

    public static void demonstrateNonPrimitiveToPrimitive() {
        Integer integerWrapper = 10; // Auto-boxing
        int intVar = integerWrapper; // Unboxing

        Double doubleWrapper = 10.5; // Auto-boxing
        double doubleVar = doubleWrapper; // Unboxing

        System.out.println("Non-Primitive to Primitive:");
        System.out.println("Integer to int: " + intVar);
        // Output: Integer to int: 10
        System.out.println("Double to double: " + doubleVar);
        // Output: Double to double: 10.5
    }
}
