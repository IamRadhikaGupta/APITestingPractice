package POSTCALLS;

public class User {

    public String name;
    public String email;
    public String gender;
    public String status;

    public User(){}

    public User(String name,String email,String gender,String status){
        this.name=name;
        this.email=email;
        this.gender=gender;
        this.status=status;
    }

    public void setName(String name){
    this.name=name;
    }
    public void setEmail(String email){
      this.email=email;
    }
    public void setGender(String gender){
      this.gender=gender;
    }
    public void setStatus(String status){
      this.status=status;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public String getGender(){
        return gender;
    }

    public String getStatus(){
        return status;
    }
}
