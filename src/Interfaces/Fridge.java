package Interfaces;

public class Fridge extends Electronics{
    public Fridge(String make, String model, int quantity, int price) {
        super(make, model, quantity, price);
    }

    @Override
    public int calcDeliveryPrice() {
    if(getPrice()>=300){
        return 0;
    }
    else
        return 25;//Delivery in our store is 25$.
    }
}
