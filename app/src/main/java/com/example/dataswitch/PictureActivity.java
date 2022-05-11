package com.example.dataswitch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

public class PictureActivity extends Activity {
    private ImageView imgPlace1;
    private ImageView imgPlace2;
    private ImageView imgPlace3;
    private ImageView imgPlace4;
    private int place1,place2,place3,place4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profiletwo_layout);


        addPlaceView();
        initListeners();
        extractInput();
    }

    private void extractInput(){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        place1=bundle.getInt("place1");
        place2=bundle.getInt("place2");
        place3=bundle.getInt("place3");
        place4=bundle.getInt("place4");

        imgPlace1.setImageResource(place1);
        imgPlace2.setImageResource(place2);
        imgPlace3.setImageResource(place3);
        imgPlace4.setImageResource(place4);

    }

    private void addPlaceView(){
        imgPlace1=findViewById(R.id.imgPlace1);
        imgPlace2=findViewById(R.id.imgPlace2);
        imgPlace3=findViewById(R.id.imgPlace3);
        imgPlace4=findViewById(R.id.imgPlace4);

    }

    private void initListeners(){
        imgPlace1.setOnClickListener(new Place1Click());
        imgPlace2.setOnClickListener(new Place2Click());
        imgPlace3.setOnClickListener(new Place3Click());
        imgPlace4.setOnClickListener(new Place4Click());


    }

    private class Place1Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",place1);
            setResult(1,resultIntent);

            finish();

        }
    }

    private class Place2Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",place2);
            setResult(1,resultIntent);

            finish();
        }
    }

    private class Place3Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",place3);
            setResult(1,resultIntent);

            finish();
        }
    }

    private class Place4Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result", place4);
            setResult(1,resultIntent);

            finish();
        }
    }
}
