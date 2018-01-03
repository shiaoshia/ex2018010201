package tw.com.shiaoshia.myapplication;

import android.content.Intent;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn3,btn4,btn5;
    CheckedTextView ctv01;
    ToggleButton tb01;
    Switch sh01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckedTextView ctv01 = (CheckedTextView)findViewById(R.id.checkedTextView2);
        btn3 = (Button)findViewById(R.id.button3);
        MyListener listener = new MyListener();
        btn3.setOnClickListener(listener);

        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Text04",Toast.LENGTH_SHORT).show();
            }
        });

        btn5 = (Button)findViewById(R.id.button5);
        btn5.setOnClickListener(this);

        tb01 = (ToggleButton)findViewById(R.id.toggleButton);
        tb01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb01.isChecked()) {
                    Toast.makeText(MainActivity.this, "目前開啟中", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"目前關閉中",Toast.LENGTH_SHORT).show();
                }
            }
        });

        sh01 = (Switch)findViewById(R.id.switch1);
        sh01.setOnClickListener(this);

    }

    //靜態指定,layout時就指定它
    public void click01(View v) {
        //debug常用的顯示訊息
        //Toast.makeText(MainActivity.this, "Test1",Toast.LENGTH_LONG).show();

        switch (v.getId())
        {
            case R.id.button:
                Toast.makeText(MainActivity.this,"Test01",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this,"Test02",Toast.LENGTH_LONG).show();
                break;
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button5:
                Toast.makeText(MainActivity.this,"Text05",Toast.LENGTH_SHORT).show();
                break;
            case R.id.switch1:
                if(sh01.isChecked())
                {
                    Toast.makeText(MainActivity.this,"按開",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"按關",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    class MyListener implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"Text03",Toast.LENGTH_SHORT).show();
        }
    }

    public void click06(View v) {
        if (tb01.isChecked()) {
            Toast.makeText(MainActivity.this, "目前開啟中", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"目前關閉中",Toast.LENGTH_SHORT).show();
        }
    }

}
