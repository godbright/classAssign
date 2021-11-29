package com.example.simplecalc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements  View.OnClickListener  {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Bmicalc =(Button) findViewById(R.id.calcBtn);
        Bmicalc.setOnClickListener(this);
    }



    
    public void bmiCalc(){
        EditText heightEditText =(EditText) findViewById(R.id.heightEditText);
        EditText weightEditText = (EditText) findViewById(R.id.weightEditText);
        double weight;
        double height;
      height= Double.parseDouble(heightEditText.getText().toString()); 
      weight = Double.parseDouble(weightEditText.getText().toString());
        double bmi = weight/(height*height);
        String situ;
        if (bmi<18.5){
situ = "underWeight";
            textInovker(bmi,situ);
            //alertDialog(bmi,situ);
            }
       else if(18.5<bmi && bmi<24.9){
            situ = "Healthy Weight";
            textInovker(bmi,situ);
            //alertDialog(bmi,situ);
        }else if(25<bmi && bmi<29.9){
            situ = "Over Weight";
            textInovker(bmi,situ);
           // alertDialog(bmi,situ);
        }else if(30<bmi && bmi<34.9){
            situ = "Obese";
            textInovker(bmi,situ);
           // alertDialog(bmi,situ);
        }else if(35<bmi && bmi<39.9){
            situ = "Severely Obese";
            textInovker(bmi,situ);
           // alertDialog(bmi,situ);
        }
        else if(bmi>=40){
            situ = "Morbidly Obese";
            textInovker(bmi,situ);
           // alertDialog(bmi,situ);
        }


    }

    private void textInovker(Double bmi, String situ){

        TextView bmiText = findViewById(R.id.bmiText);
        bmiText.setText("Your BMI is" +"  "+ bmi.toString()+" "+ situ);


    }

    private void alertDialog(Double bmi , String situ) {
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(this);
        builder.setMessage(bmi.toString()).setTitle(situ);
        AlertDialog dialog = builder.create();
        dialog.show();


    }


    @Override
    public void onClick(View v) {
        bmiCalc();
    }
}


//weight/height2

