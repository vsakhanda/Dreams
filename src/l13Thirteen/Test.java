package l13Thirteen;

public class Test {

        private String nameOfAnimals;

        public void setAnimalName(){
            this.nameOfAnimals = nameOfAnimals;}

        public void whatisAnimal(Animal animal){
            System.out.println(animal.getAnimalName());
            nameOfAnimals+=animal.getAnimalName();
        }

        public String getAllNameOfAnimal() {
            return nameOfAnimals;
        }
}
