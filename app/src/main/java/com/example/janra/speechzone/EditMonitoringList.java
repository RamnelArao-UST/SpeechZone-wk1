package com.example.janra.speechzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EditMonitoringList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_monitoring_list);
    }

    public void back(View v){
        Intent i = new Intent(this, MainScreen.class);
        startActivity(i);
    }
    public void save(View v){
        Intent i = new Intent(this, LoadMonitorList.class);
        startActivity(i);
    }
}
