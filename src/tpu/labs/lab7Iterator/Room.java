package tpu.labs.lab7Iterator;

public class Room {
    private RoomTypes roomType;

    private int area;

    public Room(int area, RoomTypes roomType){
        this.roomType = roomType;
        this.area = area;
    }

    public RoomTypes getRoomType() {
        return roomType;
    }

    public int getArea() {
        return area;
    }

    public void setRoomType(RoomTypes roomType) {
        this.roomType = roomType;
    }
}
