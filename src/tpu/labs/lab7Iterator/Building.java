package tpu.labs.lab7Iterator;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private int amountOfFloors;
    private List<FloorCreator> floors = new ArrayList<>();

    public Building(int amountOfFloors){
        this.amountOfFloors = amountOfFloors;
    }

    public List<FloorCreator> getFloors() {
        return floors;
    }

    public void setFloors(List<FloorCreator> floors) {
        this.floors = floors;
    }

    public int getAmountOfFloors() {
        return amountOfFloors;
    }

    public void setAmountOfFloors(int amountOfFloors) {
        this.amountOfFloors = amountOfFloors;
    }

    public void addFloor(FloorCreator floor){
        this.floors.add(floor);
    }
}
