package com.invitations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 07-10-2017.
 */

public class Welcome_Page extends AppCompatActivity{
    Button b;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        b=(Button)findViewById(R.id.button);

         b.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i=new Intent(getApplicationContext(),categories.class);
                 startActivity(i);
             }
         });
    }

}
