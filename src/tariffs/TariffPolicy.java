package tariffs;

public interface TariffPolicy {

    String evaluateTrade(double proposedTariff, double minimumTariff);


}
