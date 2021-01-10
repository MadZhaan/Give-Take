package mmu.edu.my.signup;

public class User {
    String name, email, password, address;
    int number;

    public User(String name, String number, String email, String password, int address){
        this.name = name;
        this.email = email;
        this.number = number;
        this.password = password;
        this.address = address;

    }

    public User(String name, String address, String email, int number, String password){
        this.email = email;
        this.password = password;
        this.number = -1;
        this.address = "";
        this.name = "";


    }
}
