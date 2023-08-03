package l13Thirteen;

public abstract class Animal {

    private String animalName;

    public String getAnimalName() {return animalName;};

    public void setAnimalName(String animalName) {
        this.animalName = animalName;}

    public abstract void bork();

    public abstract void name();
    }

