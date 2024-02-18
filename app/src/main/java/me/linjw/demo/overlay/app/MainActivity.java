package me.linjw.demo.overlay.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import me.linjw.demo.overlay.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.text);
        StringBuilder sb = new StringBuilder();
        int id = getResources().getIdentifier("app_name", "string", "me.linjw.demo.overlay.app");
        if (id != 0) {
            sb.append("app_name=" + getResources().getString(id)).append("\n");
        }else {
            sb.append("app_name=?").append("\n");
        }
        id = getResources().getIdentifier("app_name2", "string", "me.linjw.demo.overlay.overlay");
        if (id != 0) {
            sb.append("app_name2=" + getResources().getString(id));
        }else {
            sb.append("app_name2=?");
        }
        tv.setText(sb);
    }
}