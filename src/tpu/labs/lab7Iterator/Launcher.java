package tpu.labs.lab7Iterator;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество этажей");

        int amountOfFloors = scanner.nextInt();

        Building building = generateBuilding(amountOfFloors);

        int entireSquare = calculateEntireArea(building);

        System.out.println("Общая площадь комнат " + entireSquare + " m2");

        int[] squareOfRoomsByType = new int[RoomTypes.values().length];

        for (int i = 0; i < squareOfRoomsByType.length; i++){
            RoomTypes roomType = (RoomTypes.values()[i]);

            squareOfRoomsByType[i] = calculateAreaByRoomType(roomType, building);

            System.out.println("Общая площадь комнат типа " +
                    Mathcer.getNameMatchedType(roomType) + " = " + squareOfRoomsByType[i]);
        }

        for (int i = 0; i < amountOfFloors; i++){
            System.out.println("Общая площадь комнат на " +
                    (i + 1) + " этаже = " + calculateAreaByFloor(i, building));
        }

    }

    public static Building generateBuilding(int amountOfFloors){
        Building building = new Building(amountOfFloors);

        for (int i = 0; i < amountOfFloors; i++){
            FloorCreator floor = null;

            if (i == 0){
                 floor = new FirstFloor(getRandomNumber(1, 5), i + 1);
            }

            if ( i != 0){
                floor = new AnyFloor(getRandomNumber(1, 5), i + 1);
            }

            for (int j = 0; j < floor.getAmountOfRooms(); j++){
                floor.addRoom(generateRoom());
            }

            building.addFloor(floor);
        }

        return building;
    }

    public static int calculateEntireArea(Building building){
        int entireSquare = 0;

        for( FloorCreator floor: building.getFloors()){
            Iterator iterator = floor.getIterator();

            while (iterator.hasNext()){
                entireSquare += iterator.next().getArea();
            }
        }

        return entireSquare;
    }

    public static int calculateAreaByRoomType(RoomTypes roomType, Building building){
        int entireAreaByType = 0;

        for(FloorCreator floor: building.getFloors()){
            Iterator iterator = floor.getIterator();

            while (iterator.hasNext()){
                Room currentRoom = iterator.next();

                if(currentRoom.getRoomType() == roomType){
                    entireAreaByType += currentRoom.getArea();
                }
            }
        }

        return entireAreaByType;
    }

    public static int calculateAreaByFloor(int floorIndex, Building building){
        int entireAreaByFloor = 0;

        FloorCreator floor = building.getFloors().get(floorIndex);

        Iterator iterator = floor.getIterator();

        while (iterator.hasNext()){
            Room currentRoom = iterator.next();

            entireAreaByFloor += currentRoom.getArea();
        }

        return entireAreaByFloor;
    }

    public static Room generateRoom(){
        return new Room(getRandomNumber(10, 30),getRandomRoomType());
    }

    public static RoomTypes getRandomRoomType(){
        int roomTypes = RoomTypes.values().length;

        int randomIndex = getRandomNumber(0, roomTypes);

        RoomTypes roomType = null;

        switch (randomIndex){
            case 0 -> roomType = RoomTypes.BEDROOM;

            case 1 -> roomType = RoomTypes.TOILET;

            case 2 -> roomType = RoomTypes.KITCHEN;

            default -> {}
        }

        return roomType;
    }
    public static int getRandomNumber(int start, int max){
        return (int) (Math.random()*max + start);
    }
}
