package InnerClasses;

public class Main {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Samsung","note 8");
       /* phone.turnOn(); If we dont call it we get null,
        cause we haven't created an object.
        Display display = phone.getDisplay();//If we use both fields we get an object
        with no values in it */
        phone.turnOn();
        phone.call("1234567890");//We have to type 10 symbols and only int variables.


    }
}
