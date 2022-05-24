package tpu.labs.lab7Iterator;

public interface FloorCreator {

    public void addRoom(Room room);

    public int getFloorIndex();

    public void setFloorIndex(int floorIndex);

    public int getAmountOfRooms();

    public void setAmountOfRooms(int amountOfRooms);

    public Iterator getIterator();
}
