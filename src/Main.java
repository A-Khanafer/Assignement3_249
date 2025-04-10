import tariffs.Tariff;
import tariffs.TariffList;
import trade.TradeManager;
import utility.FileManager;

public class Main {
    public static void main(String[] args) {

        TradeManager tradeManager = new TradeManager();
        FileManager.getTrades(tradeManager);


        TariffList tL1 = new TariffList();
        TariffList tL2 = new TariffList();





    }
}