package com.jordanweaver.kitkatproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    int mNumber;
    boolean mBool;
    double mFloat;
    Button mButton;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumber = 5;
        mBool = true;
        mFloat = 0.005;


        myMethod(mNumber);
        Person doug = new Person("Doug", "Arley", 29);

        mButton = (Button) findViewById(R.id.button);
        mTextView = (TextView) findViewById(R.id.textView);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mTextView.setText("New Text");

            }
        });
    }


    private void myMethod(int Number){




    }

}
