package com.facebook;

import Z3.q;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.ActivityC1347l;
import androidx.fragment.app.C1336a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.facebook.login.s;
import com.voltasit.obdeleven.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.collections.k;
import kotlin.jvm.internal.i;
import p165n4.e;
import p165n4.m;

/* JADX INFO: compiled from: FacebookActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public class FacebookActivity extends ActivityC1347l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f24756b;

    @Override // androidx.fragment.app.ActivityC1347l, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        i.e(prefix, "prefix");
        i.e(writer, "writer");
        if (i.a(null, Boolean.TRUE)) {
            return;
        }
        super.dump(prefix, fileDescriptor, writer, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        i.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f24756b;
        if (fragment == null) {
            return;
        }
        fragment.onConfigurationChanged(newConfig);
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        Fragment fragment2;
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!q.f7866p.get()) {
            Context applicationContext = getApplicationContext();
            i.d(applicationContext, "applicationContext");
            synchronized (q.class) {
                q.i(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if ("PassThrough".equals(intent.getAction())) {
            Intent requestIntent = getIntent();
            m mVar = m.f44914a;
            i.d(requestIntent, "requestIntent");
            int intExtra = requestIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
            Bundle extras = (!k.M(Integer.valueOf(intExtra), m.f44918e) || intExtra < 20140701) ? requestIntent.getExtras() : requestIntent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
            if (extras == null) {
                facebookException = null;
            } else {
                String string = extras.getString("error_type");
                if (string == null) {
                    string = extras.getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String string2 = extras.getString("error_description");
                if (string2 == null) {
                    string2 = extras.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                facebookException = (string == null || !string.equalsIgnoreCase("UserCanceled")) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
            }
            Intent intent2 = getIntent();
            i.d(intent2, "intent");
            setResult(0, m.d(intent2, null, facebookException));
            finish();
            return;
        }
        Intent intent3 = getIntent();
        y supportFragmentManager = getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        Fragment fragmentD = supportFragmentManager.D("SingleFragment");
        if (fragmentD == null) {
            if ("FacebookDialogFragment".equals(intent3.getAction())) {
                fragment = fragmentD;
                e eVar = new e();
                eVar.setRetainInstance(true);
                eVar.v(supportFragmentManager, "SingleFragment");
                fragment2 = eVar;
            } else {
                fragment = fragmentD;
                s sVar = new s();
                sVar.setRetainInstance(true);
                C1336a c1336a = new C1336a(supportFragmentManager);
                c1336a.d(R.id.com_facebook_fragment_container, sVar, "SingleFragment", 1);
                c1336a.i();
                fragment2 = sVar;
            }
            fragment = fragment2;
        }
        fragment = fragmentD;
        this.f24756b = fragment;
    }
}
