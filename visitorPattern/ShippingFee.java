import java.util.*;

public class ShippingFee implements ShippingFeeCalculator {

    private static final Map<String, Double> shippingRates = new HashMap<>();

    static{
        shippingRates.put("Chair", 0.3);
        shippingRates.put("Table", 0.2);
        shippingRates.put("Sofa", 0.2);
        shippingRates.put("Cabinet", 0.2);
        shippingRates.put("Shelf", 0.3);
    }

    @Override
    public String shippingCost(String furnitureType, double price, boolean isBulky, double distance) {
        try{
            final double distanceBasedFee = 5; //per kilometer
            double totalDistanceBasedFee = distance * distanceBasedFee;
            double shippingFee = shippingRates.get(furnitureType) * price;

            if(isBulky){
                return "Price: P" + price + "\tShipping fee: P" + (shippingFee + totalDistanceBasedFee) + "\nOverall Cost: P" + (price + shippingFee + totalDistanceBasedFee) +
                        "\nShipping Description: This furniture is bulky and require additional distance-based shipping cost of P" +
                        distanceBasedFee + " per km.\n";
            }else { //if furniture is only lightweight, it doesn't require distance-based shipping cost calculation. Just flat shipping rate.
                return "Price: " + price + "\tShipping fee: " + shippingFee + "\nOverall Cost: P" + (price + shippingFee) +
                        "\nShipping Description: This furniture is lightweight and have only a flat shipping rate.\n";
            }
        }catch (NullPointerException e){
            return "Haven't found any shipping rates for this furniture.\n" +
                    "Overall cost will be based on its current price.\n" +
                    "Overall cost: P" + price + " only\n";
        }
    }
}
