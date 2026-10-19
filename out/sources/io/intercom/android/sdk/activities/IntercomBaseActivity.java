package io.intercom.android.sdk.activities;

import Z3.o;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import p100i.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomBaseActivity extends d {
    private Context localizedContext(Context context) {
        AppConfig appConfig = (AppConfig) o.b();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(appConfig.getLocale()));
        return context.createConfigurationContext(configuration);
    }

    @Override // p100i.d, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(localizedContext(context));
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector.get().getActivityFinisher().register(this);
    }

    @Override // p100i.d, androidx.fragment.app.ActivityC1347l, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Injector.get().getActivityFinisher().unregister(this);
    }
}
