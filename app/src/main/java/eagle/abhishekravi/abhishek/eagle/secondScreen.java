package eagle.abhishekravi.abhishek.eagle;

import android.app.Activity;
import java.util.*;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.logging.LogRecord;

import static android.app.PendingIntent.getActivity;

/**
 * Created by Abhishek on 1/11/2015.
 */


public class secondScreen extends Activity implements View.OnClickListener {

    //drawables
    int res[] = new int[] {R.drawable.brownbars,R.drawable.centeredorangedot, R.drawable.dots, R.drawable.greenlines, R.drawable.lightbulb, R.drawable.orangedots, R.drawable.orangelines, R.drawable.tree, R.drawable.yellow, R.drawable.yellowwithred, R.drawable.brownbars,R.drawable.centeredorangedot,
            R.drawable.dots, R.drawable.greenlines, R.drawable.lightbulb, R.drawable.orangedots, R.drawable.orangelines, R.drawable.tree, R.drawable.yellow, R.drawable.yellowwithred};
    int lay1, lay2, shuffleCount = 0, gameCount = 0;
    ImageButton first, second;

    LinearLayout layout;
    boolean isClickable = true;

    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;
    ImageButton b6;
    ImageButton b7;
    ImageButton b8;
    ImageButton b9;
    ImageButton b10;
    ImageButton b11;
    ImageButton b12;
    ImageButton b13;
    ImageButton b14;
    ImageButton b15;
    ImageButton b16;
    ImageButton b17;
    ImageButton b18;
    ImageButton b19;
    ImageButton b20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout);
        Intent activityThatCalled = getIntent();

        layout = new LinearLayout(this);
        //initialize all buttons in game
        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);
        b13 = (ImageButton) findViewById(R.id.b13);
        b14 = (ImageButton) findViewById(R.id.b14);
        b15 = (ImageButton) findViewById(R.id.b15);
        b16 = (ImageButton) findViewById(R.id.b16);
        b17 = (ImageButton) findViewById(R.id.b17);
        b18 = (ImageButton) findViewById(R.id.b18);
        b19 = (ImageButton) findViewById(R.id.b19);
        b20 = (ImageButton) findViewById(R.id.b20);

        iconRandomizer();



    };
    public void buttonEnabler() {
//
        if (isClickable) {
            b1.setClickable(true);
            b2.setClickable(true);
            b3.setClickable(true);
            b4.setClickable(true);
            b5.setClickable(true);
            b6.setClickable(true);
            b7.setClickable(true);
            b8.setClickable(true);
            b9.setClickable(true);
            b10.setClickable(true);
            b11.setClickable(true);
            b12.setClickable(true);
            b13.setClickable(true);
            b14.setClickable(true);
            b15.setClickable(true);
            b16.setClickable(true);
            b17.setClickable(true);
            b18.setClickable(true);
            b19.setClickable(true);
            b20.setClickable(true);

        }
        else{
            b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);
            b9.setClickable(false);
            b10.setClickable(false);
            b11.setClickable(false);
            b12.setClickable(false);
            b13.setClickable(false);
            b14.setClickable(false);
            b15.setClickable(false);
            b16.setClickable(false);
            b17.setClickable(false);
            b18.setClickable(false);
            b19.setClickable(false);
            b20.setClickable(false);
        }
    }

    public void randomCheck(ImageButton btn, int image) {

        if (gameCount <= 2) {
            Log.d("isCheck", String.valueOf(isClickable));
            gameCount++;
            if (gameCount == 1) {
                first = btn;
                lay1 = image;
            }
            else {

                isClickable = false;
                Log.d("isCheck", String.valueOf(isClickable));
                second = btn;
                lay2 = image;
                buttonEnabler();


                if (lay1 != lay2) {

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        public void run() {

                            first.setImageResource(R.color.material_blue_grey_800);
                            second.setImageResource(R.color.material_blue_grey_800);
                            first.setEnabled(true);
                            second.setEnabled(true);
                            isClickable = true;
                            buttonEnabler();

                        }
                    }, 1000);

                }
                else if (lay1 == lay2){
                    Toast.makeText(this, "MATCH!",Toast.LENGTH_SHORT).show();
                    isClickable = true;
                    buttonEnabler();

                }
                gameCount = 0;
                // isClickable = true;

            }

        }
        else if (gameCount > 2)
            gameCount = 0;


    }

    static void shuffleArray(int[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }




    public void iconRandomizer() {

        for (int i = 0; i < 10; i++)
            System.out.println(res[i]);


        shuffleArray(res);

        for (int i = 0; i < 10; i++)
            System.out.println(res[i]);

        if (isClickable) {
            b1.setOnClickListener(this);
            b2.setOnClickListener(this);
            b3.setOnClickListener(this);
            b4.setOnClickListener(this);
            b5.setOnClickListener(this);
            b6.setOnClickListener(this);
            b7.setOnClickListener(this);
            b8.setOnClickListener(this);
            b9.setOnClickListener(this);
            b10.setOnClickListener(this);
            b11.setOnClickListener(this);
            b12.setOnClickListener(this);
            b13.setOnClickListener(this);
            b14.setOnClickListener(this);
            b15.setOnClickListener(this);
            b16.setOnClickListener(this);
            b17.setOnClickListener(this);
            b18.setOnClickListener(this);
            b19.setOnClickListener(this);
            b20.setOnClickListener(this);
            isClickable = true;
        }
    }




    public void onClick(View v){
        System.out.println(isClickable);

        if (isClickable) {
            switch (v.getId()) {
                case R.id.b1:
                    Log.d("mytag", "isclickable is true");
                    b1.setImageResource(res[0]);
                    b1.setEnabled(false);
                    randomCheck(b1, res[0]);
                    break;
                case R.id.b2:

                    b2.setImageResource(res[1]);
                    b2.setEnabled(false);
                    randomCheck(b2, res[1]);
                    break;
                case R.id.b3:
                    b3.setImageResource(res[2]);
                    b3.setEnabled(false);
                    randomCheck(b3, res[2]);

                    break;
                case R.id.b4:
                    b4.setImageResource(res[3]);
                    b4.setEnabled(false);
                    randomCheck(b4, res[3]);

                    break;
                case R.id.b5:
                    b5.setImageResource(res[4]);
                    b5.setEnabled(false);
                    randomCheck(b5, res[4]);

                    break;
                case R.id.b6:
                    b6.setImageResource(res[5]);
                    b6.setEnabled(false);
                    randomCheck(b6, res[5]);

                    break;
                case R.id.b7:
                    b7.setImageResource(res[6]);
                    b7.setEnabled(false);
                    randomCheck(b7, res[6]);
                    break;
                case R.id.b8:
                    b8.setImageResource(res[7]);
                    b8.setEnabled(false);
                    randomCheck(b8, res[7]);

                    break;
                case R.id.b9:
                    b9.setImageResource(res[8]);
                    b9.setEnabled(false);
                    randomCheck(b9, res[8]);

                    break;
                case R.id.b10:
                    b10.setImageResource(res[9]);
                    b10.setEnabled(false);
                    randomCheck(b10, res[9]);

                    break;
                case R.id.b11:
                    b11.setImageResource(res[10]);
                    b11.setEnabled(false);
                    randomCheck(b11, res[10]);

                    break;
                case R.id.b12:
                    b12.setImageResource(res[11]);
                    b12.setEnabled(false);
                    randomCheck(b12, res[11]);
                    break;
                case R.id.b13:
                    b13.setImageResource(res[12]);
                    b13.setEnabled(false);
                    randomCheck(b13, res[12]);
                    break;
                case R.id.b14:
                    b14.setImageResource(res[13]);
                    b14.setEnabled(false);
                    randomCheck(b14, res[13]);
                    break;
                case R.id.b15:
                    b15.setImageResource(res[14]);
                    b15.setEnabled(false);
                    randomCheck(b15, res[14]);
                    break;
                case R.id.b16:
                    b16.setImageResource(res[15]);
                    b16.setEnabled(false);
                    randomCheck(b16, res[15]);
                    break;
                case R.id.b17:
                    b17.setImageResource(res[16]);
                    b17.setEnabled(false);
                    randomCheck(b17, res[16]);
                    break;
                case R.id.b18:
                    b18.setImageResource(res[17]);
                    b18.setEnabled(false);
                    randomCheck(b18, res[17]);
                    break;
                case R.id.b19:
                    b19.setImageResource(res[18]);
                    b19.setEnabled(false);
                    randomCheck(b19, res[18]);
                    break;
                case R.id.b20:
                    b20.setImageResource(res[19]);
                    b20.setEnabled(false);
                    randomCheck(b20, res[19]);
                    break;
            }
        }


    }

}











