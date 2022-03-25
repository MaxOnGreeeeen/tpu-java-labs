package com.company;

import java.util.ArrayList;

public class Library {
    private String name;
    private Edition edition;
    private Branch branch;
    private ArrayList<Edition> Editions = new ArrayList<Edition>();
    Library(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    private ArrayList<Branch> branches = new ArrayList();

    public ArrayList<Branch> getBranches() { return branches; }

    public void addBranch(Branch branch)         {
        this.branches.add(branch);
    }

}
