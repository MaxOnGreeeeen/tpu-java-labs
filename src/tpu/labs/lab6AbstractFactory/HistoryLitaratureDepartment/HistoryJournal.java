package tpu.labs.lab6AbstractFactory.HistoryLitaratureDepartment;

import tpu.labs.lab6AbstractFactory.Journal;
import tpu.labs.lab6AbstractFactory.JournaBooklTypes;
import tpu.labs.lab6AbstractFactory.Matcher;

public class HistoryJournal extends Journal {
    private JournaBooklTypes type;
    public HistoryJournal(String name, String headMasterName, int yearOfEdition, String authorName, int amountOfReleases,
                          JournaBooklTypes type) {
        super(name, headMasterName, yearOfEdition, authorName, amountOfReleases);

        this.type = type;
    }

    @Override
    public String getDescription() {
        return Matcher.getNameMatchedType(type) + " journal\n" + super.getDescription();
    }
}
