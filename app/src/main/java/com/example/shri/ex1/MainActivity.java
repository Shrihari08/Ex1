package com.example.shri.ex1;
        import android.graphics.Color;
        import android.graphics.Typeface;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView1=(TextView) findViewById(R.id.textView1);
        Button ChangeFontSize= (Button) findViewById(R.id.button1);
        Button ChangeFontColor= (Button) findViewById(R.id.button2);
        Button ChangeFont= (Button) findViewById(R.id.button3);
        ChangeFontSize.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView1.setTextSize(40);
            }
        });
        ChangeFontColor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Log.d("okay",textView1.toString());
                textView1.setTextColor(Color.GREEN);
            }
        });
        ChangeFont.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView1.setTypeface(Typeface.DEFAULT);
            }
        });
    }
}

