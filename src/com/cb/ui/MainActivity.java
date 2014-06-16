package com.cb.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.cb.R;
import com.cb.test.fragment.ui.FragmentTestActivity;
import com.cb.test.ui.ParserActivity;

public class MainActivity extends Activity
{

    private Button mXmlParserBtn, mFragmentTestBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews()
    {
        mXmlParserBtn = (Button) findViewById(R.id.xml_parser_btn);
        mXmlParserBtn.setOnClickListener(listener);
        
        mFragmentTestBtn = (Button) findViewById(R.id.fragment_test_btn);
        mFragmentTestBtn.setOnClickListener(listener);
    }

    private OnClickListener listener = new OnClickListener()
    {

        @Override
        public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.xml_parser_btn:
                    startActivity(new Intent(MainActivity.this, ParserActivity.class));
                    break;
                    
                case R.id.fragment_test_btn:
                    startActivity(new Intent(MainActivity.this, FragmentTestActivity.class));
            }
        }
    };

}
