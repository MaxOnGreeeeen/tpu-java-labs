package tpu.labs.lab5Factory;

public class EditionFactory {
    public RandomObjectsGenerator random = new RandomObjectsGenerator();

    public Edition createEdition (EditionType type){
        Edition edition = null;

        switch (type){
            case BOOK -> edition = new Book(getRandomString(5),getRandomString(5),
                    getRandomNumber(1900, 120), getRandomString(10),
                    getRandomNumber(0,1000));

            case JOURNAL -> edition = new Journal(getRandomString(5),getRandomString(5),
                    getRandomNumber(1900, 120), getRandomString(10),
                    getRandomNumber(0,1000));

            default -> {
            }
        }

        return edition;
    }
    //Rewrite methods
    public int getRandomNumber(int start, int max){
        return random.getRandomNumber(start, max);
    }

    public String getRandomString(int length){
        return random.getRandomString(length);
    }
}
