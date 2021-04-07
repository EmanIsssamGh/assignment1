package acoures.birzeit.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView firstname2;
    TextView lastname2;
    TextView email2;
     TextView Phone2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent=getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        firstname2=findViewById(R.id.tv_firstname);
        lastname2=findViewById(R.id.tv_lastname);
       email2=findViewById(R.id.tv_email1);
        Phone2=findViewById(R.id.tv_phone1);



        String first = getIntent().getStringExtra("keyfirst");
        String last = getIntent().getStringExtra("keylast");
       String email = getIntent().getStringExtra("keyemail");
      String phone = getIntent().getStringExtra("keyn");

        firstname2.setText(first);
        lastname2.setText(last);
       email2.setText(email);
        Phone2.setText(phone);
        String data2=intent.getStringExtra("city");
        TextView txtData2 = findViewById(R.id.tv_city);
        txtData2.setText(data2);



    }
}