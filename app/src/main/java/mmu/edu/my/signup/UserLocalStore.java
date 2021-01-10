package mmu.edu.my.signup;

import android.content.Context;
import android.content.SharedPreferences;

public class UserLocalStore {

    public static final  String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;

    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME, 0 );
    }

    public void storeUserData(User user){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putString("name", user.name);
        spEditor.putString("email", user.email);
        spEditor.putString("password", user.password);
        spEditor.putString("address", user.address);
        spEditor.putInt("number", user.number);
        spEditor.commit();

    }
    public User getLoggedInUser(){
        String name = userLocalDatabase.getString("name","");
        String email = userLocalDatabase.getString("email", "");
        String password = userLocalDatabase.getString("password","");
        int number = userLocalDatabase.getInt("number", -1);
        String address = userLocalDatabase.getString("address", "");

        User storedUser = new User(name, email, password, number, address);

        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn(){
        if (userLocalDatabase.getBoolean("loggedin", false) == true){
            return true;
        }
        else{
            return false;}
    }

    public void clearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
