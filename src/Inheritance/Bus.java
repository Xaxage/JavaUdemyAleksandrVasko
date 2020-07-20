package Inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engin, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engin, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
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
        System.out.println("It is from Overrided method ");
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
