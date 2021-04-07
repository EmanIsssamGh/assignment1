package acoures.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText firstname, lastname, emailadd1,
            phonenum;
    Spinner mySpinner;
    RadioButton male, female;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        firstname = findViewById(R.id.ed_firstname);
        lastname = findViewById(R.id.ed_lastname);
        emailadd1 = findViewById(R.id.ed_email);
        phonenum = findViewById(R.id.ed_phone);
        male = findViewById(R.id.rb_male);
        female = findViewById(R.id.rb_femal);
        mySpinner=findViewById(R.id.myspinner);
        spinner();


        male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean male_isChecked) {

            }
        });


        female.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean female_isChecked) {

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = firstname.getText().toString();
                String last = lastname.getText().toString();
                String phone = phonenum.getText().toString();
                String email = emailadd1.getText().toString();
                String data2= mySpinner.getSelectedItem().toString();


                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("keyfirst", first);
                intent.putExtra("keylast", last);
                intent.putExtra("keyemail", email);
                intent.putExtra("keyn", phone);
                intent.putExtra("city",data2);
                startActivity(intent);


            }
        });


//        ArrayList<String> cities = new ArrayList<>();
//        cities.add("Ramallah");
//        cities.add("Jenin");
//        cities.add("Nablus");
//        cities.add("Hebron");
//        cities.add("Bethlehem");
//        cities.add("Deir al-Balah");
//        cities.add("Gaza");
//        cities.add("Rafah");
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,cities);
//        mySpinner.setAdapter(adapter);

    }

    private void spinner() {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ramallah");
        cities.add("Jenin");
        cities.add("Nablus");
        cities.add("Hebron");
        cities.add("Bethlehem");
        cities.add("Deir al-Balah");
        cities.add("Gaza");
        cities.add("Rafah");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, cities);
        mySpinner.setAdapter(adapter);
    }
}