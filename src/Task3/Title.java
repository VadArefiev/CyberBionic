package Task3;

public class Title implements Show {

    private String title;

    public Title(String title) {
        this.title = title;
    }

    public void show() {
       System.out.println(title);
   }
}
