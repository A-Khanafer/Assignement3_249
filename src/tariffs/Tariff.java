package tariffs;

public class Tariff {
    private String destinationCountry;
    private String originCountry;
    private String productCategory;
    private double minimumTariff;

    public Tariff(String destinationCountry, String originCountry, String productCategory, double minimumTariff) {
        this.destinationCountry = destinationCountry;
        this.originCountry = originCountry;
        this.productCategory = productCategory;
        this.minimumTariff = minimumTariff;
    }

    public Tariff(Tariff other) {
        this.destinationCountry = other.destinationCountry;
        this.originCountry = other.originCountry;
        this.productCategory = other.productCategory;
        this.minimumTariff = other.minimumTariff;
    }



    public Tariff clone() {
        return new Tariff(this);
    }

    @Override
    public String toString() {
        return "Tariff[destination=" + destinationCountry +
                ", origin=" + originCountry +
                ", category=" + productCategory +
                ", minTariff=" + minimumTariff + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Tariff other = (Tariff) obj;

        return Double.compare(other.minimumTariff, minimumTariff) == 0 &&
                destinationCountry.equals(other.destinationCountry) &&
                originCountry.equals(other.originCountry) &&
                productCategory.equals(other.productCategory);
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getMinimumTariff() {
        return minimumTariff;
    }

    public void setMinimumTariff(double minimumTariff) {
        this.minimumTariff = minimumTariff;
    }
}
