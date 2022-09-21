public class ConsoleLogger implements LogPrinter {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
