package utility;

import tariffs.Tariff;
import tariffs.TariffList;
import trade.Trade;
import trade.TradeManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {

    public static void getTrades(TradeManager trades) {
        Scanner scanner;
        PrintWriter updateWriter;
        try{
            scanner = new Scanner(new FileInputStream("tradeData.txt"));
            updateWriter = new PrintWriter(new FileOutputStream("updatedTradeData.txt"));

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                trades.addTrade(new Trade(tokens[0] , tokens[1] , tokens[2] , Double.parseDouble(tokens[3])));
            }

            trades.sort();
            updateWriter.println(trades);
            scanner.close();
            updateWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }


    public static void getTariffs(TariffList list) {
        Scanner scanner;

        try{
            scanner = new Scanner(new FileInputStream("Tariffs.txt"));


            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                list.addToStart(new Tariff(tokens[0] , tokens[1] , tokens[2] , Double.parseDouble(tokens[3])));
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }






}
