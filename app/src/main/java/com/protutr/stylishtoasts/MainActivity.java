package com.protutr.stylishtoasts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

import static com.protutr.stylishtoasts.R.drawable.ic_launcher_background;

public class MainActivity extends AppCompatActivity {
    Button normal,warning,error,custom,success,info,playstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normal=(Button)findViewById(R.id.normal);
        warning=(Button)findViewById(R.id.warning);
        error=(Button)findViewById(R.id.error);
        custom=(Button)findViewById(R.id.custom);
        success=(Button)findViewById(R.id.success);
        info=(Button)findViewById(R.id.info);
        playstore=(Button)findViewById(R.id.playstore);


        playstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.protutr.protutr"));
                startActivity(intent);
            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.normal(MainActivity.this, "Normal toast without icon").show();
            }
        });

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(MainActivity.this, "Successfully added", Toast.LENGTH_SHORT, true).show();

            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.info(MainActivity.this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();

            }
        });


        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.warning(MainActivity.this, "Caution:avoid misspell.", Toast.LENGTH_SHORT, true).show();

            }
        });

        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.custom(MainActivity.this,"This is custom Toast",R.drawable.ic_launcher_foreground,getResources().getColor(R.color.colorPrimaryDark),15,true,true).show();
            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.error(MainActivity.this, "Not Validated").show();
            }
        });


    }
}
