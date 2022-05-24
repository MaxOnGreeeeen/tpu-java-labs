package tpu.labs.lab6AbstractFactory.DepartmentFactory;

import tpu.labs.lab6AbstractFactory.Journal;
import tpu.labs.lab6AbstractFactory.Book;
import tpu.labs.lab6AbstractFactory.HistoryLitaratureDepartment.HistoryBook;
import tpu.labs.lab6AbstractFactory.HistoryLitaratureDepartment.HistoryJournal;
import tpu.labs.lab6AbstractFactory.JournaBooklTypes;
import tpu.labs.lab6AbstractFactory.RandomObjectsGenerator;

public class HistoricalLitaratureDepartmentFactory implements DepartmentFactory{

    @Override
    public Book createBook() {
        return new HistoryBook(RandomObjectsGenerator.getRandomString(5),RandomObjectsGenerator.getRandomString(5),
                RandomObjectsGenerator.getRandomNumber(1900, 120), RandomObjectsGenerator.getRandomString(10),
                RandomObjectsGenerator.getRandomNumber(0,1000), JournaBooklTypes.HISTORICAL);
    }

    @Override
    public Journal createJournal() {
        return new HistoryJournal(RandomObjectsGenerator.getRandomString(5),RandomObjectsGenerator.getRandomString(5),
                RandomObjectsGenerator.getRandomNumber(1900, 120), RandomObjectsGenerator.getRandomString(10),
                RandomObjectsGenerator.getRandomNumber(0,1000), JournaBooklTypes.HISTORICAL);
    }
}
