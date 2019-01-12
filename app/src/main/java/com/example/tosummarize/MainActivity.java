package com.example.tosummarize;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        setContentView(linearLayout);

        Button button;

        for (int i = 0; i < 3; i++) {
            button = new Button(this);
            button.setTag(i);
            // リスナーの登録
            button.setOnClickListener(this);
            linearLayout.addView(button);
        }
    }
    
    @Override
    public void onClick(View v) {
       String id = String.valueOf(v.getTag());
        Context context = getApplicationContext();
        Toast.makeText(context ,id + "番目が押されました", Toast.LENGTH_SHORT).show();
    }

}
