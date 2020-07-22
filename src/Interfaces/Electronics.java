package Interfaces;

public abstract class Electronics implements Pricable{
    /*We don't have to implement methods here because both of them are abstract , but
    we have to implement methods from "Deliverable" in instance classes of "Electronic".*/
    private String make;
    private String model;
    private int quantity;
    private int price;

    public Electronics(String make, String model, int quantity, int price) {
        this.make = make;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int calcOrderPrice() {
        return getQuantity()*getPrice();
    }/*We dont get error in "CellPhone" or in "Fridge" ,
     because it wasn't instanced as abstract method.
     It is already implemented and "Straight"*/

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
