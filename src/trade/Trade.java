package trade;

public class Trade implements Comparable<Trade> {

    private String country,productName,category;
    private double initialPrice,finalPrice;

    public Trade(String productName,String country,  String category, double initialPrice) {
        this.country = country;
        this.productName = productName;
        this.category = category;
        this.initialPrice = initialPrice;
        calculateFinalPrice();
    }

    private void calculateFinalPrice(){
        switch(country){
            case "China" :
                finalPrice = initialPrice * 1.25;
                break;
            case "USA" :
                if(category.equals("Electronics")){finalPrice = initialPrice * 1.10;}
                break;
            case "Japan" :
                if(category.equals("Automobiles")){finalPrice = initialPrice * 1.15;}
                break;
            case "India" :
                if(category.equals("Agriculture")){finalPrice = initialPrice * 1.05;}
                break;
            case "South Korea" :
                if(category.equals("Electronics")){finalPrice = initialPrice * 1.08;}
                break;
            case "Saudi Arabia" :
                if(category.equals("Energy")){finalPrice = initialPrice * 1.12;}
                break;
            case "Germany" :
                if(category.equals("Manufacturing")){finalPrice = initialPrice * 1.06;}
                break;
            case "Bangladesh" :
                if(category.equals("Textile")){finalPrice = initialPrice * 1.04;}
                break;
            case "Brazil" :
                if(category.equals("Agriculture")){finalPrice = initialPrice * 1.09;}
                break;
            default :
                finalPrice = initialPrice;
                break;
        }
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productName + "," + country + "," + category + "," + finalPrice +"\n";
    }

    @Override
    public int compareTo(Trade o) {
        return this.productName.compareToIgnoreCase(o.productName);
    }



}
