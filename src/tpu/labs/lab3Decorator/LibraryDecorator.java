package tpu.labs.lab3Decorator;

import java.util.ArrayList;

public class LibraryDecorator implements LibraryCreator {
    private String name;
    private String headMasterName;

    private ArrayList<Department> departments = new ArrayList<>();

    public LibraryDecorator(String name, String headMasterName) {
        this.name = name;
        this.headMasterName = headMasterName;
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

    @Override
    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    @Override
    public ArrayList<Department> getDepartments() {
        return this.departments;
    }

    @Override
    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    @Override
    public String getDescription() {
        return "Name - " + this.name + "\n"
                + "Manager - " + this.headMasterName
                + "\n---------------------------";
    }
}
