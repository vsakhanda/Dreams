package l27DesignPaterns.HomeWork27.singeton;

public class Singleton {

    private static Singleton instance; // Створюємо змінную
    public int i = 0;
    private Singleton(){
    }

    public static Singleton getInstance(){ // Визначаємо метод, що буде повертати змінну
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

