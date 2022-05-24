package tpu.labs.lab6AbstractFactory.ScienceLitaraturDepartment;

import tpu.labs.lab6AbstractFactory.Journal;
import tpu.labs.lab6AbstractFactory.JournaBooklTypes;
import tpu.labs.lab6AbstractFactory.Matcher;

public class ScienceJournal extends Journal {
    private JournaBooklTypes type;

    public ScienceJournal(String name, String headMasterName, int yearOfEdition, String authorName, int amountOfReleases,
                          JournaBooklTypes type) {
        super(name, headMasterName, yearOfEdition, authorName, amountOfReleases);

        this.type = type;
    }

    @Override
    public String getDescription() {
        return Matcher.getNameMatchedType(type) + " journal\n" + super.getDescription();
    }
}
