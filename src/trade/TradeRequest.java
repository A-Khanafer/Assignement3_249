package trade;

import tariffs.Tariff;

public class TradeRequest {

    private String RequestID,OriginCountry ,DestinationCountry, ProductCategory;
    private double  TradeValue, ProposedTariff;

    public TradeRequest(String requestID, String originCountry, String destinationCountry, String productCategory, double tradeValue, double proposedTariff) {
        RequestID = requestID;
        OriginCountry = originCountry;
        DestinationCountry = destinationCountry;
        ProductCategory = productCategory;
        TradeValue = tradeValue;
        ProposedTariff = proposedTariff;
    }

    public String getRequestID() {
        return RequestID;
    }

    public void setRequestID(String requestID) {
        RequestID = requestID;
    }

    public String getOriginCountry() {
        return OriginCountry;
    }

    public void setOriginCountry(String originCountry) {
        OriginCountry = originCountry;
    }

    public String getDestinationCountry() {
        return DestinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        DestinationCountry = destinationCountry;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String productCategory) {
        ProductCategory = productCategory;
    }

    public double getTradeValue() {
        return TradeValue;
    }

    public void setTradeValue(double tradeValue) {
        TradeValue = tradeValue;
    }

    public double getProposedTariff() {
        return ProposedTariff;
    }

    public void setProposedTariff(double proposedTariff) {
        ProposedTariff = proposedTariff;
    }

    @Override
    public String toString() {
        return "TradeRequest{" +
                "RequestID='" + RequestID + '\'' +
                ", OriginCountry='" + OriginCountry + '\'' +
                ", DestinationCountry='" + DestinationCountry + '\'' +
                ", ProductCategory='" + ProductCategory + '\'' +
                ", TradeValue=" + TradeValue +
                ", ProposedTariff=" + ProposedTariff +
                '}';
    }
}
