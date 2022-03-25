package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BookException, IOException {
        Scanner in = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите название библиотеки");
        Library li = new Library(in.nextLine());

        System.out.println("Введите название отдела и количество изданий в нем");
        Branch br1 = new Branch(li.getName(),in.nextLine(), scan.nextInt());
        Edition bo1 = null;
        System.out.println("Введите название издания книги, ее автора, год издания");

        try{
            bo1 = new Edition(br1.getName(),in.nextLine(), in.nextLine(), scan.nextInt());
        } catch (GodIzdaniyaException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }

        br1.addEdition(bo1);
        System.out.println("Введите название второй книги, ее автора, год издания ");
        Edition bo2 = null;
        try{
            bo2 = new Edition(br1.getName(),in.nextLine(), in.nextLine(), scan.nextInt());
        } catch (GodIzdaniyaException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
        br1.addEdition(bo2);

        Edition bo3 = null;

        System.out.println("Введите название журнала, его автора, год издания, название первой и второй статей");
        Catalog ca = null;
        try {
            ca = new Catalog(br1.getName(),in.nextLine(), in.nextLine(), scan.nextInt(), in.nextLine(), in.nextLine());
        } catch (GodIzdaniyaException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
        br1.addEdition(ca);
        li.addBranch(br1);
        System.out.println("Введите название отдела и количество изданий в нем");
        Branch br2 = new Branch(li.getName(),in.nextLine(), scan.nextInt());

        Edition b1 = null;
        System.out.println("Введите название издания книги, ее автора, год издания");

        try{
            b1 = new Edition(br1.getName(),in.nextLine(), in.nextLine(), scan.nextInt());
        } catch (GodIzdaniyaException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
        br2.addEdition(b1);

        System.out.println("Введите название второй книги, ее автора, год издания ");
        Edition b2 = null;
        try{
            b2 = new Edition(br1.getName(),in.nextLine(), in.nextLine(), scan.nextInt());
        } catch (GodIzdaniyaException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
        br2.addEdition(b2);

        Edition b3 = null;

        System.out.println("Введите название журнала, его автора, год издания, название первой и второй статей");
        Catalog ca1 = null;
        try {
            ca1 = new Catalog(br1.getName(),in.nextLine(), in.nextLine(), scan.nextInt(), in.nextLine(), in.nextLine());
        } catch (GodIzdaniyaException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
        br2.addEdition(ca1);
        li.addBranch(br2);

        LibraryReport libraryReport = new LibraryReport();
        InputReader inputReader = new InputReader();

        System.out.println("Введите имя файла отчёта");
        Scanner in1 = new Scanner(System.in);
        libraryReport.setFileName(in1.nextLine());
        libraryReport.formAndSafeReport(li);
        libraryReport.loadReport(libraryReport.getFileName());

        in.close();
        scan.close();


    }
}






