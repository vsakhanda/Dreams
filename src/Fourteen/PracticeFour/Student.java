package Fourteen.PracticeFour;

import java.util.Objects;

public class Student implements Compareble {

    private String name;
    private float gradePointAverage;

    public Student(String name, float gradePointAverage) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(float gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (Float.compare(student.gradePointAverage, gradePointAverage) != 0) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gradePointAverage != +0.0f ? Float.floatToIntBits(gradePointAverage) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradePointAverage=" + gradePointAverage +
                '}';
    }

    @Override
    public void compareTo(Student student) {
        if (this.gradePointAverage > student.gradePointAverage) {
            System.out.println("У студента " + getName() + " середній бал вище ніж у студента: " + student.getName());
        } else if(student.gradePointAverage > this.gradePointAverage) {
            System.out.println("У студента " + student.getName() + " середній бал вище ніж у студента: " + getName());
        } else {
            System.out.println("Оцінки однакові");
        }
    }
}
