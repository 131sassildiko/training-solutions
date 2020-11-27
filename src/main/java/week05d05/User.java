package week05d05;

public class User {

    private String firstName;
    private String lastname;
    private String eMail;

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String geteMail() {
        return eMail;
    }
    public String getFullName () {
        return firstName +" "+ lastname;
    }
    public User(String firstName, String lastname, String eMail) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.eMail = eMail;
        if (!eMail.contains("@")||!eMail.contains(".")){
            throw new IllegalArgumentException("wrong e-mail");
        }
    }

    }

