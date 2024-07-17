package classesmethods;

public class ExternalClassWithAbstract extends AbstractMessageProvider {
    @Override
    public void provideMessage() {
        System.out.println("Hello from the ExternalClassWithAbstract class!");
        // Output: Hello from the ExternalClassWithAbstract class!
    }
}
