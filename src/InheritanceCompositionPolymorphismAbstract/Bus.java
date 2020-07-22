package InheritanceCompositionPolymorphismAbstract;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized.");
    }

    public void fuelUp(){
    int volume =getTankVolume()- getAvailablePetrolNow();
    fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
       // super.fuelUp(petrolVolume);//It only calls for parent method
        int volume = getAvailablePetrolNow()+petrolVolume;
        if(volume>getTankVolume()){
            setAvailablePetrolNow(getTankVolume());
        }
        System.out.println("Adding diesel . ");
    }

    @Override
    public void energize() {//We are doing it because our Parent class is abstract
        // and energize is abstract method.
    fuelUp(getTankVolume()-getAvailablePetrolNow());
    }

    @Override
    public void start() {
        isRunning=true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting. ");
    }

    @Override
    public void stop() {
        isRunning=false;
        setCurrentSpeed(0);
        System.out.println("Our bus has stopped. ");
    }

    public void releasePassengers(){
        if(isRunning){
            stop();
        }
        passengerNumber=0;
        System.out.println("Passengers released;");
    }

    public void pickUpPassengers(int passengersNum){
        this.passengerNumber+=passengersNum;
        System.out.println("Picking up "+passengersNum+" passengers");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
