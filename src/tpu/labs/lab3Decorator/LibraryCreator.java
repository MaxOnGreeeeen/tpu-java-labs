package tpu.labs.lab3Decorator;

import java.util.ArrayList;

public interface LibraryCreator {
    public String getName();

    public void setName(String name);

    public String getHeadMasterName();

    public void setHeadMasterName(String headMasterName);
    public void setDepartments(ArrayList<Department> departments);

    public ArrayList<Department> getDepartments();

    public void addDepartment (Department department);

    public String getDescription();
}
