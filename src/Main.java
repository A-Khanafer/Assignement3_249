import trade.TradeManager;
import utility.FileManager;

public class Main {
    public static void main(String[] args) {

        TradeManager tradeManager = new TradeManager();
        FileManager.getTrades(tradeManager);

    }
}