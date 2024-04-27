package l13Thirteen.HomeWork;

public class Lecturer {

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

    private String Name;
    private String Surname;

    private final Professor professor = new Professor();

    public Lecturer() {
        professor.setMainSubject("Math");
        professor.setAdditionalSubject("Programming");
    }

    public void describe(){
        System.out.println("Lecturer = " + getName() + " " + getSurname());
        System.out.println("   Main Subject = " + professor.getMainSubject());
        System.out.println("   Additional Subject = " + professor.getAdditionalSubject());
    }

    private static class Professor {
        private String mainSubject;
        private String additionalSubject;


        public String getMainSubject() {
            return mainSubject;
        }

        public void setMainSubject(String mainSubject) {
            this.mainSubject = mainSubject;
        }

        public String getAdditionalSubject() {
            return additionalSubject;
        }

        public void setAdditionalSubject(String additionalSubject) {
            this.additionalSubject = additionalSubject;
        }

        public String toString() {
            return "Subject {" +
                    "main subject=" + mainSubject +
                    ", additional subject=" + additionalSubject + '\'' +
                    '}';
        }
    }
}

