public abstract class Logger {

    protected abstract LogPrinter createLogger();

    public void log(String message) {
        createLogger().print(message);
    };
}
