package tpu.labs.lab3Decorator;

public class EditionDecorator implements EditionCreator {
    private String name;
    private String headMasterName;
    private int yearOfEdition;
    private String authorName;

    public EditionDecorator(String name, String headMasterName, int yearOfEdition, String authorName) {
        this.name = name;
        this.headMasterName = headMasterName;
        this.yearOfEdition = yearOfEdition;
        this.authorName = authorName;
    }

    @Override
    public String getDescription() {
        return "Name - " + this.name + "\n" + "Headmaster name - " + this.headMasterName + "\n" + "\nAuthor - "
                + this.authorName + "\n"
                + "Year of edition - " + this.yearOfEdition;
    }

    @Override
    public int getYearOfEdition() {
        return this.yearOfEdition;
    }

    @Override
    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    @Override
    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getHeadMasterName() {
        return this.headMasterName;
    }

    @Override
    public void setHeadMasterName(String headMasterName) {
        this.headMasterName = headMasterName;
    }
}
