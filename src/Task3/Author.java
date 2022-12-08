package Task3;

public class Author implements Show {

    private String name;

    public Author(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}
