package l21StreamAPILambda.HomeWork;

public class Student {

    public Student(String name, int score) {
        this.Name = name;
        this.Score = score;
    }

    private String Name;
    private int Score;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (Score != student.Score) return false;
        return Name.equals(student.Name);
    }

    @Override
    public int hashCode() {
        int result = Name.hashCode();
        result = 31 * result + Score;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
