package webview.bxlt.com.webviewtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.afollestad.materialdialogs.MaterialDialog;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;

public class MainActivity extends XWalkActivity {
    private XWalkView xWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        xWalkWebView=(XWalkView)findViewById(R.id.xwalkWebView);

        // turn on debugging
//        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
    }

    private MaterialDialog mLoginProgressDialog;
    @Override
    protected void onXWalkReady() {

        xWalkWebView.load("file:///android_asset/www/nav4.html",null);
//        xWalkWebView.load("http://www.baidu.com",null);
    }

}
