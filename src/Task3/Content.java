package Task3;

public class Content implements Show{
private String content;

    public Content(String content) {
        this.content = content;
    }

    @Override
    public void show() {
        System.out.println(content);
    }
}
