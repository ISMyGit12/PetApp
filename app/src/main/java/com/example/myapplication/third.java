package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class third extends Activity {
    TextView welcome;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        welcome=(TextView)findViewById(R.id.textview1);
        //Bundle bundle=this.getIntent().getExtras();
        welcome.setClickable(true);     //因为用TextView点击，将属性改为true，点击后返回封面
        welcome.setOnClickListener(new onclick());
    }
    class onclick implements View.OnClickListener {
        public void onClick(View v){
            Intent intent2 =new Intent(); //新建Intent对象
            intent2.setClass(third.this,MainActivity.class);
            startActivityForResult(intent2,0);   //返回前一页
        }
    }
}

