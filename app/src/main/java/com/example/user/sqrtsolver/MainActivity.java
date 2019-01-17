package com.example.user.sqrtsolver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    String a,b,c;
    EditText aIn,bIn,cIn;
    String url;
    Button Clear,Solve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = (WebView) findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MywebViewClient());
        aIn=(EditText) findViewById(R.id.aIn);
        bIn=(EditText) findViewById(R.id.bIn);
        cIn=(EditText) findViewById(R.id.cIn);
        Clear=(Button) findViewById(R.id.btn1);
        Solve=(Button) findViewById(R.id.btn2);

    }

    public void clear(View view) {
        aIn.setText("");
        bIn.setText("");
        cIn.setText("");
    }

    public void solve(View view) {
      a = aIn.getText().toString();
      b =  bIn.getText().toString();
      c =  cIn.getText().toString();
      url = "https://www.google.com/search?q="+a+"x%5E2%2B"+b+"x%2B"+c+"&rlz=1C1GGRV_enIL801IL801&oq=3x%5E2%2B6x%2B2&aqs=chrome..69i57j0l5.567j0j7&sourceid=chrome&ie=UTF-8";
      wv.loadUrl(url);
    }

    private class MywebViewClient extends WebViewClient {
        @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
    }
}


    }


