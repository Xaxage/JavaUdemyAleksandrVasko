package Interfaces;
/*Unlike classes , interfaces can extend multiple times */

public interface Pricable extends Deliverable,Orderable  {

    default int calcPrice(){//"default" makes method non-abstract
        return calcOrderPrice()+calcDeliveryPrice();
    }
}
