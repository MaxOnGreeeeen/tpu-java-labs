package com.company;
public class Book extends Edition  {
    private String resume;

    Book(String name1,String name, String author, int year, String resume) throws GodIzdaniyaException{
        super(name1, name, author, year);
        this.resume = resume;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    public String getDescription() throws BookException {
        try{
            if(name == null || name.equals("") || author == null || author.equals("") ){
                throw new BookException("Incorrect name of book and Author name");
            }
        }catch ( BookException ex) {
            System.err.println(ex.getMessage());
        }
        return " Книга: "  +
                "\nАвтор: " + this.getAuthor() +
                "\nГод: " + this.getYear() +
                "\nНазвание: " + this.getName() +
                "\nРезюме: " + this.getResume();
    }
}