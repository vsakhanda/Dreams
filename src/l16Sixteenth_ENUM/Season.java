package l16Sixteenth_ENUM;

public enum Season {

    WINTER("Cold"),
    SPRING( "Ideal"),
    SUMMER("Hot"),
    AUTUMN("Perfect");


    // Додано поле до ENUM
    private final String description;

    //Додано  конструктор
    Season(String description) {this.description = description;
    }

    // Додано метод, щоб діставати опис(description)
    public String getDescription() {return this.description;}
}
