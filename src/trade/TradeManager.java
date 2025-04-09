package trade;

import java.util.ArrayList;
import java.util.Collections;

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

    public void sort(){
        Collections.sort(this.trades);
    }

    public String toString(){
        return trades.toString() ;
    }
}
