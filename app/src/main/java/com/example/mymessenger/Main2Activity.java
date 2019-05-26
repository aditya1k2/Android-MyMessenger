package com.example.mymessenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String messageText=intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView=findViewById(R.id.message);
        messageView.setText(messageText);
    }
}
