package Interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
    Pricable pizza = new Pizza("Neopolitano",1,20,Size.L);
    Pricable phone = new CellPhone("Motorola","XT1575",1,250);
    Pricable fridge = new Fridge("Lg","E9090",1,300);

    printDeliveryPRice(pizza);
    printDeliveryPRice(phone);
    printDeliveryPRice(fridge);

    }
    private static void printDeliveryPRice(Pricable del){
        System.out.println("Order price is "+ del.calcOrderPrice() + "$");
        System.out.println("Delivery price is "+ del.calcDeliveryPrice() + "$");
    }
}
