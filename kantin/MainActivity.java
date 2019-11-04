 package com.example.kantin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
//    private TextView Info;
    private Button Login;
     private Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etusername);
        Password = (EditText) findViewById(R.id.etpassword);
//        Info = (TextView)findViewById(R.id.tvinfo);
        Login = (Button)findViewById(R.id.blogin);
        Register = (Button)findViewById(R.id.bregister);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
            }


        });
    }
    private void validate (String userName,String userPassword){
        if((userName == "Admin") && (userPassword == "1234")) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{
    }
}
