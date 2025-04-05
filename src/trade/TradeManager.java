package trade;

import java.util.ArrayList;
import java.util.Comparator;

public class TradeManager {

    private ArrayList<Trade> trades;

    public TradeManager(){
        this.trades = new ArrayList<Trade>();
    }

    public void addTrade(Trade trade){
        this.trades.add(trade);
    }

    public void removeTrade(Trade trade){
        this.trades.remove(trade);
    }

    public void sortTrades(){
        trades.sort(null);
    }

    public String toString(){
        return trades.toString() ;
    }
}
