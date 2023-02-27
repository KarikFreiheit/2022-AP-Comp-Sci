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
        return ("First Name: " + firstName + " Last Name: " + lastName + " ID: " + id + " Grade: " + gradeLetter + ", " + gradePercentage);
    }


}
