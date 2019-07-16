package zw.ac.alc4phase1;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutALC extends AppCompatActivity {

    WebView alc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About ALC");

        alc = findViewById(R.id.alc_about);
        alc.setWebViewClient(new myBrowser());
        alc.getSettings().setDomStorageEnabled(true);
        alc.getSettings().setJavaScriptEnabled(true);
       // alc.clearSslPreferences();
        alc.loadUrl("https://andela.com/alc/");
    }

    private class myBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
