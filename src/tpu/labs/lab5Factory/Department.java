package tpu.labs.lab5Factory;

import java.util.ArrayList;

public class Department extends Library {
    private int editionAmount;
    private ArrayList<Edition> editions = new ArrayList<>();

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

    public void addEdition (Edition edition){
        this.editions.add(edition);
        this.editionAmount++;
    }

    public ArrayList<Edition> getEditions() {
        return editions;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Edition amount - " + this.editionAmount +
                "\n----------------------";
    }
}
