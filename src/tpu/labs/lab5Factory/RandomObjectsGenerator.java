package tpu.labs.lab5Factory;

public class RandomObjectsGenerator {
    private String alphabetEng = "abcdefghijklmnopqrstuvwxyz";

    public RandomObjectsGenerator() {

    }

    public int getRandomNumber(int start, int max){
        return (int) (Math.random()*max + start);
    }

    public String getRandomString (int length){
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < length; i++){
            resultString.append(alphabetEng.charAt((int) (Math.random() * alphabetEng.length())));
        };

        return resultString.toString();
    }
}
