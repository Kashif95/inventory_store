package com.meeranlabs.inventory.inventory_store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button  first_btn;
        Button  second_btn;
        Button  third_btn;
        Button  forth_btn;
        first_btn = (Button) findViewById(R.id.first_btn);
        second_btn = (Button) findViewById(R.id.second_btn);
        third_btn = (Button) findViewById(R.id.third_btn);
        forth_btn = (Button) findViewById(R.id.forth_btn);


        first_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(sp1.getSelectedItem().toString()!="Please Select Location") {
                Intent rIntent = new Intent(Menu.this,First.class);
//                rIntent.putExtra("key","sdfsdf");
                //  rIntent.putExtra("key", sp1.getSelectedItem().toString());
                startActivity(rIntent);
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"Please Select Location", Toast.LENGTH_LONG).show();

            }
        });


        second_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(sp1.getSelectedItem().toString()!="Please Select Location") {
                Intent rIntent = new Intent(Menu.this,Second.class);
//                rIntent.putExtra("key","sdfsdf");
                //  rIntent.putExtra("key", sp1.getSelectedItem().toString());
                startActivity(rIntent);
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"Please Select Location", Toast.LENGTH_LONG).show();

            }
        });



        third_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(sp1.getSelectedItem().toString()!="Please Select Location") {
                Intent rIntent = new Intent(Menu.this,Third.class);
//                rIntent.putExtra("key","sdfsdf");
                //  rIntent.putExtra("key", sp1.getSelectedItem().toString());
                startActivity(rIntent);
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"Please Select Location", Toast.LENGTH_LONG).show();

            }
        });


        forth_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(sp1.getSelectedItem().toString()!="Please Select Location") {
                Intent rIntent = new Intent(Menu.this,Forth.class);
//                rIntent.putExtra("key","sdfsdf");
                //  rIntent.putExtra("key", sp1.getSelectedItem().toString());
                startActivity(rIntent);
//                }
//                else
//                    Toast.makeText(getApplicationContext(),"Please Select Location", Toast.LENGTH_LONG).show();

            }
        });
    }
}
