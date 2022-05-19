package com.example.dataswitch;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgProfile1;
    Button btnKokan,btnKerala,btnManali,btnGoa;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profileone_layout);

        addViews();
        initListeners();
    }

    private void addViews(){
        imgProfile1=findViewById(R.id.imgProfile1);
        btnManali=findViewById(R.id.btnManali);
        btnKokan=findViewById(R.id.btnKokan);
        btnGoa=findViewById(R.id.btnGoa);
        btnKerala=findViewById(R.id.btnKerala);
    }

    private void initListeners(){
        btnGoa.setOnClickListener(new GoaClick());
        btnKerala.setOnClickListener(new KeralaClick());
        btnKokan.setOnClickListener(new KokanClick());
        btnManali.setOnClickListener(new ManaliClick());
    }


   private class KokanClick implements View.OnClickListener{

        @SuppressLint("ResourceType")
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,PictureActivity.class);
            intent.putExtra("imageViewKey1",R.drawable.kokan1);
            intent.putExtra("imageViewKey2",R.drawable.kokan2);
            intent.putExtra("imageViewKey3",R.drawable.kokan3);
            intent.putExtra("imageViewKey4",R.drawable.kokan4);



           // startActivity(intent);
            startActivityForResult(intent,1);


        }
    }




    private class GoaClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,PictureActivity.class);
            intent.putExtra("imageViewKey1",R.drawable.goa1);
            intent.putExtra("imageViewKey2",R.drawable.goa2);
            intent.putExtra("imageViewKey3",R.drawable.goa3);
            intent.putExtra("imageViewKey4",R.drawable.goa4);



            startActivityForResult(intent,1);
        }
    }
    private class KeralaClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,PictureActivity.class);
            intent.putExtra("imageViewKey1",R.drawable.kerala1);
            intent.putExtra("imageViewKey2",R.drawable.kerala2);
            intent.putExtra("imageViewKey3",R.drawable.kerala3);
            intent.putExtra("imageViewKey4",R.drawable.kerala4);



            startActivityForResult(intent,1);
        }
    }
    private class ManaliClick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=new Intent(MainActivity.this,PictureActivity.class);
            intent.putExtra("imageViewKey1",R.drawable.manali1);
            intent.putExtra("imageViewKey2",R.drawable.manali2);
            intent.putExtra("imageViewKey3",R.drawable.manali3);
            intent.putExtra("imageViewKey4",R.drawable.manali4);



            startActivityForResult(intent,1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data==null){
            return;
        }
        Bundle bundle=data.getExtras();
        result=bundle.getInt("result");
        imgProfile1.setImageResource(result);

    }
}



