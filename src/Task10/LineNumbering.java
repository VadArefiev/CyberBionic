package Task10;

import java.util.ArrayList;
import java.util.List;

class LineNumbering {

    public static List<String> number(List<String> lines) {
        int count = 1;
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, count + ": " + lines.get(i));
            count++;
        }
        return lines;
    }

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add(0,"a");
        lines.add(1,"b");
        lines.add(2,"c");
        System.out.println(LineNumbering.number(lines));
    }
}
