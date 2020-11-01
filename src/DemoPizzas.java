public class DemoPizzas {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Pepperoni and cheese", 12.99);
        Pizza pizza2 = new Pizza("Meat lovers", 19.99);

        DeliveryPizza pizza3 = new DeliveryPizza("Deluxe", 24.99, "123 Main");
        DeliveryPizza pizza4 = new DeliveryPizza("Pepperoni and cheese",
                12.99, "3450 Second Street");

        System.out.println(pizza1.DisplayInfo());
        System.out.println(pizza2.DisplayInfo());
        System.out.println(pizza3.DisplayInfo());
        System.out.println(pizza4.DisplayInfo());
    }

}
