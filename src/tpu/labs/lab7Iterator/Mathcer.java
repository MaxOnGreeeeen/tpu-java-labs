package tpu.labs.lab7Iterator;

public class Mathcer {
    public static String getNameMatchedType(RoomTypes type){
        String match = "";

        switch (type){
            case BEDROOM -> match = "Спальня";
            case KITCHEN -> match = "Кухня";
            case TOILET -> match = "Туалет";
            default -> {

            }
        }

        return match;
    }
}
