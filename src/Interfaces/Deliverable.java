package Interfaces;
/*Name should be nouns.For example Running'll be runnable.Interfaces helps us to connect
two or more unrelated objects together.For example Pizza and CellPhone are'nt related,but
they can be both be delivered.In interface all fields are,by default,"abstract" and "public"
We can't create Constructors in Interfaces.*/
@FunctionalInterface //Which means Interface has only 1 abstract method
public interface Deliverable {
    /*public static final int QUANTITY=5;It's constant,
    so "static" and "final" are by default here, just like "public".*/
    int calcDeliveryPrice();

}
