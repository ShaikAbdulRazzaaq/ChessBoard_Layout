package com.example.chessboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9,im10,im11,im12,im13,im14,im15,im16,im17,im18,im19,im20,im21,im22,im23,im24,im25,im26,im27,
            im28,im29,im30,im31,im32,im33,im34,im35,im36,im37,im38,im39,im40,im41,im42,im43,im44,im45,im46,im47,im48,im49,im50,im51,im52,im53,
            im54,im55,im56,im57,im58,im59,im60,im61,im62,im63,im64;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im1=findViewById(R.id.im1);
        im2=findViewById(R.id.im2);
        im3=findViewById(R.id.im3);
        im4=findViewById(R.id.im4);
        im5=findViewById(R.id.im5);
        im6=findViewById(R.id.im6);
        im7=findViewById(R.id.im7);
        im8=findViewById(R.id.im8);
        im9=findViewById(R.id.im9);
        im10=findViewById(R.id.im10);
        im11=findViewById(R.id.im11);
        im12=findViewById(R.id.im12);
        im13=findViewById(R.id.im13);
        im14=findViewById(R.id.im14);
        im15=findViewById(R.id.im15);
        im16=findViewById(R.id.im16);
        im17=findViewById(R.id.im17);
        im18=findViewById(R.id.im18);
        im19=findViewById(R.id.im19);
        im20=findViewById(R.id.im20);
        im21=findViewById(R.id.im21);
        im22=findViewById(R.id.im22);
        im23=findViewById(R.id.im23);
        im24=findViewById(R.id.im24);
        im25=findViewById(R.id.im25);
        im26=findViewById(R.id.im26);
        im27=findViewById(R.id.im27);
        im28=findViewById(R.id.im28);
        im29=findViewById(R.id.im29);
        im30=findViewById(R.id.im30);
        im31=findViewById(R.id.im31);
        im32=findViewById(R.id.im32);
        im33=findViewById(R.id.im33);
        im34=findViewById(R.id.im34);
        im35=findViewById(R.id.im35);
        im36=findViewById(R.id.im36);
        im37=findViewById(R.id.im37);
        im38=findViewById(R.id.im38);
        im39=findViewById(R.id.im39);
        im40=findViewById(R.id.im40);
        im41=findViewById(R.id.im41);
        im42=findViewById(R.id.im42);
        im43=findViewById(R.id.im43);
        im44=findViewById(R.id.im44);
        im45=findViewById(R.id.im45);
        im46=findViewById(R.id.im46);
        im47=findViewById(R.id.im47);
        im48=findViewById(R.id.im48);
        im49=findViewById(R.id.im49);
        im50=findViewById(R.id.im50);
        im51=findViewById(R.id.im51);
        im52=findViewById(R.id.im52);
        im53=findViewById(R.id.im53);
        im54=findViewById(R.id.im54);
        im55=findViewById(R.id.im55);
        im56=findViewById(R.id.im56);
        im57=findViewById(R.id.im57);
        im58=findViewById(R.id.im58);
        im59=findViewById(R.id.im59);
        im60=findViewById(R.id.im60);
        im61=findViewById(R.id.im61);
        im62=findViewById(R.id.im62);
        im63=findViewById(R.id.im63);
        im64=findViewById(R.id.im64);
    }
    public void toast(View view){
        ImageView im=(ImageView)view;
        String i=im.getTag().toString();
        Toast.makeText(getApplicationContext(), "You Pressed on "+i+" image", Toast.LENGTH_SHORT).show();
    }
}
