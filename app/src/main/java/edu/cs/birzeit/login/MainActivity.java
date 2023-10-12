package edu.cs.birzeit.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin")&&password.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();

                }else{
                Toast.makeText(MainActivity.this,"LOGIN FAILED", Toast.LENGTH_SHORT).show();


            }}


            
        });

       /* loginbtn.setOnClickListener(new view.OnClickListener(){
            @Override
            public void onClick(view v){
                if(username.getText().toString().equals("admin")&&password.getText().toString().equals(admin))
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFULL", Toast.LENGTH_SHORT.show();
            }
            else{
                Toast.makeText(MainActivity.this,"LOGIN FAILED", Toast.LENGTH_SHORT.show();


            }



            });

      */

    }}
