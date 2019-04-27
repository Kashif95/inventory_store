package com.meeranlabs.inventory.inventory_store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button gen, nextbtn,btnexport,btndrive,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nextbtn = (Button) findViewById(R.id.nxt_btn);


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(sp1.getSelectedItem().toString()!="Please Select Location") {
                Intent rIntent = new Intent(MainActivity.this,Second.class);
                rIntent.putExtra("key","sdfsdf");
                //  rIntent.putExtra("key", sp1.getSelectedItem().toString());
                startActivity(rIntent);
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"Please Select Location", Toast.LENGTH_LONG).show();

            }
        });



    }




}
