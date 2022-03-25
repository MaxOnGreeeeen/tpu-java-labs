package com.company;

import java.util.ArrayList;

public class Branch extends Library {
    private String nam;
    private int amountOfEdition;
    private ArrayList<Edition> editions = new ArrayList<Edition>();

    public Branch(String name1,String nam, int amountOfEdition) {
        super(name1);
        this.nam = nam;
        this.amountOfEdition = amountOfEdition;
    }

    public String getName() {
        return nam;
    }
    public void setName(String nam) {
        this.nam = nam;
    }

    public int getAmountOfEdition() {
        return amountOfEdition;
    }

    public void setAmountOfEdition(int amountOfEdition) {
        this.amountOfEdition = amountOfEdition;
    }
    public ArrayList<Edition> getEditions() { return editions; }

    public void addEdition(Edition edition) {
        this.editions.add(edition);
    }

}
