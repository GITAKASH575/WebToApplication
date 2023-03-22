 package com.example.code_catalyst;

 import android.annotation.SuppressLint;
 import android.os.Bundle;
 import android.view.KeyEvent;
 import android.webkit.WebView;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

     private WebView webView;

     @SuppressLint("SetJavaScriptEnabled")
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         webView = findViewById(R.id.webView);
         webView.getSettings().setJavaScriptEnabled(true);
         webView.loadUrl("https://codecatalyst-club.github.io/");
     }

@Override
     public boolean onKeyDown (int keyCode, KeyEvent event) {
    if (keyCode == KeyEvent.KEYCODE_BACK && this.webView.canGoBack()) {
        this.webView.goBack();
        return true;

    }
    return super. onKeyDown(keyCode, event);
}
 }
