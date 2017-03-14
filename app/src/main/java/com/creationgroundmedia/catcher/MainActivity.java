package com.creationgroundmedia.catcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String subject = getIntent().getStringExtra(Intent.EXTRA_SUBJECT);
        String message = getIntent().getStringExtra(Intent.EXTRA_TEXT);

        TextView tvSubject = (TextView) findViewById(R.id.tvSubject);
        TextView tvMessage = (TextView) findViewById(R.id.tvMessage);

        tvSubject.setText(subject);
        tvMessage.setText(message);
    }
}
