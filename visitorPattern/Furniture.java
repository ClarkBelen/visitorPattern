public class Furniture implements FurnitureShipping{
    private String furnitureType;
    private Double furniturePrice;
    private Boolean isBulky;
    private Double distanceInKM;

    public Furniture(String furnitureType,double unitPrice, Boolean isBulky, double distanceInKM) {
        this.furnitureType = furnitureType;
        this.furniturePrice = unitPrice;
        this.isBulky = isBulky;
        this.distanceInKM = distanceInKM;
    }


    @Override
    public String accept(ShippingFeeCalculator shipping, double price) {
        this.furniturePrice = price;
        return shipping.shippingCost(furnitureType, price, isBulky, distanceInKM);
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public Double getFurniturePrice() {
        return furniturePrice;
    }

    public Boolean getBulky() {
        return isBulky;
    }

    public Double getDistanceInKM() {
        return distanceInKM;
    }
}
