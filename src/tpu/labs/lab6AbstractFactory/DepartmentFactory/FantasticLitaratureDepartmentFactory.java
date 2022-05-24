package tpu.labs.lab6AbstractFactory.DepartmentFactory;

import tpu.labs.lab6AbstractFactory.Journal;
import tpu.labs.lab6AbstractFactory.Book;
import tpu.labs.lab6AbstractFactory.FantasticLitratureDepartment.FantasticBook;
import tpu.labs.lab6AbstractFactory.FantasticLitratureDepartment.FantasticJournal;
import tpu.labs.lab6AbstractFactory.JournaBooklTypes;
import tpu.labs.lab6AbstractFactory.RandomObjectsGenerator;

public class FantasticLitaratureDepartmentFactory implements DepartmentFactory{
    @Override
    public Book createBook() {
        return new FantasticBook(RandomObjectsGenerator.getRandomString(5),RandomObjectsGenerator.getRandomString(5),
                RandomObjectsGenerator.getRandomNumber(1900, 120), RandomObjectsGenerator.getRandomString(10),
                RandomObjectsGenerator.getRandomNumber(0,1000), JournaBooklTypes.FANTASTIC);
    }

    @Override
    public Journal createJournal() {
        return new FantasticJournal(RandomObjectsGenerator.getRandomString(5),RandomObjectsGenerator.getRandomString(5),
                RandomObjectsGenerator.getRandomNumber(1900, 120), RandomObjectsGenerator.getRandomString(10),
                RandomObjectsGenerator.getRandomNumber(0,1000), JournaBooklTypes.FANTASTIC);
    }
}
