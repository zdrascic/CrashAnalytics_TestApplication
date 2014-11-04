package com.ddp.acrapa.test;

import com.ddp.library.crash.analytics.CALog;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	final CALog log = CALog.getLog(this.getClass().getPackage());
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		log.debug("Activity started...");
	}
	
	public void crashApplication(View v){
		/// crash application
		log.info("Crash button triggered");
		throw new RuntimeException("Boom...");
	}
}
