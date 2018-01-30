package com.tashfia.customfonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtText;
    EditText etxInput;
    Button btnSetText,btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtText=(TextView)findViewById(R.id.txt_text);
        etxInput=(EditText)findViewById(R.id.etxt_input);
        btnSetText=(Button)findViewById(R.id.btn_settext);
        btnReset=(Button)findViewById(R.id.btn_reset);

        
        //font initialization
        //Typeface tf=Typeface.createFromAsset(getAssets(),"Algerian.ttf");

        Typeface tf=Typeface.createFromAsset(getAssets(),"Algerian.ttf");
        txtText.setTypeface(tf);
        etxInput.setTypeface(tf);


        btnSetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text= etxInput.getText().toString();
                txtText.setText(text);
            }
        });

btnReset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        txtText.setText("Text");
        etxInput.setText("");


    }
});






    }
}
