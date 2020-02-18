package com.example.androidmaterialdesigntechniques;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Let's create a variable of that Toolbar.
        Toolbar myToolbar=findViewById(R.id.myToolbar);
        if(myToolbar!=null){

            setSupportActionBar(myToolbar);
            /*Now,it is time to create a file inside are project.
              res->(rightclick)New->Adroid resource file->!!!Resource type must be menu.
              Name have to be lower case and can contain  _ .
               We will define name my_menu for this menu.*/
        }
    }
    //We need to @Override oCOM in order to have to menu options inside are Toolbar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.my_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.call_icon:
                Toast.makeText(MainActivity.this,"Call icon is clicked!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.location_icon:
                Toast.makeText(MainActivity.this,"Location icon clicked!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.camera_icon:
                Toast.makeText(MainActivity.this,"Camera icon clicked!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MediaStore.ACTION_IMAGE_CAPTURE));
                 break;
            case R.id.video_icon:
                Toast.makeText(MainActivity.this,"Video icon clicked!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MediaStore.ACTION_VIDEO_CAPTURE));
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
