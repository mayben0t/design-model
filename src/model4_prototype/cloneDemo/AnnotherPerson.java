package model4_prototype.cloneDemo;

public class AnnotherPerson implements Cloneable {
    private int id;
    private String name;

    public AnnotherPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected AnnotherPerson clone() throws CloneNotSupportedException {
        AnnotherPerson person = (AnnotherPerson)super.clone();
        person.setName(new String(getName()));
        return person;
    }
}
