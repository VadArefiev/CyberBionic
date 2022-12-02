package Task5;

public class StudentInfo {
    private final Name name;
    public Grade grade;
    private final int numberTicket;
    private final int yearEduc;

    public StudentInfo(Name name, Grade grade, int numberTicket, int yearEduc) {
        this.name = name;
        this.grade = grade;
        this.numberTicket = numberTicket;
        this.yearEduc = yearEduc;
    }

    public Name getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return  name +
                ", " + grade +
                ", numberTicket=" + numberTicket +
                ", yearEduc=" + yearEduc +
                '}';
    }
}

