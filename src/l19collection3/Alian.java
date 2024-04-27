package l19collection3;

import java.util.Objects;

public class Alian {

    private String Name;
    private String Surname;
    private String Galactic;
    private Integer Height;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
    public String getGalactic() {
        return Galactic;
    }
    public void setGalactic(String galactic) {
        Galactic = galactic;
    }

    public Integer getHeight() {
        return Height;
    }

    public void setHeight(Integer height) {
        Height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alian alian)) return false;

        if (!Objects.equals(Name, alian.Name)) return false;
        if (!Objects.equals(Surname, alian.Surname)) return false;
        if (!Objects.equals(Galactic, alian.Galactic)) return false;
        return Objects.equals(Height, alian.Height);
    }

    @Override
    public int hashCode() {
        int result = Name != null ? Name.hashCode() : 0;
        result = 31 * result + (Surname != null ? Surname.hashCode() : 0);
        result = 31 * result + (Galactic != null ? Galactic.hashCode() : 0);
        result = 31 * result + (Height != null ? Height.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Alian{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Galactic='" + Galactic + '\'' +
                ", Height=" + Height +
                '}';
    }
}
