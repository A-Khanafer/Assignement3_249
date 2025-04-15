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
        String approval;

        for(TradeRequest tradeRequest: this.tradeRequests){

            double minimumTariff = tariffList.find(tradeRequest.getOriginCountry() ,
                    tradeRequest.getDestinationCountry(),
                    tradeRequest.getProductCategory()).getMinimumTariff();

            System.out.println("\n" + tradeRequest.getRequestID() +
                    tariffList.evaluateTrade(tradeRequest.getProposedTariff() , minimumTariff));

           double excess = tradeRequest.getTradeValue()*((minimumTariff-tradeRequest.getProposedTariff())/100);
            if (tradeRequest.getProposedTariff() >= minimumTariff*0.8 && tradeRequest.getProposedTariff() < minimumTariff) {
            System.out.println("A surcharge of $" + excess + " is applied.");
            }

        }

    }

}
