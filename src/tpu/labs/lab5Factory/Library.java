package tpu.labs.lab5Factory;

import java.util.ArrayList;

public class Library {
    private String name;
    private String headMasterName;

    private ArrayList<Department> departments = new ArrayList<>();

    public Library(String name, String headMasterName){
        this.headMasterName = headMasterName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadMasterName() {
        return headMasterName;
    }

    public void setHeadMasterName(String headMasterName) {
        this.headMasterName = headMasterName;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void addDepartment (Department department){
        this.departments.add(department);
    }

    public String getDescription(){
        return "Name - " + this.name + "\n"
                + "Manager - " + this.headMasterName
                + "\n---------------------------";
    }
}
