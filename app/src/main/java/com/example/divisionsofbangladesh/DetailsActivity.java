package com.example.divisionsofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgDivision;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgDivision=findViewById(R.id.img_division);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);

        //receive data
        String getRecipe=getIntent().getExtras().getString("division");


        if(getRecipe.equals("barishal"))
        {
            imgDivision.setImageResource(R.drawable.barishal);
            txtName.setText("Barishal");
            txtDescription.setText(R.string.division1);
        }

        else if(getRecipe.equals("chittagong"))
        {
            imgDivision.setImageResource(R.drawable.chittagong);
            txtName.setText("Chittagong");
            txtDescription.setText(R.string.division2);
        }

        else if(getRecipe.equals("dhaka"))
        {
            imgDivision.setImageResource(R.drawable.dhaka);
            txtName.setText("Dhaka");
            txtDescription.setText(R.string.division3);
        }

        else if(getRecipe.equals("khulna"))
        {
            imgDivision.setImageResource(R.drawable.khulna);
            txtName.setText("Khulna");
            txtDescription.setText(R.string.division4);
        }

        else if(getRecipe.equals("mymensingh"))
        {
            imgDivision.setImageResource(R.drawable.singh);
            txtName.setText("Mymensingh");
            txtDescription.setText(R.string.division5);
        }

        else if(getRecipe.equals("rajshahi"))
        {
            imgDivision.setImageResource(R.drawable.rajshahi);
            txtName.setText("Rajshahi");
            txtDescription.setText(R.string.division6);
        }

        else if(getRecipe.equals("rangpur"))
        {
            imgDivision.setImageResource(R.drawable.rangpur);
            txtName.setText("Rangpur");
            txtDescription.setText(R.string.division7);
        }

        else if(getRecipe.equals("sylhet"))
        {
            imgDivision.setImageResource(R.drawable.sylhet);
            txtName.setText("Sylhet");
            txtDescription.setText(R.string.division8);
        }






    }
}
