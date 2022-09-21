public class ConsoleLoggerCreator extends Logger {

    @Override
    protected LogPrinter createLogger() {
        return new ConsoleLogger();
    }
}
