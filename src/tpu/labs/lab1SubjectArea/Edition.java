package tpu.labs.lab1SubjectArea;

public class Edition extends Library{
    private int yearOfEdition;
    private String authorName;

    public Edition(String name, String headMasterName, int yearOfEdition, String authorName) {
        super(name, headMasterName);
        this.yearOfEdition = yearOfEdition;
        this.authorName = authorName;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
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

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getHeadMasterName() {
        return super.getHeadMasterName();
    }

    @Override
    public void setHeadMasterName(String headMasterName) {
        super.setHeadMasterName(headMasterName);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nAuthor - " + this.authorName + "\n"
                + "Year of edition - " + this.yearOfEdition;
    }
}
