package com.example.map_my_sona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.map_my_sona.complaints.viewDetails.historyviewdetails_carpenter;
import com.example.map_my_sona.manualComplaints.ManualComplaint_page;
import com.google.android.material.appbar.MaterialToolbar;

public class ScannerPage extends AppCompatActivity {

    LinearLayout scanBtn;
    public static TextView scantxt;
    Button num_enter_man;
    TextView manualltext;
    MaterialToolbar toolbar;

//    private TextView manual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner_page);

        scanBtn=findViewById(R.id.Scanner);
//        scantxt=(TextView) findViewById(R.id.scantxt);
        manualltext=findViewById(R.id.entermanuallytext);

        num_enter_man=findViewById(R.id.num_enter_man);

        num_enter_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScannerPage.this,Enter_num_manual.class));
            }
        });

//        manual =(TextView) findViewById(R.id.ManualEntry);

        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ScannerView.class));

            }
        });

        manualltext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScannerPage.this, ManualComplaint_page.class));
            }
        });
        toolbar= findViewById(R.id.topAppBar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"your icon was clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ScannerPage.this, dashboard.class));
            }
        });
    }
}