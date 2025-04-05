package utility;

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
            scanner = new Scanner(new FileInputStream("TradeData.txt"));
            updateWriter = new PrintWriter(new FileOutputStream("UpdatedTradeData.txt"));

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");
                trades.addTrade(new Trade(tokens[0] , tokens[1] , tokens[2] , Integer.parseInt(tokens[3])));
            }

            trades.sortTrades();
            updateWriter.println(trades);
            scanner.close();
            updateWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
