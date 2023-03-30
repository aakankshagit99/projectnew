package com.example.test;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class alert extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert);
        Toast.makeText(this, "alert called", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("LOOK AT OBJECTS 20FT AWAY FROM YOU");
                builder.setTitle("RELAX!");
                builder.setCancelable(false);
                builder.setPositiveButton("OKAY", (DialogInterface.OnClickListener) (dialog, which) -> {
                        finish();
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
    }
}
