package de.uvwxy.melogsta.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import de.uvwxy.melogsta.Log;

public class MainActivity extends Activity {
	private Button btnLogD = null;
	private Button btnLogE = null;
	private Button btnLogI = null;
	private Button btnLogV = null;
	private Button btnLogWTF = null;
	private Button btnLogW = null;
	private CheckBox cbCombined = null;
	private CheckBox cbLogCat = null;
	private CheckBox cbDisAll = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.setContext(this);
		initGUI();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void logD(View v) {
		Log.d("TAG_LOGD", "LOGD");
	}

	public void logE(View v) {
		Log.e("TAG_LOGE", "LOGE");
	}

	public void logI(View v) {
		Log.i("TAG_LOGI", "Log.w message");
	}

	public void logV(View v) {
		Log.v("TAG_LOGV", "Log.v message");
	}

	public void logW(View v) {
		Log.w("TAG_LOGW", "Log.w message");
	}

	public void logWTF(View v) {
		Log.wtf("TAG_LOGWTF", "Log.wtf message");
	}

	public void toggleCombined(View v) {
		if (cbCombined.isChecked()) {
			Log.setCombinedNotification(true);
		} else {
			Log.setCombinedNotification(false);
		}
	}

	public void toggleLogCat(View v) {
		if (cbLogCat.isChecked()) {
			Log.setAllLogToLogCat(true);
		} else {
			Log.setAllLogToLogCat(false);
		}
	}

	public void toggleLogDisAll(View v) {
		if (cbDisAll.isChecked()) {
			Log.setLogAnything(false);
		} else {
			Log.setLogAnything(true);
		}
	}

	private void initGUI() {
		btnLogD = (Button) findViewById(R.id.btnLogD);
		btnLogE = (Button) findViewById(R.id.btnLogE);
		btnLogI = (Button) findViewById(R.id.btnLogI);
		btnLogV = (Button) findViewById(R.id.btnLogV);
		btnLogWTF = (Button) findViewById(R.id.btnLogWTF);
		btnLogW = (Button) findViewById(R.id.btnLogW);
		cbCombined = (CheckBox) findViewById(R.id.cbCombined);
		cbLogCat = (CheckBox) findViewById(R.id.cbLogCat);
		cbDisAll = (CheckBox) findViewById(R.id.cbDisAll);
	}

}
