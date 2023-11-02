package com.training.checkboxradiotoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox cbPizza=findViewById(R.id.cbPizza);
        CheckBox cbCheese=findViewById(R.id.cbCheese);

        RadioGroup rgFood=findViewById(R.id.rgFood);
        RadioButton rbPizza=findViewById(R.id.rbPizza);
        RadioButton rbBurger=findViewById(R.id.rbBurger);
        RadioButton rbChicken=findViewById(R.id.rbChicken);

        ToggleButton toggleButton=findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Toggle is on", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Toggle is off", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void onClickCheck(View view) {
        boolean checked= ((CheckBox) view).isChecked();


        switch (view.getId()){
            case R.id.cbPizza:
                if(checked){
                    Toast.makeText(this, "Pizza", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "No Pizza", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.cbCheese:

                if(checked){
                    Toast.makeText(this, "Cheese", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "No Cheese", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void onRadioButtonClick(View view) {
        boolean radioChecked=((RadioButton)view).isChecked();

        switch ( view.getId()){
            case  R.id.rbChicken:
                if(radioChecked){
                    Toast.makeText(this, "Chicken is here", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rbBurger:
                if(radioChecked){
                    Toast.makeText(this, "Burger is here", Toast.LENGTH_SHORT).show();
                }break;

            case R.id.rbPizza:
                if(radioChecked){
                    Toast.makeText(this, "Pizza is here", Toast.LENGTH_SHORT).show();
                }break;
        }
    }
}