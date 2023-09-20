package l33JavaCoreFinal.homeWork33.entity;

import java.util.Date;
import java.util.Objects;

public class Note {

    private Integer id;
    private String name;
    private String text;
    private String author;
    private Date datetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public java.sql.Date getDatetime() {
        return (java.sql.Date) datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!Objects.equals(id, note.id)) return false;
        if (!Objects.equals(name, note.name)) return false;
        if (!Objects.equals(text, note.text)) return false;
        if (!Objects.equals(author, note.author)) return false;
        return Objects.equals(datetime, note.datetime);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
