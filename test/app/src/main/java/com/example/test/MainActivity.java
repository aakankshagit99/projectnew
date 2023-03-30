package com.example.test;

import static com.example.test.R.*;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        try {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        RelativeLayout rlay = (RelativeLayout) findViewById(id.rlayout);
//        startService(new Intent(MainActivity.this,service.class));

        Intent i=new Intent(MainActivity.this,service.class);
        startService(i);
        finish();

setVisible(false);
//        moveTaskToBack(true);


//        new CountDownTimer(4000, 2000) { //40000 milli seconds is total time, 1000 milli seconds is time interval
//
//            public void onTick(long millisUntilFinished) {
//                setContentView(layout.myserv);
//                Intent i = new Intent(MainActivity.this, myserv.class);
//                startService(i);
//                Toast.makeText(MainActivity.this, "alert", Toast.LENGTH_SHORT).show();
//                moveTaskToBack(true);
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setMessage("LOOK AT OBJECTS 20FT AWAY FROM YOU");
//                builder.setTitle("RELAX!");
//                builder.setCancelable(false);
//                builder.setPositiveButton("OKAY", (DialogInterface.OnClickListener) (dialog, which) -> {
////                        finish();
//                });
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();
//                moveTaskToBack(true);
//            }
//
//            public void onFinish() {
//                Toast.makeText(MainActivity.this, "finished", Toast.LENGTH_SHORT).show();
//                Intent j=new Intent(MainActivity.this,imgfull.class);
//                setContentView(layout.imgfull);
//                startActivity(j);
////                moveTaskToBack(true);
//                try {
////func();
////                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
////                    startActivity(i);
//                }
//                catch (Exception e)
//                {
//                    Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        }.start();
    }


public void func(){
    Intent i = new Intent(getApplicationContext(), MainActivity.class);
    startActivity(i);
}
    public void tim20sec() {
        {
//            Intent i = new Intent(MainActivity.this, myserv.class);
//            startService(i);
            new CountDownTimer(10000, 2000) { //40000 milli seconds is total time, 1000 milli seconds is time interval

                public void onTick(long millisUntilFinished) {
//                setContentView(layout.myserv);
//                Intent i=new Intent(MainActivity.this,myserv.class);
//        startService(i);
                    moveTaskToBack(true);
//                    Toast.makeText(MainActivity.this, "2s", Toast.LENGTH_SHORT).show();

                }

                public void onFinish() {
                    Toast.makeText(MainActivity.this, "finish", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }.start();

        }
    }
}
/*    public void tim20min(){
        new CountDownTimer(10000, 5000) { //40000 milli seconds is total time, 1000 milli seconds is time interval

            public void onTick(long millisUntilFinished) {
                setContentView(layout.myserv);
                Intent i=new Intent(MainActivity.this,myserv.class);
                startService(i);
                Toast.makeText(MainActivity.this, "alert", Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("LOOK AT OBJECTS 20FT AWAY FROM YOU");
                builder.setTitle("RELAX!");
                builder.setCancelable(false);
                builder.setPositiveButton("OKAY", (DialogInterface.OnClickListener) (dialog, which) -> {
//                        finish();
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }

            public void onFinish() {
                Toast.makeText(MainActivity.this, "finish", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}
*/







