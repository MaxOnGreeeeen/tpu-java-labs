package tpu.labs.lab6AbstractFactory.DepartmentFactory;

import tpu.labs.lab6AbstractFactory.Book;
import tpu.labs.lab6AbstractFactory.Journal;
import tpu.labs.lab6AbstractFactory.ScienceLitaraturDepartment.ScienceJournal;

public interface DepartmentFactory {
    Book createBook();

    Journal createJournal();
}
