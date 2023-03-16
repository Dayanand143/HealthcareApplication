package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {

    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Dayanand Gavas", "Hospital Address : Warje", "Exp : 5yrs", "Mobile No:9898989899", "600"},
                    {"Doctor Name : Namrata Gavas", "Hospital Address : Kothrud", "Exp : 15yrs", "Mobile No:9898989899", "900"},
                    {"Doctor Name : Sakshi Pathak", "Hospital Address : Pimpri", "Exp : 8yrs", "Mobile No:9898989899", "300"},
                    {"Doctor Name : Swapnil Joshi", "Hospital Address : Katraj", "Exp : 6yrs", "Mobile No:9898989899", "500"},
                    {"Doctor Name : Amruta Tambe", "Hospital Address : Deccan", "Exp : 7yrs", "Mobile No:9898989899", "800"},
            };
    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Anmol Gupta", "Hospital Address : Warje", "Exp : 5yrs", "Mobile No:9898989899", "600"},
                    {"Doctor Name : Sikha Shaikh", "Hospital Address : Kothrud", "Exp : 15yrs", "Mobile No:9898989899", "900"},
                    {"Doctor Name : Pranali Vichare", "Hospital Address : Pimpri", "Exp : 8yrs", "Mobile No:9898989899", "300"},
                    {"Doctor Name : Swapnil Joshi", "Hospital Address : Katraj", "Exp : 6yrs", "Mobile No:9898989899", "500"},
                    {"Doctor Name : Sagar Soin", "Hospital Address : Deccan", "Exp : 7yrs", "Mobile No:9898989899", "800"},
            };
    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Swati Uniyal", "Hospital Address : Warje", "Exp : 5yrs", "Mobile No:9898989899", "600"},
                    {"Doctor Name : Vishal Kumar", "Hospital Address : Kothrud", "Exp : 15yrs", "Mobile No:9898989899", "900"},
                    {"Doctor Name : Sumant Tingre", "Hospital Address : Pimpri", "Exp : 8yrs", "Mobile No:9898989899", "300"},
                    {"Doctor Name : Rohit Abhyankar", "Hospital Address : Katraj", "Exp : 6yrs", "Mobile No:9898989899", "500"},
                    {"Doctor Name : Mahesh Rajiwade", "Hospital Address : Deccan", "Exp : 7yrs", "Mobile No:9898989899", "800"},
            };
    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Shriram Shelke", "Hospital Address : Warje", "Exp : 5yrs", "Mobile No:9898989899", "600"},
                    {"Doctor Name : Naveen Singh", "Hospital Address : Kothrud", "Exp : 15yrs", "Mobile No:9898989899", "900"},
                    {"Doctor Name : Sumit Chauhan", "Hospital Address : Pimpri", "Exp : 8yrs", "Mobile No:9898989899", "300"},
                    {"Doctor Name : Anant Parye", "Hospital Address : Katraj", "Exp : 6yrs", "Mobile No:9898989899", "500"},
                    {"Doctor Name : Amruta Tambe", "Hospital Address : Deccan", "Exp : 7yrs", "Mobile No:9898989899", "800"},
            };
    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Dayanand Gavas", "Hospital Address : Warje", "Exp : 5yrs", "Mobile No:9898989899", "600"},
                    {"Doctor Name : Namrata Gavas", "Hospital Address : Kothrud", "Exp : 15yrs", "Mobile No:9898989899", "900"},
                    {"Doctor Name : Sakshi Pathak", "Hospital Address : Pimpri", "Exp : 8yrs", "Mobile No:9898989899", "300"},
                    {"Doctor Name : Swapnil Joshi", "Hospital Address : Katraj", "Exp : 6yrs", "Mobile No:9898989899", "500"},
                    {"Doctor Name : Amruta Tambe", "Hospital Address : Deccan", "Exp : 7yrs", "Mobile No:9898989899", "800"},
            };
    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for(int i=0;i<doctor_details.length;i++){
            item = new HashMap<String,String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons Fees:"+doctor_details[i][4]+"/-");
            list.add(item);
        }
        sa = new SimpleAdapter(this,)
    }
}