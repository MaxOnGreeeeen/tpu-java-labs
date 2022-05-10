package tpu.labs.lab3Decorator;
import java.util.Scanner;

public class RunApplication {
    public static String alphabetEng = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число объeктов для генерации");

        try {
            int totalAmountOfObjects = scanner.nextInt();

            generateObjects(totalAmountOfObjects);
        }catch (Exception error){
            throw new Exception("Incorrect format of data");
        }
    }

    public static void generateObjects (int amountOfObjects){
        LibraryCreator library = new Library(getRandomString(5), getRandomString(5));

        for (int i = 0; i < amountOfObjects; i++){
            Department department = new Department(getRandomString(10),
                    getRandomString(10), getRandomNumber(0, 2));

            library.addDepartment(department);

            for (int j = 0; j < amountOfObjects; j++){
                EditionCreator book = new Book(getRandomString(5),getRandomString(5),
                        getRandomNumber(1900, 120), getRandomString(10),
                        getRandomNumber(0,1000));

                EditionCreator journal = new Journal(getRandomString(5),getRandomString(5),
                        getRandomNumber(1900, 120), getRandomString(10),
                        getRandomNumber(0,10));

                department.addBook(book);
                department.addJournal(journal);
            }

        }
        showDescription(library);
    }

    public static void showDescription(LibraryCreator library){
        System.out.println("Библиотека: \n");
        System.out.println(library.getDescription());
        for (Department department: library.getDepartments()){
            System.out.println("Отдел: \n");
            System.out.println(department.getDescription());

            for (EditionCreator book : department.getBooks()){
                System.out.println("Книга: \n");
                System.out.println(book.getDescription());
            }

            for (EditionCreator journal: department.getJournals()){
                System.out.println("Журнал: \n");
                System.out.println(journal.getDescription());
            }

        }
    }

    public static int getRandomNumber(int start, int max){
        return (int) (Math.random()*max + start);
    }

    public static String getRandomString (int length){
        StringBuilder resultString = new StringBuilder();

        for (int i = 0; i < length; i++){
            resultString.append(alphabetEng.charAt((int) (Math.random() * alphabetEng.length())));
        }

        return resultString.toString();
    }
}
