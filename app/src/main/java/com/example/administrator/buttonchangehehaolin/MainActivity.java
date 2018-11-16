package com.example.administrator.buttonchangehehaolin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.action_button1);
        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_normal));
                    button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                    button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                    button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
                }
                return false;
            }
        });
        button2=findViewById(R.id.action_button2);
        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                    button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_normal));
                    button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                    button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
                }
                return false;
            }
        });
        button3=findViewById(R.id.action_button3);
        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                    button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                    button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_normal));
                    button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
                }
                return false;
            }
        });
        button4=findViewById(R.id.action_button4);
        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                    button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                    button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                    button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_normal));
                }
                return false;
            }
        });
    }
}
