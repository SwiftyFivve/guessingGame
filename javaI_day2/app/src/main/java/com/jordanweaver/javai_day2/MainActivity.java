package com.jordanweaver.javai_day2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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


public class MainActivity extends ActionBarActivity {

    // Importing Context Class / declare Context member variable
    Context mContext;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        Log.e("Life cycle", "On Create");
        setContentView(R.layout.activity_main);


        // Setting Context to the activity
        mContext = this;

        // Import my button views and cast to Button Class
        Button toastButton = (Button) findViewById(R.id.toastButton);
        Button alertButton = (Button) findViewById(R.id.alertButton);

        Button greenButton = (Button) findViewById(R.id.greenButton);
        Button defaultButton = (Button) findViewById(R.id.defaultButton);
        mEditText = (EditText) findViewById(R.id.editText);


        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText.setBackgroundColor(Color.parseColor("#FF00CC00"));
            }
        });

        defaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        // On click listener for Toast Notification for LONG duration
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Toast!", Toast.LENGTH_LONG).show();
            }
        });


        // On click listener for the Alert Dialog Button
        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Builder for Alert Dialog (Type, name, class(args)
                AlertDialog.Builder alert = new AlertDialog.Builder(mContext);

                // Title for Alert Dialog
                alert.setTitle("Alert!");

                // Message for Alert Dialog
                alert.setMessage("This is a message");

                // "Positive" / Right button for Alert Dialog
                alert.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e("Dialog Click", "Positive Dialog Click");
                    }
                });

                // "Negative" / Left button for Alert Dialog
                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.e("Dialog Click", "Negative Dialog Click");
                    }
                });

                alert.show();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e("Life cycle", "On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e("Life cycle", "On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e("Life cycle", "On Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e("Life cycle", "On Destroy");
    }

    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
