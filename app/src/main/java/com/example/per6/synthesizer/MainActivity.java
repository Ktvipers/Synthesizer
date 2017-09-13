package com.example.per6.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton, eScale, challengetwo, challengefive, challengetwelve;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, haNote, hasNote, hbNote, hcNote, hcsNote, hdNote, hdsNote, heNote, hfNote, hfsNote, hgNote, hgsNote;
    private final int WHOLE_NOTE = 1000;
    //private NumberPicker notepicker, numberpicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        createMediaPlayers();


        //numberpicker.setMinValue(0);
        //numberpicker.setMaxValue(10);
        //notepicker.setMinValue(0);
        //notepicker.setMaxValue(11);
        //notepicker.setDisplayedValues( new String[] { "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#" } );

    }
    private void createMediaPlayers(){
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        haNote = MediaPlayer.create(this, R.raw.scalehigha);
        hasNote = MediaPlayer.create(this, R.raw.scalehighbb);
        hbNote = MediaPlayer.create(this, R.raw.scalehighb);
        hcNote = MediaPlayer.create(this, R.raw.scalehighc);
        hcsNote = MediaPlayer.create(this, R.raw.scalehighcs);
        hdNote = MediaPlayer.create(this, R.raw.scalehighd);
        hdsNote = MediaPlayer.create(this, R.raw.scalehighds);
        heNote = MediaPlayer.create(this, R.raw.scalehighe);
        hfNote = MediaPlayer.create(this, R.raw.scalehighf);
        hfsNote = MediaPlayer.create(this, R.raw.scalehighfs);
        hgNote = MediaPlayer.create(this, R.raw.scalehighg);
        hgsNote = MediaPlayer.create(this, R.raw.scalehighgs);


    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
        eScale.setOnClickListener(this);
        challengetwo.setOnClickListener(this);
        challengefive.setOnClickListener(this);
        challengetwelve.setOnClickListener(this);


    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
        eScale = (Button) findViewById(R.id.eScale);
        //numberpicker = (NumberPicker) findViewById(numberpicker);
        //notepicker = (NumberPicker) findViewById(notePicker);
        challengetwo = (Button) findViewById(R.id.challenge_2);
        challengefive = (Button) findViewById(R.id.challenge_5);
        challengetwelve = (Button) findViewById(R.id.challenge_12);

    }

    private void delayPlaying(int WHOLE_NOTE){
        try {
            Thread.sleep(WHOLE_NOTE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_a:
            aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_as:
            asNote.seekTo(0);
            asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.eScale:
                haNote.seekTo(0);
                haNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hasNote.seekTo(0);
                hasNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hbNote.seekTo(0);
                hbNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hcNote.seekTo(0);
                hcNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hcsNote.seekTo(0);
                hcsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hdNote.seekTo(0);
                hdNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hdsNote.seekTo(0);
                hdsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfNote.seekTo(0);
                hfNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfsNote.seekTo(0);
                hfsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hgNote.seekTo(0);
                hgNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hgsNote.seekTo(0);
                hgsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                break;
            //case R.id.challenge_2:
               // k = notepicker.getValue();
                //for(i = 0; i < numberpicker.getValue(); i++)
               // {
                //    notes[k].seekTo(0);
                //    notes[k].start();
                //    delayPlaying(WHOLE_NOTE / 2);
                //}
               // break;
            case R.id.challenge_5:
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfsNote.seekTo(0);
                hfsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfsNote.seekTo(0);
                hfsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);

                gNote.seekTo(0);
                gNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                fNote.seekTo(0);
                fNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);

                gNote.seekTo(0);
                gNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                fNote.seekTo(0);
                fNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);

                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfsNote.seekTo(0);
                hfsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                hfsNote.seekTo(0);
                hfsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                heNote.seekTo(0);
                heNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                csNote.seekTo(0);
                csNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                bNote.seekTo(0);
                bNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                break;

            case R.id.challenge_12:
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE/ 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 5);
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);

                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);

                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);

                aNote.seekTo(0);
                aNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                gNote.seekTo(0);
                gNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                fsNote.seekTo(0);
                fsNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                eNote.seekTo(0);
                eNote.start();
                delayPlaying(WHOLE_NOTE / 2);
                dNote.seekTo(0);
                dNote.start();
                delayPlaying(WHOLE_NOTE / 2);

            default:
        }
    }
}
