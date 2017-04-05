package com.example.yls.tbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private com.tencent.smtt.sdk.WebView webView;
    private String url = "http://www.baidu.com";
    private WebViewClient mClient=new WebViewClient(){
        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String s) {
           // return super.shouldOverrideUrlLoading(webView, s);
            webView.loadUrl(s);
            return true;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView= (WebView) findViewById(R.id.webView);

        webView.setWebViewClient(mClient);
        webView.loadUrl(url);

    }



}
