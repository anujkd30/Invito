package com.invitations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ANUJ KD on 10/10/2017.
 */

public class AnniversaryForm extends Activity implements View.OnClickListener{
    public EditText husband,wife,date,time,venue,description;

    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_anniversary_form);
        wife = (EditText)findViewById(R.id.wife);
        husband =(EditText)findViewById(R.id.husband);
        venue = (EditText)findViewById(R.id.venue);
        date = (EditText)findViewById(R.id.date);
        description = (EditText)findViewById(R.id.description);
        submit =(Button)findViewById(R.id.crt_but);
        submit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        try {
            Intent i = new Intent(AnniversaryForm.this, Anniversary_template.class);
            int buttonId = getIntent().getIntExtra("slot", 0);
            i.putExtra("slot1", buttonId);
            i.putExtra("bride", wife.getText().toString());
            i.putExtra("groom", husband.getText().toString());
            i.putExtra("venue", venue.getText().toString());
            i.putExtra("date", date.getText().toString());
            i.putExtra("description", description.getText().toString());
            startActivity(i);
        }
        catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this,"hello", Toast.LENGTH_LONG).show();
    }
}
