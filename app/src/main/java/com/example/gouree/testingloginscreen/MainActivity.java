package com.example.gouree.testingloginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Edit text and button values
    EditText name;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name =(EditText)findViewById(R.id.name);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //toast to display user name
                Toast.makeText(MainActivity.this, "Welcome  "+name.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    //method to check unit testing check whether name is palindrome
    public boolean checker(String s)
    {
        int i,j;
        for(i=0,j= s.length()-1;i<=s.length()/2;i++,j--)
        {
            if (s.charAt(i) == s.charAt(j))
                continue;
            return false;
        }
        return true;
    }
}
