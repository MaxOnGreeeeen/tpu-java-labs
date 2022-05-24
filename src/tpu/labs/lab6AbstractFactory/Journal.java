package tpu.labs.lab6AbstractFactory;

import tpu.labs.lab6AbstractFactory.Edition;

public class Journal extends Edition {
    private int amountOfReleases;

    public Journal(String name, String headMasterName, int yearOfEdition, String authorName,
                   int amountOfReleases) {
        super(name, headMasterName, yearOfEdition, authorName);
        this.amountOfReleases = amountOfReleases;
    }

    public int getAmountOfReleases() {
        return amountOfReleases;
    }

    public void setAmountOfReleases(int amountOfReleases) {
        this.amountOfReleases = amountOfReleases;
    }

    @Override
    public int getYearOfEdition() {
        return super.getYearOfEdition();
    }

    @Override
    public void setYearOfEdition(int yearOfEdition) {
        super.setYearOfEdition(yearOfEdition);
    }

    @Override
    public String getAuthorName() {
        return super.getAuthorName();
    }

    @Override
    public void setAuthorName(String authorName) {
        super.setAuthorName(authorName);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nAmount of releases - "
                + this.amountOfReleases + "\n-------------------------";
    }
}
