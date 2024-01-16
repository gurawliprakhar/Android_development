package com.velamdir.myliberary;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewProfile;
    private EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private RadioGroup radioGroupGender;
    private CheckBox checkBoxTerms;
    private Spinner spinnerCountry;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        imageViewProfile = findViewById(R.id.imageViewProfile);
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        checkBoxTerms = findViewById(R.id.checkBoxTerms);
        spinnerCountry = findViewById(R.id.spinnerCountry);
        buttonRegister = findViewById(R.id.buttonRegister);

        // Set up the spinner with dummy data (replace with actual country data)
        ArrayAdapter<CharSequence> countryAdapter = ArrayAdapter.createFromResource(
                this, R.array.dummy_country, android.R.layout.simple_spinner_item);

        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountry.setAdapter(countryAdapter);

        // Set up a listener for the Register button
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the button click (e.g., validate inputs and perform registration)
                registerUser();
            }
        });

        // Set up a listener for the country spinner
        spinnerCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedCountry = adapterView.getItemAtPosition(position).toString();
                // Handle the selected country (e.g., store it in a variable)
                Toast.makeText(MainActivity.this, "Selected Country: " + selectedCountry, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Handle the case where nothing is selected
            }
        });
    }

    // Placeholder method for user registration logic
    private void registerUser() {
        // Implement your user registration logic here
        Toast.makeText(this, "User Registered!", Toast.LENGTH_SHORT).show();
    }
}
