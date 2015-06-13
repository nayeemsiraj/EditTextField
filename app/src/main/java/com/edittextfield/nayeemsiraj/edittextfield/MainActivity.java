package com.edittextfield.nayeemsiraj.edittextfield;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends Activity {

    EditText edit1, edit2, edit3;
    TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=(EditText)findViewById(R.id.editText1);
        text1=(TextView)findViewById(R.id.textView2);
        edit2=(EditText)findViewById(R.id.editText2);
        text2=(TextView)findViewById(R.id.textView3);
        edit3=(EditText)findViewById(R.id.editText3);
        text3=(TextView)findViewById(R.id.textView4);
        Button b = (Button)findViewById(R.id.button_show);
        b.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){
                String name1 = edit1.getText().toString();

                text1.append(name1);

                String name2 = edit2.getText().toString();

                text2.append(name2);

                String name3 = edit3.getText().toString();

                text3.append(name3);
        }

    });

}
}
