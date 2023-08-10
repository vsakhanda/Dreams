package l21StreamAPILambda.HomeWork;

public class Student {

    public Student(String name, Integer score) {
        this.Name = name;
        this.Score = score;
    }

    private String Name;
    private Integer Score;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!Name.equals(student.Name)) return false;
        return Score.equals(student.Score);
    }

    @Override
    public int hashCode() {
        int result = Name.hashCode();
        result = 31 * result + Score.hashCode();
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
