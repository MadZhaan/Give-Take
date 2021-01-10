package mmu.edu.my.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity implements View.OnClickListener {
    Button bLogin, bRegisterLink;
    EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bRegisterLink = (Button) findViewById(R.id.bRegisterLink);

        bRegisterLink.setOnClickListener(this);
        bLogin.setOnClickListener(this);

       // userLocalStore = new UserLocalStore(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:

                /*User user = new User(null, null);
                userLocalStore.storeUserData(user);
                userLocalStore.setUserLoggedIn(true);*/

                break;

            case R.id.bRegisterLink:

                startActivity(new Intent(this, Register.class));
                break;

        }
    }
}