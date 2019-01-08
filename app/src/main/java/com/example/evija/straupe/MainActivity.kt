package com.example.evija.straupe

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.evija.straupe.R.id.btnSignIn
import com.example.evija.straupe.R.id.txtSlogan
import com.example.evija.straupe.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {
    Button: btnSignIn,btnSignUp;
    TextView txtSlogan;

     @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        btnSignIn=(Button)findViewById(R.id.btnSignIn);
         btnSignUp=(Button)findViewById(R.id.btnSignUp);
         txtSlogan=(TextView)findViewById(R.id.txtSlogan);
         Typeface face = Typeface.createFromAsset(assets,"fonti/Montserrat-BoldItalic.otf");
         txtSlogan.setTypeface(face);
         btnSignIn.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view);{
           }
         })
         btnSignUp.setOnClickListener(new View.onClickLiestener(){
             @Override
             public void onClick(View view) {
           }
         })
    }
}
