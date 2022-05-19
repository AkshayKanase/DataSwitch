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
    private int imagePlaceSet1,imagePlaceSet2,imagePlaceSet3,imagePlaceSet4;




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

        imagePlaceSet1=bundle.getInt("imageViewKey1");
        imagePlaceSet2=bundle.getInt("imageViewKey2");
        imagePlaceSet3=bundle.getInt("imageViewKey3");
        imagePlaceSet4=bundle.getInt("imageViewKey4");

        imgPlace1.setImageResource(imagePlaceSet1);
        imgPlace2.setImageResource(imagePlaceSet2);
        imgPlace3.setImageResource(imagePlaceSet3);
        imgPlace4.setImageResource(imagePlaceSet4);

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
            resultIntent.putExtra("result",imagePlaceSet1);
            setResult(1,resultIntent);

            finish();

        }
    }

    private class Place2Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",imagePlaceSet2);
            setResult(1,resultIntent);

            finish();
        }
    }

    private class Place3Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result",imagePlaceSet3);
            setResult(1,resultIntent);

            finish();
        }
    }

    private class Place4Click implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent resultIntent=new Intent();
            resultIntent.putExtra("result", imagePlaceSet4);
            setResult(1,resultIntent);

            finish();
        }
    }
}
