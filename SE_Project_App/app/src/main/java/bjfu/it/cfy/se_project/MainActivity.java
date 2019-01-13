package bjfu.it.cfy.se_project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WebView webview = (WebView) findViewById(R.id.webView1);
        webview.setWebChromeClient(new WebChromeClient());
        webview.loadUrl("http://172.20.10.2:8012/Blog/login.html");//http://115.28.165.3:8080/app/UserPage.jsp
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        Button bn=(Button)findViewById(R.id.button);
        bn.setOnClickListener(new Button.OnClickListener(){//创建监听
            public void onClick(View v) {
                webview.goBack();
            }

        });
    }
}
