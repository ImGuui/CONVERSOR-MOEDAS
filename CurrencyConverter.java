public class CurrencyConverter {

    private final ExchangeRateService exchangeRateService;

    public CurrencyConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    public double convert(String from, String to, double amount) {
        double rate = exchangeRateService.getExchangeRate(from, to);

        if (rate == -1) {
            System.out.println("Não foi possível obter a taxa de câmbio.");
            return 0;
        }

        return amount * rate;
    }
}
