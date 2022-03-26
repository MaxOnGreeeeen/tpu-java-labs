package tpu.labs.lab1SubjectArea;

import java.util.ArrayList;

public class Department extends Library{
    private int editionAmount;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Journal> journals = new ArrayList<>();

    public Department(String name, String managerName, int editionAmount) {
        super(name, managerName);
        this.editionAmount = editionAmount;
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
    public ArrayList<Department> getDepartments() {
        return super.getDepartments();
    }

    public void addBook (Book book){
        this.books.add(book);
        this.editionAmount++;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Journal> getJournals() {
        return journals;
    }

    public void addJournal (Journal journal){
        this.journals.add(journal);
        this.editionAmount++;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Edition amount - " + this.editionAmount +
                "\n----------------------";
    }
}
