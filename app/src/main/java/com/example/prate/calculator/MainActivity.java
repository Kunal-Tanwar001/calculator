package com.example.prate.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
EditText e1,e2;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.result);
        e1=findViewById(R.id.tx1);
        e2=findViewById(R.id.txt2);
    }
    public void resultdepict(View view){
        int id=view.getId();
        double result=0.0,first=0.0,second=0.0;
      if(e1.getText().toString().isEmpty()) {
          Toast.makeText( this, "Error!! bc value daal upar pagal salaa", Toast.LENGTH_LONG).show();
      }else {
          String s = e1.getText().toString();
           first = Integer.parseInt(s);
      }

        if(e2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Error!! bc value daal upar pagal salaa", Toast.LENGTH_LONG).show();
        }else {
            String w = e2.getText().toString();
             second = Integer.parseInt(w);
        }
        switch (id){
            case R.id.b1 : result=first+second;break;
            case R.id.b2 : result=first-second;break;
            case R.id.b3 : result=first*second;break;
            case R.id.b4 : result=first/second;break;
            case R.id.b5 : result=0;
                           e1.setText("");
                           e2.setText("");

                           break;


    }
    t1.setText("Result :"+ result);


    }
}
