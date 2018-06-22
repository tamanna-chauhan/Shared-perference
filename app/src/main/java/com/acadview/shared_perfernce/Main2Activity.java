

package com.acadview.shared_perfernce;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView Name_1,Email_1,Pwd_1,Country_1,State_1;
    String userName,userEmail,userPwd,userCountry,userState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name_1 = findViewById(R.id.name_1);
        Email_1 = findViewById(R.id.Email_1);
        Pwd_1 = findViewById(R.id.pwd_1);
        Country_1 = findViewById(R.id.country_1);
        State_1 = findViewById(R.id.state_1);

        SharedPreferences sp = getSharedPreferences("detail",MODE_PRIVATE);

        userName = sp.getString("Name","none");
        userEmail = sp.getString("Email","none");
        userPwd = sp.getString("Password","none");
        userCountry = sp.getString("Country","none");
        userState = sp.getString("State","none");

//        set the value to textView
        Name_1.setText(userName);
        Email_1.setText(userEmail);
        Pwd_1.setText(userPwd);
        Country_1.setText(userCountry);
        State_1.setText(userState);




    }
}
