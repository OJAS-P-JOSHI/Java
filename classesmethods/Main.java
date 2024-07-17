package classesmethods;

public class Main {
    public static void main(String[] args) {
        // Call method1 within the Main class
        method1();

        // Call the method from the internal Greeting class
        Greeting greeting = new Greeting();
        greeting.displayGreeting();

        // Call the method from the external ExternalClass class
        ExternalClass externalClass = new ExternalClass();
        externalClass.displayExternalMessage();

        // Call the method from the external class implementing an interface
        MessageProvider provider = new ExternalClassWithInterface();
        provider.provideMessage();
    }

    // Method within Main class
    static void method1() {
        System.err.println("method1");
        // Output: method1
    }

    // Internal class within Main class
    static class Greeting {
        void displayGreeting() {
            System.out.println("Hello from the Greeting class!");
            // Output: Hello from the Greeting class!
        }
    }
}
