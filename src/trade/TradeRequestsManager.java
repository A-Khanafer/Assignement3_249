package trade;

import tariffs.TariffList;

import java.util.ArrayList;

public class TradeRequestsManager {

    private ArrayList<TradeRequest> tradeRequests;

    public TradeRequestsManager(){
        this.tradeRequests = new ArrayList<TradeRequest>();
    }

    public void addTrade(TradeRequest trade){
        this.tradeRequests.add(trade);
    }

    public void removeTrade(TradeRequest trade){
        this.tradeRequests.remove(trade);
    }

    public String toString(){
        return tradeRequests.toString() ;
    }

    public void evaluateTrades(TariffList tariffList){
        for(TradeRequest tradeRequest: this.tradeRequests){
            System.out.println(tradeRequest.getRequestID() + "\n" +
                    tariffList.evaluateTrade(tradeRequest.getProposedTariff() , tariffList.find(tradeRequest.getOriginCountry() ,
                                                                                                tradeRequest.getDestinationCountry(),
                                                                                                tradeRequest.getProductCategory()).getMinimumTariff()));
            //here you calculate the excess
        }
    }
}
