public class ExchangeRateResponse {
    private String result;
    private String base_code;
    private Rates rates;

    // Constructor
    public ExchangeRateResponse(String result, String base_code, Rates rates) {
        this.result = result;
        this.base_code = base_code;
        this.rates = rates;
    }

    // Getters
    public String getResult() {
        return result;
    }

    public String getBase_code() {
        return base_code;
    }

    public Rates getRates() {
        return rates;
    }

    // Setters
    public void setResult(String result) {
        this.result = result;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}



