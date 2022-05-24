package tpu.labs.lab7Iterator;

public class FirstFloor extends Floor implements Collection, FloorCreator{
    private Room[] rooms;
    private int currentRoomIndex = 0;

    public FirstFloor(int amountOfRooms, int floorIndex) {
        super(amountOfRooms, floorIndex);
        this.rooms = new Room[amountOfRooms];
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void addRoom(Room room){
        this.rooms[currentRoomIndex] = room;
        this.currentRoomIndex++;
    }


    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

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

    @Override
    public Iterator getIterator() {
        return new RoomsIterator();
    }

    private class RoomsIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < rooms.length;
        }

        @Override
        public Room next() {
            return rooms[index++];
        }
    }
}
