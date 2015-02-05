package com.jordanweaver.j_weaver_guessinggame;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    Context mContext;
    EditText firstEdit;
    EditText secondEdit;
    EditText thirdEdit;
    EditText fourthEdit;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        firstEdit = (EditText) findViewById(R.id.editViewOne);
        secondEdit = (EditText) findViewById(R.id.editViewTwo);
        thirdEdit = (EditText) findViewById(R.id.editViewThree);
        fourthEdit = (EditText) findViewById(R.id.editViewFour);

        submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Click", "Click was hit");

                String buttonText = (String) submitButton.getText();


                List<String> scrambledArray = new ArrayList<String>();

                if (buttonText.equals("Scramble Number")){

                    Log.e("Click", "Inside if statement");
                    Random r = new Random();



                    for(int i = 0; i < 4; i++ ){

                        int low = 1;
                        int high = 9;
                        int R = r.nextInt(high - low) + low;

                        scrambledArray.add(i, R + "");

                        Log.e("Array", scrambledArray+"");
                    };

                    submitButton.setText("Submit Guess");


                } else if (buttonText.equals("Submit Guess")){
                    List<String> usersArray = new ArrayList<String>();
                    Log.e("Click", "Inside else if statement");

                    for(int i = 0; i < scrambledArray.size(); i ++){
                        Log.e("Loop", "Inside the Loop");
                        switch (i){
                            case 0:
                                usersArray.add(0, firstEdit.getText().toString());
                                break;

                            case 1:
                                usersArray.add(1, secondEdit.getText().toString());
                                break;

                            case 2:
                                usersArray.add(2, thirdEdit.getText().toString());
                                break;

                            case 3:
                                usersArray.add(3, fourthEdit.getText().toString());
                                break;
                        }


                        for(int j = 0; j < scrambledArray.size(); j++){
                            if (Integer.parseInt(usersArray.get(j)) == Integer.parseInt(scrambledArray.get(j))) {
                                //Change color to Green
                                Log.e("Click", "Numbers Equal");

                            }
                            if (Integer.parseInt(usersArray.get(j)) < Integer.parseInt(scrambledArray.get(j))) {
                                //Change color to Blue
                                Log.e("Click", "Number was less");
                            }
                            if (Integer.parseInt(usersArray.get(j)) > Integer.parseInt(scrambledArray.get(j))) {
                                //Change color to Red
                                Log.e("Click", "Number was more");
                            }


                            if (Integer.parseInt(usersArray.get(j)) != Integer.parseInt(scrambledArray.get(j))) {

                                Toast.makeText(mContext, "Toast!", Toast.LENGTH_LONG).show();

                            }


                        }


                 }

                    submitButton.setText("Scramble Number");

                }


            }
        });
    }

}
