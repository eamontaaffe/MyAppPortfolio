package com.example.eamon.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// Dont really need a settings menu.
// If you want to bring it back, uncomment this method
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyStreamerLaunch(View view) {
        CharSequence app = getText(R.string.spotify_streamer);
        toastAppMissing(app);
    }
    public void scoresAppLaunch(View view) {
        CharSequence app = getText(R.string.scores_app);
        toastAppMissing(app);
    }
    public void libraryAppLaunch(View view) {
        CharSequence app = getText(R.string.library_app);
        toastAppMissing(app);
    }
    public void buildItBiggerLaunch(View view) {
        CharSequence app = getText(R.string.build_it_bigger);
        toastAppMissing(app);
    }
    public void xyzReaderLaunch(View view) {
        CharSequence app = getText(R.string.xyz_reade);
        toastAppMissing(app);
    }
    public void capstoneLaunch(View view) {
        CharSequence app = getText(R.string.my_own_app);
        toastAppMissing(app);
    }

    public void toastAppMissing(CharSequence app){
        Context context = getApplicationContext();
        CharSequence intro = getText(R.string.this_button_will_launch);
        CharSequence text = TextUtils.concat(intro, app);
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, text, duration).show();
    }
}
