package com.company;

import java.io.*;
import java.util.ArrayList;

public class LibraryReport{
    private String fileName;
    private String branch;
    private ArrayList<Edition> editions = new ArrayList<Edition>();
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = "C:\\Users\\User\\OneDrive\\Рабочий стол\\Lab4\\"+fileName+".txt";
    }
    public void formAndSafeReport(Library library) throws IOException, BookException {
        FileOutputStream file1 = new FileOutputStream(fileName);
        file1.write(("Библиотека: " + library.getName().toUpperCase()).getBytes());
        file1.write('\r');
        file1.write('\n');
        file1.write('\n');
        int counter = 0;
        for (Branch branch : library.getBranches())
        {
            counter = 0;
            file1.write(("Отдел: " + branch.getName()).getBytes());
            file1.write('\r');
            file1.write('\n');
            for (Edition editions: branch.getEditions()){
                file1.write((editions.getDescription()).getBytes());
                file1.write('\r');
                file1.write('\n');
                counter++;
            }
            file1.write("-------------".getBytes());
            file1.write('\n');
            file1.write(("Количество изданий по отделу " + counter ).getBytes());
            file1.write('\r');
            file1.write('\n');

        }

        file1.close();
    }
    public void loadReport(String name) throws IOException {
        byte[] b = new byte[1000];
        try {
            FileInputStream fileInputStream = new FileInputStream(name);
            b = new byte[fileInputStream.available()];
            fileInputStream.read(b);
        } catch (FileNotFoundException ex) {
            System.err.println("Отчёт не найден " + ex.getMessage());
        }
        String str = new String(b, "UTF-8");
        System.out.println(str);
    }
}
