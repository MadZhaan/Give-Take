package mmu.edu.my.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {
    Button bRegister;
    EditText etName, etEmail, etPassword, etNumber, etAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etNumber = (EditText) findViewById(R.id.etNumber);
        etAddress = (EditText) findViewById(R.id.etAddress);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bRegister:
                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String address = etAddress.getText().toString();
                int number = Integer.parseInt(etNumber.getText().toString());

                User registeredData = new User(name, email, password, address, number);

                break;

        }
    }
}