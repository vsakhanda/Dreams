package l19collection3.homework;

import java.util.Objects;

public class vocabulary {

    private String English;
    private String Japan;
    private String German;


    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getJapan() {
        return Japan;
    }

    public void setJapan(String japan) {
        Japan = japan;
    }

    public String getGerman() {
        return German;
    }

    public void setGerman(String german) {
        German = german;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof vocabulary that)) return false;

        if (!Objects.equals(English, that.English)) return false;
        if (!Objects.equals(Japan, that.Japan)) return false;
        return Objects.equals(German, that.German);
    }

    @Override
    public int hashCode() {
        int result = English != null ? English.hashCode() : 0;
        result = 31 * result + (Japan != null ? Japan.hashCode() : 0);
        result = 31 * result + (German != null ? German.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Переклад{" +
                "English='" + English + '\'' +
                ", Japan='" + Japan + '\'' +
                ", German='" + German + '\'' +
                '}';
    }
}
