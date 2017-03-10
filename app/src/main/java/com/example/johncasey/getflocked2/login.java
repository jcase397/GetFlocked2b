package com.example.johncasey.getflocked2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.View;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.EditText;
import android.content.Intent;
/**
 * Created by John Casey on 3/9/2017.
 */


public class login extends MainActivity implements View.OnClickListener {
    EditText player;
    Button begin;
    boolean loggedin = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playerlogin);
        player = (EditText)findViewById(R.id.name);
        begin = (Button)findViewById(R.id.beginFlock);

        begin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);


        if(begin.performClick() && !player.getText().equals("")){
            startActivity(intent);
        }
    }
}
