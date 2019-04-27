package com.meeranlabs.inventory.inventory_store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {
    Button gen, nextbtn2,btnexport,btndrive,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        nextbtn2 = (Button) findViewById(R.id.nxt_btn2);


        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(sp1.getSelectedItem().toString()!="Please Select Location") {
                Intent rIntent = new Intent(Second.this,Third.class);
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
