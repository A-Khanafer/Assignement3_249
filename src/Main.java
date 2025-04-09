import tariffs.Tariff;
import tariffs.TariffList;
import trade.TradeManager;
import utility.FileManager;

public class Main {
    public static void main(String[] args) {

        TradeManager tradeManager = new TradeManager();
        FileManager.getTrades(tradeManager);

        //FOR TESTING PURPOSES
        TariffList tariffList = new TariffList();
        tariffList.addToStart(new Tariff("USA" , "CANADA" , "lait" , 20));
        tariffList.addToStart(new Tariff("BANG" , "CANADA" , "lait" , 20));
        tariffList.addToStart(new Tariff("LOOOOLLL" , "CANADA" , "lait" , 20));
        tariffList.addAtIndex(0 , new Tariff("jayzzzzzzzzzzzz" , "CANADA" , "lait" , 20));

        tariffList.replaceAtIndex(2 , new Tariff("GANGAGAGAGAGAG" , "CANADA" , "lait" , 20));
        tariffList.deleteFromIndex(2);
        System.out.println(tariffList);



    }
}