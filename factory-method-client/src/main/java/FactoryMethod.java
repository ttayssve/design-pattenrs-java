public class FactoryMethod {

    public static void main(String[] args) {
        Logger logger = new ConsoleLoggerCreator();
        TaxCalculator taxCalculator = new TaxCalculator(logger);
        taxCalculator.calculate(2.0);
    }
}
