package com.jordanweaver.j_weaver_lab1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    String operation;


    int n1;
    int n2;

    TextView calculateTextView;


    Button divideButton;
    Button multiButton;
    Button minusButton;
    Button addButton;

    Button sevenButton;
    Button eightButton;
    Button nineButton;

    Button fourButton;
    Button fiveButton;
    Button sixButon;

    Button oneButton;
    Button twoButton;
    Button threeButton;
    Button acButton;

    Button zeroButton;
    Button equalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateTextView = (TextView) findViewById(R.id.calculateTextView);

        divideButton = (Button) findViewById(R.id.divideButton);
        multiButton = (Button) findViewById(R.id.multiButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        addButton = (Button) findViewById(R.id.addButton);

        sevenButton = (Button) findViewById(R.id.sevenButton);
        eightButton = (Button) findViewById(R.id.eightButton);
        nineButton = (Button) findViewById(R.id.nineButton);

        fourButton = (Button) findViewById(R.id.fourButton);
        fiveButton = (Button) findViewById(R.id.fiveButton);
        sixButon = (Button) findViewById(R.id.sixButton);

        oneButton = (Button) findViewById(R.id.oneButton);
        twoButton = (Button) findViewById(R.id.twoButton);
        threeButton = (Button) findViewById(R.id.threeButton);
        acButton = (Button) findViewById(R.id.acButton);


        zeroButton = (Button) findViewById(R.id.zeroButton);
        equalButton = (Button) findViewById(R.id.equalButton);


        //Do this for all buttons
        equalButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);
        multiButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        addButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        sixButon.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        zeroButton.setOnClickListener(this);
        acButton.setOnClickListener(this);




    }
    int equationFormula = 4;
    boolean needsDelete = false;
    @Override
    public void onClick(View view) {
        int id = view.getId();


        String displayText = calculateTextView.getText().toString();


        int answer = 0;

        //calculateTextView.setText(displayText);

        //Switch case for all buttons
        switch (id) {

            case R.id.acButton:

                calculateTextView.setText("");
//                if (displayText != "") {
//                    displayText = "";
//                }

                break;


            case R.id.zeroButton:
               // displayText = "0";
                calculateTextView.setText(displayText + "0");

                Log.e("Category", "Message");

                break;

            case R.id.oneButton:
                calculateTextView.setText(displayText + "1");

                break;
            case R.id.twoButton:

                calculateTextView.setText(displayText + "2");
                break;
            case R.id.threeButton:

                calculateTextView.setText(displayText + "3");
                break;
            case R.id.fourButton:


                calculateTextView.setText(displayText + "4");
                break;
            case R.id.fiveButton:

                calculateTextView.setText(displayText + "5");

                break;
            case R.id.sixButton:


                calculateTextView.setText(displayText + "6");

                break;
            case R.id.sevenButton:


                calculateTextView.setText(displayText + "7");

                break;
            case R.id.eightButton:


                calculateTextView.setText(displayText + "8");

                break;
            case R.id.nineButton:

                calculateTextView.setText(displayText + "9");


                break;
            case R.id.divideButton:
                n1 = Integer.parseInt(displayText);
                equationFormula = 0;
                calculateTextView.setText("");


                break;
            case R.id.multiButton:
                n1 = Integer.parseInt(displayText);
                equationFormula = 1;
                calculateTextView.setText("");


                break;
            case R.id.minusButton:
                n1 = Integer.parseInt(displayText);
                equationFormula = 2;
                calculateTextView.setText("");


                break;
            case R.id.addButton:
                n1 = Integer.parseInt(displayText);
                equationFormula = 3;
                calculateTextView.setText("");



                break;
            case R.id.equalButton:
                if (equationFormula != 4) {
                    n2 = Integer.parseInt(displayText);
                    //if (n2 != nil) { // check if user has provided input for second number. Can't use nil?

                        Calculate equation = new Calculate(equationFormula, n1, n2);

                        answer = equation.getmAnswer();


                        calculateTextView.setText(answer + "");
                    //}


                }



                break;





        }


    }


}
