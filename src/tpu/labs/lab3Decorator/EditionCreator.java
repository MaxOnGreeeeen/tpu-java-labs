package tpu.labs.lab3Decorator;

public interface EditionCreator {
    public String getDescription();

    public int getYearOfEdition();

    public void setYearOfEdition(int yearOfEdition);

    public String getAuthorName();

    public void setAuthorName(String authorName);

    public String getName();

    public void setName(String name);

    public String getHeadMasterName();

    public void setHeadMasterName(String headMasterName);
}
