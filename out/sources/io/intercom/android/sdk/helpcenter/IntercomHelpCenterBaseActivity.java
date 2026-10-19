package io.intercom.android.sdk.helpcenter;

import Z3.o;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import kotlin.jvm.internal.i;
import p100i.d;

/* JADX INFO: compiled from: IntercomHelpCenterBaseActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class IntercomHelpCenterBaseActivity extends d {
    public static final int $stable = 0;

    private final Context localizedContext(Context context) {
        AppConfig appConfig = (AppConfig) o.b();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(appConfig.getHelpCenterLocale()));
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        i.d(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    @Override // p100i.d, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        i.e(newBase, "newBase");
        super.attachBaseContext(localizedContext(newBase));
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
