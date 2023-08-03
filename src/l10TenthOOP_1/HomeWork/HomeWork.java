package l10TenthOOP_1.HomeWork;
/*

Створити клас, який описує студента(з ім'ям / призвіщем / віком)
та клас для опису викладача (з ім'ям / призвіщем / віком / студентом(ваш клас)
до нього додоти гетери / сетери, створити об'єкти в вашому мейн методі
*/


public class HomeWork {

    public static void main(String[] args){

        Lector ganibal = new Lector("Volodymyr", "Vynnychenko", 45);

        Student student1 = new Student("Oleksandr", "Adamovich", 27);
        Student student2 = new Student("Oleksandr", "Babenko", 26);
        Student student3 = new Student("Oleksandr", "Chaika", 28);
        Student student4 = new Student("Oleksandr", "Dmytruk", 29);
        Student student5 = new Student("Oleksandr", "Foka", 28);
        Student student6 = new Student("Oleksandr", "George", 27);
        Student student7 = new Student("Oleksandr", "Hlibchanko", 28);
        Student student8 = new Student("Oleksandr", "Klymenko", 27);
        Student student9 = new Student("Oleksandr", "Kornienko", 28);
        Student student10 = new Student("Oleksandr", "Kondratiyk", 28);

        System.out.println("Перелік студентів першої групи з Лектором "
                + ganibal.getlName() + " "+ ganibal.getlSurname() +" " +"(" + ganibal.getlAge() + ")");


        System.out.println(student1.getName() + " "+ student1.getSurname() + " " + student1.getAge());
        System.out.println(student2.getName() + " "+ student2.getSurname() + " " + student2.getAge());
        System.out.println(student3.getName() + " "+ student3.getSurname() + " " + student3.getAge());
        System.out.println(student4.getName() + " "+ student4.getSurname() + " " + student4.getAge());
        System.out.println(student5.getName() + " "+ student5.getSurname() + " " + student5.getAge());
        System.out.println(student6.getName() + " "+ student6.getSurname() + " " + student6.getAge());
        System.out.println(student7.getName() + " "+ student7.getSurname() + " " + student7.getAge());
        System.out.println(student8.getName() + " "+ student8.getSurname() + " " + student8.getAge());
        System.out.println(student9.getName() + " "+ student9.getSurname() + " " + student9.getAge());
        System.out.println(student10.getName() + " "+ student10.getSurname() + " " + student10.getAge());

    }




}



