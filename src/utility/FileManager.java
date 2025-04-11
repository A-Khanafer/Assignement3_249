package utility;

import tariffs.Tariff;
import tariffs.TariffList;
import trade.Trade;
import trade.TradeManager;
import trade.TradeRequest;
import trade.TradeRequestsManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    public static TradeManager getTrades() {
        Scanner scanner;
        PrintWriter updateWriter;
        TradeManager tradeManager = new TradeManager();
        try{
            scanner = new Scanner(new FileInputStream("tradeData.txt"));
            updateWriter = new PrintWriter(new FileOutputStream("updatedTradeData.txt"));

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                tradeManager.addTrade(new Trade(tokens[0] , tokens[1] , tokens[2] , Double.parseDouble(tokens[3])));
            }

            tradeManager.sort();
            updateWriter.println(tradeManager);
            scanner.close();
            updateWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return tradeManager;
    }


    public static TariffList getTariffs() {
        Scanner scanner;
        TariffList list = new TariffList();
        try{
            scanner = new Scanner(new FileInputStream("Tariffs.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                list.addToStart(new Tariff(tokens[0] , tokens[1] , tokens[2] , Double.parseDouble(tokens[3])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return list;
    }

    public static TradeRequestsManager getTradeRequests() {
        Scanner scanner;
        TradeRequestsManager list = new TradeRequestsManager();
        try{
            scanner = new Scanner(new FileInputStream("TradeRequests.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(" ");
                list.addTrade(new TradeRequest(tokens[0] , tokens[1] , tokens[2] ,tokens[3] ,Double.parseDouble(tokens[4]) , Double.parseDouble(tokens[5])));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return list;
    }




}
