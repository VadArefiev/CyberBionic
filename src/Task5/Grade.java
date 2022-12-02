package Task5;

public class Grade {
    private final double avgMathematics;
    private final double avgEconomics;
    private final double avgLanguages;

    public Grade(double avgMathematics, double avgEconomics, double avgLanguages) {
        this.avgMathematics = avgMathematics;
        this.avgEconomics = avgEconomics;
        this.avgLanguages = avgLanguages;
    }

    public double average(StudentInfo student) {
        return (avgMathematics + avgEconomics + avgLanguages) / 3;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "avgMathematics=" + avgMathematics +
                ", avgEconomics=" + avgEconomics +
                ", avgLanguages=" + avgLanguages +
                '}';
    }
}
