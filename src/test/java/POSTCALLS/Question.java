package POSTCALLS;

import org.apache.juneau.annotation.Beanc;

public class Question {

    private String email;
    private String programme;
    private String lastName;
    private String firstName;

    //in constructor add annotation to show it is constructor beanc
    //in that constructor you can give properties that will define what is the name of the
    //variables in json file

    @Beanc(properties = "email,programme,lastName,firstName")
    public Question(String email, String programme, String lastName, String firstName) {
        this.email = email;
        this.programme = programme;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getProgramme() {
        return programme;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
