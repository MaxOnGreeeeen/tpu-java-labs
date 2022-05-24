package tpu.labs.lab7Iterator;

public class Floor implements Iterator, FloorCreator{
    private int amountOfRooms;
    private int floorIndex;

    public Floor(int amountOfRooms, int floorIndex){
        this.amountOfRooms = amountOfRooms;
        this.floorIndex = floorIndex;
    }

    @Override
    public void addRoom(Room room) {

    }

    public int getFloorIndex() {
        return floorIndex;
    }

    public void setFloorIndex(int floorIndex) {
        this.floorIndex = floorIndex;
    }

    public int getAmountOfRooms() {
        return amountOfRooms;
    }

    public void setAmountOfRooms(int amountOfRooms) {
        this.amountOfRooms = amountOfRooms;
    }

    @Override
    public Iterator getIterator() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Room next() {
        return null;
    }
}
