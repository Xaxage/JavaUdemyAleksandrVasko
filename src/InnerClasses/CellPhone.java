package InnerClasses;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;
    private AbstractPhoneButton button;

    private interface AbstractPhoneButton{
    void click();
    }

    public void initButton (){
        button=new AbstractPhoneButton() {//Creating anonym class.We have unnamed class
            //that implement from "AbstractPhoneButton" interface.
            @Override
            public void click() {
                System.out.println("Button was clicked");
            }
        };//We write ";" , cause  on 15 line after "button=" is like an ordinary field.
    }

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn(){
    initDisplay();
    gsm=new RadioModule();
    initButton();
    }

    public void call(String number){
        gsm.call(number);
        button.click();
    }

    private void initDisplay(){
     display=new Display();//this.display = new object from "Display" class.
        // We initialized it, by calling method "turnOn".
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
