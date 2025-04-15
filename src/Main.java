import tariffs.Tariff;
import tariffs.TariffList;
import trade.TradeManager;
import trade.TradeRequestsManager;
import utility.FileManager;

import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        TradeManager tradeManager = FileManager.getTrades();
        TariffList tariffList = FileManager.getTariffs();
        TradeRequestsManager trm = FileManager.getTradeRequests();
        trm.evaluateTrades(tariffList);

        //below is all the tests
        System.out.println("TESTS BELOW:");

        TariffList testList = new TariffList();
        TariffList testList2 = new TariffList();

        testList.addToStart(new Tariff("Lebanon", "Canada", "Dairy", 10));
        testList.addToStart(new Tariff("Canada", "Lebanon", "Lumber", 15));
        testList.addToStart(new Tariff("Germany", "USA", "Military equipment", 20));
        testList.addToStart(new Tariff("USA", "Germany", "Fish", 40));

        testList2.addToStart(new Tariff("Lebanon", "Canada", "Dairy", 10));
        testList2.addToStart(new Tariff("Canada", "Lebanon", "Lumber", 15));
        testList2.addToStart(new Tariff("Germany", "USA", "Military equipment", 20));
        testList2.addToStart(new Tariff("USA", "Germany", "Fish", 40));

        System.out.println(testList.equals(testList2));
        System.out.println(testList.find("Canada", "Lebanon", "Dairy"));

        Tariff found = new Tariff(testList.find("Canada", "Lebanon", "Dairy"));
        System.out.println("after copying from find method "+found);
        found.setDestinationCountry("France");
        found.setMinimumTariff(15);
        found.setOriginCountry("Syria");
        found.setProductCategory("Microchips");
        System.out.println("Found after setters: " + found);

        testList.deleteFromStart();
        System.out.println(testList.find("Germany", "USA", "Fish"));

        try {
            tariffList.addAtIndex(6, new Tariff("Guatemala", "Chile", "Wheat", 35));
        }
        catch (NoSuchElementException e){
            System.out.println(e);
        }

        try {
            testList.deleteFromIndex(2);
        }
        catch (NoSuchElementException e){
            System.out.println(e);
        }

        System.out.println(testList.contains("France", "Lebanon", "Electricity"));


    }
}