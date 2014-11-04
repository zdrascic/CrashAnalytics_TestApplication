package com.ddp.acrapa.test;

import org.acra.annotation.*;

import com.ddp.library.crash.analytics.CALog;
import android.app.Application;

@ReportsCrashes(formKey = "", formUri = "http://your.server.url.here/crash/add")
public class MainApplication extends Application {

	  @Override
	  public void onCreate() {
	    super.onCreate();
	    
	    // init CrashAnalytics
	    final CALog log = CALog.getLog(this.getClass().getPackage());
	    log.init(this);
	    
	    log.debug("Application started...");
	  }
}
