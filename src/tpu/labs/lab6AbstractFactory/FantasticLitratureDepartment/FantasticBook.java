package tpu.labs.lab6AbstractFactory.FantasticLitratureDepartment;

import tpu.labs.lab6AbstractFactory.Book;
import tpu.labs.lab6AbstractFactory.JournaBooklTypes;
import tpu.labs.lab6AbstractFactory.Matcher;

public class FantasticBook extends Book {
    private JournaBooklTypes type;

    public FantasticBook(String name, String headMasterName, int yearOfEdition, String authorName, int amountOfPages,
                       JournaBooklTypes type) {
        super(name, headMasterName, yearOfEdition, authorName, amountOfPages);
        this.type = type;
    }

    @Override
    public String getDescription() {
        return Matcher.getNameMatchedType(type) + " book\n" + super.getDescription();
    }
}
