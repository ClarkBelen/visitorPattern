public class ECommerceFurniture {
    public static void main(String[] args) {
        FurnitureShipping chair = new Furniture("Chair", 100, false, 10);
        FurnitureShipping table = new Furniture("Table", 500, true, 1);
        FurnitureShipping sofa = new Furniture("Sofa", 1000, true, 2);
        FurnitureShipping cabinet = new Furniture("Cabinet", 800, true, 2);
        FurnitureShipping shelf = new Furniture("Shelf", 300, false, 5);
        FurnitureShipping drawer = new Furniture("Drawer", 400, true, 2);

        ShippingFeeCalculator shipping = new ShippingFee();

        System.out.println(((Furniture) chair).getFurnitureType() + " Furniture\n" + chair.accept(shipping, ((Furniture) chair).getFurniturePrice()));
        System.out.println(((Furniture) table).getFurnitureType() + " Furniture\n" + table.accept(shipping, ((Furniture) table).getFurniturePrice()));
        System.out.println(((Furniture) sofa).getFurnitureType() + " Furniture\n" + sofa.accept(shipping, ((Furniture) sofa).getFurniturePrice()));
        System.out.println(((Furniture) cabinet).getFurnitureType() + " Furniture\n" + cabinet.accept(shipping, ((Furniture) cabinet).getFurniturePrice()));
        System.out.println(((Furniture) shelf).getFurnitureType() + " Furniture\n" + shelf.accept(shipping, ((Furniture) shelf).getFurniturePrice()));
        System.out.println(((Furniture) drawer).getFurnitureType() + " Furniture\n" + drawer.accept(shipping, ((Furniture) drawer).getFurniturePrice()));


    }
}