package tpu.labs.lab6AbstractFactory;

import tpu.labs.lab6AbstractFactory.DepartmentFactory.DepartmentFactory;
import tpu.labs.lab6AbstractFactory.DepartmentFactory.FantasticLitaratureDepartmentFactory;
import tpu.labs.lab6AbstractFactory.DepartmentFactory.HistoricalLitaratureDepartmentFactory;
import tpu.labs.lab6AbstractFactory.DepartmentFactory.ScientificLitaratureDepartmentFactory;

import java.util.Scanner;

public class RunApplication {
    public static String alphabetEng = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число объктов для генерации");

        int totalAmountOfObjects = scanner.nextInt();

        generateObjects(totalAmountOfObjects);
    }

    public static void generateObjects (int amountOfObjects){
        Library library = new Library(RandomObjectsGenerator.getRandomString(5),
                RandomObjectsGenerator.getRandomString(5));

        for (int i = 0; i < amountOfObjects; i++){
            DepartmentFactory departmentFactory = getDepartmentFactory();

            Department department = new Department(RandomObjectsGenerator.getRandomString(10),
                    RandomObjectsGenerator.getRandomString(10),
                    RandomObjectsGenerator.getRandomNumber(0, 2));

            library.addDepartment(department);

            for (int j = 0; j < amountOfObjects; j++){
                department.addBook(departmentFactory.createBook());
                department.addJournal(departmentFactory.createJournal());
            }

        }
        showDescription(library);
    }

    public static void showDescription(Library library){
        System.out.println("Библиотека: \n");
        System.out.println(library.getDescription());
        for (Department department: library.getDepartments()){
            System.out.println("Отдел: \n");
            System.out.println(department.getDescription());

            for (Book book : department.getBooks()){
                System.out.println("Книга: \n");
                System.out.println(book.getDescription());
            }

            for (Journal journal: department.getJournals()){
                System.out.println("Журнал: \n");
                System.out.println(journal.getDescription());
            }

        }
    }

    public static DepartmentFactory getDepartmentFactory(){
        DepartmentFactory departmentFactory = null;

        int typeOfDepartments = JournaBooklTypes.values().length;

        int randomValue = RandomObjectsGenerator.getRandomNumber(0, typeOfDepartments);

        System.out.println(typeOfDepartments);

        switch (randomValue){
            case 0 -> departmentFactory = new FantasticLitaratureDepartmentFactory();
            case 1 -> departmentFactory = new ScientificLitaratureDepartmentFactory();
            case 2 -> departmentFactory = new HistoricalLitaratureDepartmentFactory();
            default -> {}
         }

         return departmentFactory;
    }
}
