public class DeliveryPizza extends Pizza{

    private String address;
    private double deliveryfee;
    private final int LOWFEE = 3; //all caps is constant
    private final int HIGHFEE = 5;
    private final int CUTOFFPRICE = 15;

    public DeliveryPizza(String description, double price, String address) {
        super(description, price);
        this.address = address;

        if(price > CUTOFFPRICE)
            deliveryfee = LOWFEE;
        else
            deliveryfee = HIGHFEE;
    }

    @Override
    public String DisplayInfo() {

        String message = "Pizza : " + description + " price: " + price +
                "address  to: " + address + "delivery fee charged: " + deliveryfee;
        return message;
    }
}
