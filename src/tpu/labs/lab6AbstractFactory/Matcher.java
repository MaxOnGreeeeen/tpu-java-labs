package tpu.labs.lab6AbstractFactory;

public class Matcher {
    public static String getNameMatchedType(JournaBooklTypes type){
        String match = "";
        switch (type){
            case FANTASTIC -> match = "Fantastic";
            case SCIENTIFIC -> match = "Scientific";
            case HISTORICAL -> match = "Historical";
            default -> {

            }
        }

        return match;
    }
}
