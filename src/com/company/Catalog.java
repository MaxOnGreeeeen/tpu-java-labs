package com.company;
public class Catalog extends Edition {
    private String article1;
    private String article2;

    public Catalog(String name1, String name, String author, int year, String article1, String article2) throws GodIzdaniyaException{
        super(name1,name, author, year);
        this.article1 = article1;
        this.article2 = article2;
    }
    public String getArticle1() {
        return article1;
    }
    public String getArticle2() {
        return article2;
    }
    public void setArticle1(String article1) {
        this.article1 = article1;
    }
    public void setArticle2(String article2) {
        this.article2 = article2;
    }
    public String getDescription() throws BookException {
        try{
            if(name == null || name.equals("") || author == null || author.equals("")){
                throw new BookException("Incorrect name of book and Author name");
            }
        }catch ( BookException ex) {
            System.err.println(ex.getMessage());
        }
        return  this.author + "|" + this.getName() + "|" + this.getYear();

    }
}
