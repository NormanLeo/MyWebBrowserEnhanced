package sg.edu.rp.c346.mywebbrowserenhanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import sg.edu.rp.c346.mywebbrowserenhanced.R;

public class MainActivity extends AppCompatActivity {
    EditText etURL;
    Button btnLoadURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etURL = findViewById(R.id.editTextURL);
        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());
        wvMyPage.getSettings().setJavaScriptEnabled(true);
        wvMyPage.getSettings().setAllowFileAccess(false);
        wvMyPage.getSettings().setBuiltInZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);
            }
        });
    }
}
