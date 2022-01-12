package com.example.mangepermission;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_camrea=findViewById(R.id.button_camrea);

        button_camrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCamera();
            }
        });
    }

    private void openCamera() {
        String[] perms ={Manifest.permission.CAMERA,Manifest.permission.READ_EXTERNAL_STORAGE};
        if (EasyPermission.hasPermission(this,perms)){
            Toast.makeText(this, "Opening Camera", Toast.LENGTH_SHORT).show();
        }
        else {
            EasyPermission.requestPermission(this,"we need permission");
        }
    }


    }
}