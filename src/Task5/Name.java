package Task5;

public class Name {
    private final String name;
    private final String surname;

    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}