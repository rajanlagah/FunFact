package com.example.rajan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
public TextView  mTextView;
    public Button mButton;
    public String arr[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView=(TextView)findViewById(R.id.textView);
        mButton=(Button)findViewById(R.id.button);
        arr= new String[]{"da", "dad","dads","dasdsa","adasdasdas","dsdasasdas","dsdadas","dsadsd","dsdas","dsas"};

    }
 public void onClick(View v){
     Random random=new Random();
     int val=random.nextInt(arr.length);
     //Toast.makeText(this,Integer.toString(val),Toast.LENGTH_LONG).show();
     mTextView.setText(arr[val]);
 }
}
