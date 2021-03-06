package com.lukesoft.archcomponentsdemo;

import android.app.Application;
import com.idescout.sql.SqlScoutServer;

/**
 * Created by lukesoft on 2018/07/12.
 **/
public class App extends Application {
    private static App INSTANCE;

    public static App getAppInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        SqlScoutServer.create(this, getPackageName());
    }
}
