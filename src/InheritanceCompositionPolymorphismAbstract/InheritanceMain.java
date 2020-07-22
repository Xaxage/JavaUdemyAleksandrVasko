package InheritanceCompositionPolymorphismAbstract;

public class InheritanceMain {
    public static void main(String[] args) {
    /*
        Engine truckEngine=new Engine(6,EngineType.DIESEL,900);//We are creating
        // object of Engine so we can use everything from class Engine => from Piston too.
        Truck truck= new Truck("Volvo","VNL 300",truckEngine,300,500,10000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unLoad();
        System.out.println("\n");

        ElectricCar car=new ElectricCar("Tesla","Supertruck",78000,5);
        car.start();
        car.stop();
        car.charge();
        System.out.println("\n");

        Engine busEngine =new Engine(3.5,EngineType.DIESEL,150);//We are creating
        // object of Engine so we can use everything from class Engine => from Piston too.
        Bus bus=new Bus("Mercedes","Sprinter",busEngine,50,120,45);
        bus.fuelUp(30);
        bus.pickUpPassengers(25);
        bus.start();
        bus.releasePassengers();
        Engine engine=bus.getEngine();
        System.out.println(engine.getEngineType());
        List<Piston> pistons= engine.getPistons();
        System.out.println(pistons);
        */



        Engine truckEngine=new Engine(6,EngineType.DIESEL,900);
        Engine busEngine =new Engine(3.5,EngineType.DIESEL,150);
        Auto bus=new Bus("Mercedes","Sprinter",busEngine,50,120,45);
        Auto truck= new Truck("Volvo","VNL 300",truckEngine,300,500,10000);
        Auto car=new ElectricCar("Tesla","Supertruck",78000,5);
       //Auto auto = new Auto("WV","Polo",busEngine );
        //We can change types because Bus,Truck and ElectricCar are instances of class "Auto".
        //We can use only fields inside class "Auto" .For example we can't use method fuelUp
        //inside class "Bus", because its object declared as "Auto".
        //bus.start();//We can override methods in class "Bus" from class "Auto" and make changes.
        //bus.stop();//We can override methods in class "Bus" from class "Auto" and make changes.
        runCar(bus);
        runCar(truck);
        runCar(car);
        //runCar(auto);

    }

    private static void runCar(Auto auto){
    auto.start();
    auto.stop();
    //auto.fuelUp();//We can't call cause it isn't initialized in class "Auto".
    /*
    if(auto instanceof  Truck || auto instanceof  Bus){//checking if they are connected by inheritance
        //FuelAuto fAuto=auto;//We got error cause we have incompatible types :
        // "FuelAuto" and "Auto"
        FuelAuto fAuto= (FuelAuto) auto;//We casted it .
        // Which means we are refactoring its type to "FuelAuto".
        // After that we can call method fuelAuto.
        fAuto.fuelUp(50);
    */ // we can delete this check cause now it will be automatically determined due
        //to abstract class "FuelAuto".
        auto.energize();
    }
    }


