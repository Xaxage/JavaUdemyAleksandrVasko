package InheritanceCompositionPolymorphismAbstract;

public abstract class Auto {
    private String producer;
    private String model;
    private Engine engine;//It's a Composition , cause we can use everything
    // from class Engine(by creating object of Engine) without inheriting it.
    // => we get access to class Piston.
    private int currentSpeed;
    protected boolean isRunning;//So bus passengers will exit when bus is stopped

    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto was initialized");
    }

    public abstract void energize();//All abstract methods must be implemented in son-classes.


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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
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
