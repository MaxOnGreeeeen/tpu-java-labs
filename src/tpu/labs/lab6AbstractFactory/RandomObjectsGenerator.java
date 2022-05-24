package tpu.labs.lab6AbstractFactory;

public class RandomObjectsGenerator {
    private static String alphabetEng = "abcdefghijklmnopqrstuvwxyz";

    public RandomObjectsGenerator() {

    }

    public static int getRandomNumber(int start, int max){
        return (int) (Math.random()*max + start);
    }

    public static String getRandomString (int length){
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < length; i++){
            resultString.append(alphabetEng.charAt((int) (Math.random() * alphabetEng.length())));
        };

        return resultString.toString();
    }
}
