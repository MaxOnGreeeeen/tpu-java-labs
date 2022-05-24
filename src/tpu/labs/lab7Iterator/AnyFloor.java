package tpu.labs.lab7Iterator;

import java.util.ArrayList;

public class AnyFloor extends Floor implements Collection, FloorCreator{
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    private ArrayList<Room> rooms = new ArrayList<>();

    @Override
    public int getFloorIndex() {
        return super.getFloorIndex();
    }

    @Override
    public void setFloorIndex(int floorIndex) {
        super.setFloorIndex(floorIndex);
    }

    @Override
    public int getAmountOfRooms() {
        return super.getAmountOfRooms();
    }

    @Override
    public void setAmountOfRooms(int amountOfRooms) {
        super.setAmountOfRooms(amountOfRooms);
    }

    public AnyFloor(int amountOfRooms, int floorIndex) {
        super(amountOfRooms, floorIndex);
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    @Override
    public Iterator getIterator() {
        return new RoomsIterator();
    }

    private class RoomsIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < rooms.size();
        }

        @Override
        public Room next() {
            return rooms.get(index++);
        }
    }
}
