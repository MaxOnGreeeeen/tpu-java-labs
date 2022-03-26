package tpu.labs.lab1SubjectArea;

public class Book extends Edition{
    private int amountOfPages;
    public Book(String name, String headMasterName, int yearOfEdition, String authorName,
                int amountOfPages) {
        super(name, headMasterName, yearOfEdition, authorName);
        this.amountOfPages = amountOfPages;
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
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nAmount of pages - "
                + this.amountOfPages +
                "\n-----------------------------";
    }
}
