package com.example.amir.skype;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button1) ;
        btn2=(Button)findViewById(R.id.button1) ;

//
//        btn2.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View arg0) {
//
//  }
//});
        final Intent skypeIntent = new Intent(Intent.ACTION_VIEW);
        skypeIntent.setData(Uri.parse("skype:" + "+989386413072" + "?call"));
        skypeIntent.setComponent(new ComponentName("com.skype.raider", "com.skype.raider.Main"));
        skypeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        new CountDownTimer(10000, 1000) {

            public void onTick(long millisUntilFinished) {


                btn1.setText("call " +millisUntilFinished/1000);
                 btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View arg0) {

                                startActivity(skypeIntent);
                            startActivity(skypeIntent);


                        }
                    });

            }

            public void onFinish() {
                btn2.setText("done!");
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {

                        stopService(skypeIntent);



                    }
                });



            }
        }.start();






    }
}
