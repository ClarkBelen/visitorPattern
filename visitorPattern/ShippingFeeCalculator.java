public interface ShippingFeeCalculator {

    public String shippingCost(String furnitureType, double price, boolean isBulky, double distance);
}
