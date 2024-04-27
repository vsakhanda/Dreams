package l10TenthOOP_1.HomeWork;

public class Lector {


    public Lector(String lName, String lSurname, int lAge){
        this.lName = lName;
        this.lSurname = lSurname;
        this.lAge = lAge;
    }

    private String lName;
    private String lSurname;
    private Integer lAge;

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlSurname() {
        return lSurname;
    }

    public void setlSurname(String lSurname) {
        this.lSurname = lSurname;
    }

    public Integer getlAge() {
        return lAge;
    }

    public void setlAge(Integer lAge) {
        this.lAge = lAge;
    }




    public static void group() {

        String [][] studgroup = new String [10][3];
        studgroup[0][0] = "ffdd";

    }

    private void showName(String lName) {
        System.out.println(lName);
    }

}
