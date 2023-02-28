public class User {

    public String firstName;
    public String lastName;
    public int id;
    public float gradePercentage;
    public Character gradeLetter;



    public User(String firstName, String lastName, int id, float gradePercentage, Character gradeLetter){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gradePercentage = gradePercentage;
        this.gradeLetter = gradeLetter;

    }

    public String getUser(){
        return String.format("%-20s%-20s%-20s%-20s%-20s\n", firstName, lastName, id, gradeLetter, gradePercentage);
    }


}
