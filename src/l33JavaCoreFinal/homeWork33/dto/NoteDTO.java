package l33JavaCoreFinal.homeWork33.dto;

import java.util.Objects;

public class NoteDTO {

    private Integer id;
    private String name;
    private String text;
    private String author;
    private String datetime;

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

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteDTO noteDTO = (NoteDTO) o;

        if (!Objects.equals(id, noteDTO.id)) return false;
        if (!Objects.equals(name, noteDTO.name)) return false;
        if (!Objects.equals(text, noteDTO.text)) return false;
        if (!Objects.equals(author, noteDTO.author)) return false;
        return Objects.equals(datetime, noteDTO.datetime);
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
        return "NoteDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", datetime=" + datetime +
                '}';
    }
}
