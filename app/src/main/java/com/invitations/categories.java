package com.invitations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by HP on 07-10-2017.
 */

public class categories extends AppCompatActivity {

    Button wed,rec,ani,part,birth,others;
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        wed=(Button)findViewById(R.id.button11);
        birth=(Button)findViewById(R.id.button7);

        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Birthday.class);
                startActivity(i);
            }
        });

      wed.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),Wedding.class);
              startActivity(i);
          }
      });

}

}
