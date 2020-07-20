package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Engine {
    private double volume;
    private EngineType engineType;
    private int power;
    private List<Piston> pistons = new ArrayList<>();//It's a Composition
    // cause we have an access to class Piston without inheriting it.

    public Engine(double volume, EngineType engineType, int power) {
        this.volume = volume;
        this.engineType = engineType;
        this.power = power;
        for(int i=1;i<=5;i++) {//we are initializing 5 elements of piston
            // and save them in collection(List).
            this.pistons.add(new Piston(0.3, i));//We are adding parameters
            // to each elements of the list
        }
    }

    public Engine() {

    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getPower() {
        return power;
    }

    public List<Piston> getPistons() {//Unlike arrays we don't use loops for output in Main.
        return pistons;
    }
}
