package tpu.labs.lab6AbstractFactory.DepartmentFactory;

import tpu.labs.lab6AbstractFactory.Journal;
import tpu.labs.lab6AbstractFactory.Book;
import tpu.labs.lab6AbstractFactory.JournaBooklTypes;
import tpu.labs.lab6AbstractFactory.RandomObjectsGenerator;
import tpu.labs.lab6AbstractFactory.ScienceLitaraturDepartment.ScienceBook;
import tpu.labs.lab6AbstractFactory.ScienceLitaraturDepartment.ScienceJournal;

public class ScientificLitaratureDepartmentFactory implements DepartmentFactory{
    @Override
    public Book createBook() {
        return new ScienceBook(RandomObjectsGenerator.getRandomString(5),RandomObjectsGenerator.getRandomString(5),
                RandomObjectsGenerator.getRandomNumber(1900, 120), RandomObjectsGenerator.getRandomString(10),
                RandomObjectsGenerator.getRandomNumber(0,1000), JournaBooklTypes.SCIENTIFIC);
    }

    @Override
    public Journal createJournal() {
        return new ScienceJournal(RandomObjectsGenerator.getRandomString(5),RandomObjectsGenerator.getRandomString(5),
                RandomObjectsGenerator.getRandomNumber(1900, 120), RandomObjectsGenerator.getRandomString(10),
                RandomObjectsGenerator.getRandomNumber(0,1000), JournaBooklTypes.SCIENTIFIC);
    }
}
