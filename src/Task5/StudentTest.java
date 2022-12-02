package Task5;

public class StudentTest {
    public static void main(String[] args) {
        StudentInfo stud1 = new StudentInfo(
                new Name("Vasilii", "Vetrov"),
                new Grade(6, 8, 7),
                202, 1985);
        StudentInfo stud2 = new StudentInfo(
                new Name("Petr", "Ivanov"),
                new Grade(6.8, 8.4, 3.4),
                212, 1995);
        StudentInfo stud3 = new StudentInfo(
                new Name("Sergey", "Shnurov"),
                new Grade(10, 8, 6),
                222, 2005);

        StudentInfo[] students = {stud1, stud2, stud3};
        for (StudentInfo student : students) {
            System.out.println(student);
            System.out.println(student.getGrade().average(student));

        }
    }
}
