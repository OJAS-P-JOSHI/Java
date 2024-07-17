package ClassesNMethodsCall;

public class ExternalClassWithInterface implements MessageProvider {
    @Override
    public void provideMessage() {
        System.out.println("Hello from the ExternalClassWithInterface class!");
        // Output: Hello from the ExternalClassWithInterface class!
    }
}