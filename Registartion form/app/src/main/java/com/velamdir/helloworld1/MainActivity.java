package com.velamdir.helloworld1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextFirstName, editTextLastName, editTextEmail;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        txtResult = findViewById(R.id.txtResult);
    }

    public void onRegisterButtonClick(View view) {
        String firstName = editTextFirstName.getText().toString();
        String lastName = editTextLastName.getText().toString();
        String email = editTextEmail.getText().toString();

        String result = "Registration Details:\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Email: " + email;

        txtResult.setText(result);
    }
}
