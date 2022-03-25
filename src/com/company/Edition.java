package com.company;

public class Edition extends Library{
    public String name;
    public String author;
    private int year;
    public Edition (String name1,String name, String author, int year) throws GodIzdaniyaException {
        super(name1);
        this.name = name;
        this.author = author;
        this.year = year;
        try{
            if (year <= 0) throw new GodIzdaniyaException("«Невозможно создать издание – указан некорректный год издания ");
        }catch (GodIzdaniyaException ex){
            System.err.println("Ошибка " + ex.getMessage());
            throw ex;
        }

    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getDescription() throws BookException {
        return  (this.getName()  + " | " + this.getAuthor() + " | " + this.getYear());
    }
}
