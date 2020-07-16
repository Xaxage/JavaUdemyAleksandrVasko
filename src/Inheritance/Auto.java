package Inheritance;

public class Auto {
    private String producer;
    private String model;
    private EngineType engintype;
    private int currentSpeed;
    protected boolean isRunning;//So bus passengers will exit when bus is stopped

    public Auto(String producer, String model, EngineType engintype) {
        this.producer = producer;
        this.model = model;
        this.engintype = engintype;
        System.out.println("Auto was initialized");
    }

    public void start(){
        isRunning=true;
        currentSpeed=10;
        System.out.println("Auto is starting ");
    }

    public void stop() {
        isRunning=false;
        currentSpeed=0;
        System.out.println("Our car has stopped ");
    }

    public void accelerate(int kmPerHour){
        currentSpeed+=kmPerHour;
        System.out.println("Accelerating . Current speed is "
                + currentSpeed+ "kmPerHour");
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngintype() {
        return engintype;
    }

    public void setEngintype(EngineType engintype) {
        this.engintype = engintype;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }


}
