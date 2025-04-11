import tariffs.Tariff;
import tariffs.TariffList;
import trade.TradeManager;
import trade.TradeRequestsManager;
import utility.FileManager;

public class Main {
    public static void main(String[] args) {

        TradeManager tradeManager = FileManager.getTrades();
        TariffList tariffList = FileManager.getTariffs();
        TradeRequestsManager trm = FileManager.getTradeRequests();
        trm.evaluateTrades(tariffList);




    }
}