public class TaxCalculator {

    private final Logger logger;

    public TaxCalculator(Logger logger) {
        this.logger = logger;
    }

    public void calculate(double value) {
        double tax = value * value;
        logger.log(String.format("Imposto calculado para o valor R$ %s", tax));
    }
}
