package Task5;

public class StudentInfo {
    private final Name name;
    public Grade grade;
    private final int id;
    private final int course;

    public StudentInfo(Name name, Grade grade, int id, int course) {
        this.name = name;
        this.grade = grade;
        this.id = id;
        this.course = course;
    }

    public Name getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name +
                ", " + grade +
                ", numberTicket=" + id +
                ", yearEduc=" + course +
                '}';
    }
}

