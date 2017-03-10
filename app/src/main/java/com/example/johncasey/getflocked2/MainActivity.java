package com.example.johncasey.getflocked2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.view.View;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends AppCompatActivity implements OnSeekBarChangeListener {
    RadioButton n, s, e, w, c;
    Button startOrEnd;
    TextView text ;
   SeekBar Size, Speed, Agility, Vision;
  // SeekBar Size;




    // TextView text = (TextView)findViewById(R.id.text);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.playerlogin);
        setContentView(R.layout.activity_main);

        Size = (SeekBar)findViewById(R.id.size);
         Speed =(SeekBar)findViewById(R.id.speed);
         Agility=(SeekBar)findViewById(R.id.agility);
         Vision =(SeekBar)findViewById(R.id.vision);


        text = (TextView) findViewById(R.id.text);
        Size.setOnSeekBarChangeListener(this);
        Speed.setOnSeekBarChangeListener(this);
        Agility.setOnSeekBarChangeListener(this);
        Vision.setOnSeekBarChangeListener(this);

    }

    public void onRadioClick(View v) {


        n = (RadioButton) findViewById(R.id.north);
        s = (RadioButton) findViewById(R.id.south);
        e = (RadioButton) findViewById(R.id.east);
        w = (RadioButton) findViewById(R.id.west);
        c = (RadioButton) findViewById(R.id.center);
        // or, you can check each radiobutton and find which one is checked.
        if (n.isChecked()) {
            text.setText("North");
        } else if (s.isChecked()) {
            text.setText("South");
        } else if (e.isChecked()) {
            text.setText("East");
        } else if (w.isChecked()) {
            text.setText("West");
        } else if (c.isChecked()) {
            text.setText("Center");
        }

    }

    @Override

    public void onProgressChanged(SeekBar seekbar, int progressValue, boolean fromUser) {
      int step = 5;
        //  text = (TextView) findViewById(R.id.text);
        if(seekbar == Size) {
            progressValue = ((int) Math.round(progressValue / step)) * step;
            Size.setProgress(progressValue);
            text.setText(String.valueOf(progressValue));
        }
        else if (seekbar == Speed){
            progressValue = ((int) Math.round(progressValue / step)) * step;
           Speed.setProgress(progressValue);
            text.setText(String.valueOf(progressValue));
        }
        else if (seekbar == Agility){
            progressValue = ((int) Math.round(progressValue / step)) * step;
            Agility.setProgress(progressValue);
            text.setText(String.valueOf(progressValue));
        }
        else if (seekbar == Vision){
            progressValue = ((int) Math.round(progressValue / step)) * step;
            Vision.setProgress(progressValue);
            text.setText(String.valueOf(progressValue));
        }
    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }




}




