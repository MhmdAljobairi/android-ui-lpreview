package at.markushi.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import at.markushi.ui.action.BackAction;
import at.markushi.ui.action.CloseAction;
import at.markushi.ui.action.DrawerAction;
import at.markushi.ui.action.PlusAction;


public class ActionViewActivity extends Activity {


    ActionView mActionView, mActionView1, mActionView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_view);
        mActionView = (ActionView) findViewById(R.id.action);
        mActionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mActionView.setAction(new DrawerAction(), ActionView.DRAWING_CACHE_QUALITY_AUTO);

            }
        });


        mActionView1 = (ActionView) findViewById(R.id.action1);
        mActionView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mActionView1.setAction(new BackAction(), ActionView.DRAWING_CACHE_QUALITY_AUTO);

            }
        });


        mActionView2 = (ActionView) findViewById(R.id.action2);
        mActionView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mActionView2.setAction(new CloseAction(), ActionView.DRAWING_CACHE_QUALITY_AUTO);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
