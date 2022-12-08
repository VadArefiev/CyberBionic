package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int proKey = 123;
        int expKey = 321;
        Scanner scanner = new Scanner(System.in);
        int inputKey = scanner.nextInt();
        if (inputKey == proKey) {
            new ProDocumentWorker().saveDocument();
        } else if (inputKey == expKey) {
            new ExpertDocumentWorker().saveDocument();
        } else {
            System.out.println("Free + version");
        }
    }

}
