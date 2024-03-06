package com.irdhina.myframelayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button submit,reset;
    EditText username,password;
    String userN="user@gmail.com",pass="password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=findViewById(R.id.btnSubmit);
        reset=findViewById(R.id.btnReset);
        username=findViewById(R.id.etUser);
        password=findViewById(R.id.etPass);
        //set listener to submit button
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //evaluate user input
                String katanama=username.getText().toString();
                String katalaluan=password.getText().toString();
                //Log.i("Info","Before if "+katanama+" "+katalaluan);
                if(katanama.equals(userN) && katalaluan.equals(pass)){
                    //Log.i("Info","After if "+katanama+" "+katalaluan);
                    Toast.makeText(getApplicationContext(),
                                    "Login success!!",
                                    Toast.LENGTH_LONG)
                            .show();
                }else{
                    //Log.i("Info","Inside Else "+katanama+" "+katalaluan);
                    Toast.makeText(getApplicationContext(),
                                    "Invalid username or password!!",
                                    Toast.LENGTH_LONG)
                            .show();
                }
            }
        });
        //set listener to reset button
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //clear user input
                username.setText("");
                password.setText("");
                //reset focus to username edittext
                username.requestFocus();
            }
        });
    }
}