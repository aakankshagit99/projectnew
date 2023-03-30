package com.example.test;

import android.app.Service;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import java.util.Timer;
import java.util.TimerTask;



public class service extends Service {
    Handler handler = new Handler();
    Runnable runnable;
//    int delay=10000;
    @Override
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

//    public void onStart(Intent intent, int startId) {
//        super.onStart(intent, startId);

            public void onCreate() {
//                Toast.makeText(this, "service called", Toast.LENGTH_SHORT).show();
//        startActivity(new Intent(service.this, imgfull.class));
//        Intent dialogIntent = new Intent(this, imgfull.class);
//        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(dialogIntent);

//                new Timer().scheduleAtFixedRate(new TimerTask() {
//                    @Override
//                    public void run() {
//                        your method
//                        Intent dialogIntent = new Intent(service.this, imgfull.class);
//                        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(dialogIntent);
//                        Toast.makeText(service.this, "5s over", Toast.LENGTH_SHORT).show();
//                    }
//                }, 0, 5000);//put here time 1000 milliseconds=1 second



//        Thread t = new Thread() {
//                    @Override
//                    public void run() {
//                        while (!isInterrupted()) {
//                            try {
//                                Thread.sleep(10000);  //1000ms = 1 sec
//                                handler.post(new Runnable() {
//                                    @Override
//                                    public void run()
//                                    {
//                                        Intent dialogIntent = new Intent(service.this, imgfull.class);
//                                        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                                        startActivity(dialogIntent);
//
//                                    }
//                                });
//
//                            }
//                            catch (InterruptedException e)
//                            {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                };

//                t.start();
//try {
//    final Handler handler = new Handler();
//    int delay = 5000;
//    handler.postDelayed(new Runnable() {
//        @Override
//        public void run() {
//            // Do something after 5s = 5000ms
//
//            Toast.makeText(service.this, "5s over", Toast.LENGTH_SHORT).show();
////                Intent dialogIntent = new Intent(service.this, imgfull.class);
////                dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
////                startActivity(dialogIntent);
//            handler.postDelayed(this, delay);
//        }
//    }, delay);
//}
//catch (Exception e){
//    Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
//}
//        protected void onResume() {
        handler.postDelayed(runnable = new Runnable() {
            public void run() {
                handler.postDelayed(runnable, 7000);
                Toast.makeText(service.this, "This method is run every 2 min",
                        Toast.LENGTH_SHORT).show();
                Intent dialogIntent = new Intent(service.this, alert.class);
                dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(dialogIntent);

            }
        }, 7000);
//        super.onResume();
//                AlertDialog.Builder builder = new AlertDialog.Builder(service.this);
//                builder.setMessage("LOOK AT OBJECTS 20FT AWAY FROM YOU");
//                builder.setTitle("RELAX!");
//                builder.setCancelable(false);
//                builder.setPositiveButton("OKAY", (DialogInterface.OnClickListener) (dialog, which) -> {
////                        finish();
//                });
//                AlertDialog alertDialog = builder.create();
//                alertDialog.show();

//        Toast.makeText(this, "service start", Toast.LENGTH_SHORT).show();
//        CountDownTimer timer=new CountDownTimer(System.currentTimeMillis()+10000, 20000) { //40000 milli seconds is total time, 1000 milli seconds is time interval
//                CountDownTimer timer1 = new CountDownTimer(10000, 10000) {
//                    public void onTick(long millisUntilFinished) {
//                        Toast.makeText(getApplicationContext(), "10 seconds over", Toast.LENGTH_SHORT).show();
////
//                    }
//
//                    public void onFinish() {
//                        Toast.makeText(getApplicationContext(), "timer finish", Toast.LENGTH_SHORT).show();
//                    }
//                }.start();

                CountDownTimer timer = new CountDownTimer(System.currentTimeMillis(), 13000) {
                    public void onTick(long millisUntilFinished) {
                        Toast.makeText(getApplicationContext(), "service called imgfull", Toast.LENGTH_SHORT).show();
//                        startActivity(new Intent(getApplicationContext(), imgfull.class));
//                        int i=0;
//                        while (i<=50000000){
//                            i++;
//                        }
                        Intent dialogIntent = new Intent(service.this, imgfull.class);
                        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(dialogIntent);
//                        Toast.makeText(service.this, "toast", Toast.LENGTH_SHORT).show();
                        // blinks every 10 seconds
                    }

                    public void onFinish() {
                        Toast.makeText(getApplicationContext(), "timer finish", Toast.LENGTH_SHORT).show();
//                timer.start();
//                startActivity(new Intent(getApplicationContext(), imgfull.class));
//                Intent dialogIntent = new Intent(service.this, imgfull.class);
//                dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(dialogIntent);
                    }
                }.start();



            }

}
