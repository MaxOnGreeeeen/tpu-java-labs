package tpu.labs.lab3Decorator;

public class Edition implements EditionCreator {
    private String name;
    private String headMasterName;
    private int yearOfEdition;
    private String authorName;

    public Edition(String name, String headMasterName, int yearOfEdition, String authorName) {
        this.name = name;
        this.headMasterName = headMasterName;
        this.yearOfEdition = yearOfEdition;
        this.authorName = authorName;
    }

    public int getYearOfEdition() {
        return this.yearOfEdition;
    }

    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadMasterName() {
        return this.headMasterName;
    }

    public void setHeadMasterName(String headMasterName) {
        this.headMasterName = headMasterName;
    }

    @Override
    public String getDescription() {
        return "Name - " + this.name + "\n" + "Headmaster name - " + this.headMasterName + "\n" + "\nAuthor - "
                + this.authorName + "\n"
                + "Year of edition - " + this.yearOfEdition;
    }
}
