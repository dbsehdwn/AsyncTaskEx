package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text1, text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        text1 = (TextView)findViewById(R.id.state);
        text2 = (TextView)findViewById(R.id.count);
    }

    public void onclick(View view){
        MyAsyncTask async = new MyAsyncTask(text1,text2);
        async.execute();
    }

}


