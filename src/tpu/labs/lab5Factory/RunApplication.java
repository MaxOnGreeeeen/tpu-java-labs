package tpu.labs.lab5Factory;

import java.util.Scanner;

public class RunApplication {
    public static RandomObjectsGenerator random = new RandomObjectsGenerator();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число объктов для генерации");

        int totalAmountOfObjects = scanner.nextInt();

        generateObjects(totalAmountOfObjects);
    }

    public static void generateObjects (int amountOfObjects){
        Library library = new Library(getRandomString(5), getRandomString(5));

        for (int i = 0; i < amountOfObjects; i++){
            Department department = new Department(getRandomString(10),
                    getRandomString(10), getRandomNumber(0, 2));

            library.addDepartment(department);

            for (int j = 0; j < amountOfObjects; j++){
                Edition book = new EditionFactory().createEdition(EditionType.BOOK);
                Edition journal = new EditionFactory().createEdition(EditionType.JOURNAL);

                department.addEdition(book);
                department.addEdition(journal);
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

            for (Edition edition : department.getEditions()){
                if(edition instanceof Book) {
                    System.out.println("Книга: \n");
                }

                if (edition instanceof Journal){
                    System.out.println("Журнал: \n");
                }

                System.out.println(edition.getDescription());
            }

        }
    }

    public static int getRandomNumber(int start, int max){
        return random.getRandomNumber(start, max);
    }

    public static String getRandomString(int length){
        return random.getRandomString(length);
    }
}
