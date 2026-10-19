package com.facebook;

import Z3.q;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.f;
import com.facebook.login.C1771c;
import com.facebook.login.LoginTargetApp;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import p165n4.k;
import p165n4.m;
import p165n4.p;
import p165n4.s;

/* JADX INFO: compiled from: CustomTabMainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24746d = i.k(".extra_action", "CustomTabMainActivity");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24747e = i.k(".extra_params", "CustomTabMainActivity");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f24748f = i.k(".extra_chromePackage", "CustomTabMainActivity");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f24749g = i.k(".extra_url", "CustomTabMainActivity");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f24750h = i.k(".extra_targetApp", "CustomTabMainActivity");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f24751i = i.k(".action_refresh", "CustomTabMainActivity");
    public static final String j = i.k(".no_activity_exception", "CustomTabMainActivity");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24752b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f24753c;

    /* JADX INFO: compiled from: CustomTabMainActivity.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24754a;

        static {
            int[] iArr = new int[LoginTargetApp.valuesCustom().length];
            iArr[1] = 1;
            f24754a = iArr;
        }
    }

    /* JADX INFO: compiled from: CustomTabMainActivity.kt */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            i.e(context, "context");
            i.e(intent, "intent");
            CustomTabMainActivity customTabMainActivity = CustomTabMainActivity.this;
            Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f24751i);
            String str = CustomTabMainActivity.f24749g;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            customTabMainActivity.startActivity(intent2);
        }
    }

    public final void a(int i10, Intent intent) {
        Bundle bundle;
        b bVar = this.f24753c;
        if (bVar != null) {
            p065f1.a.a(this).d(bVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f24749g);
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                bundle = s.C(uri.getQuery());
                bundle.putAll(s.C(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            m mVar = m.f44914a;
            Intent intent2 = getIntent();
            i.d(intent2, "intent");
            Intent intentD = m.d(intent2, bundle, null);
            if (intentD != null) {
                intent = intentD;
            }
            setResult(i10, intent);
        } else {
            m mVar2 = m.f44914a;
            Intent intent3 = getIntent();
            i.d(intent3, "intent");
            setResult(i10, m.d(intent3, null, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        LoginTargetApp loginTargetApp;
        P3.b bVar;
        boolean z10;
        Uri uriB;
        super.onCreate(bundle);
        if (i.a(CustomTabActivity.f24742c, getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra(f24746d)) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra(f24747e);
        String stringExtra2 = getIntent().getStringExtra(f24748f);
        String stringExtra3 = getIntent().getStringExtra(f24750h);
        LoginTargetApp[] loginTargetAppArrValuesCustom = LoginTargetApp.valuesCustom();
        int length = loginTargetAppArrValuesCustom.length;
        int i10 = 0;
        do {
            if (i10 >= length) {
                loginTargetApp = LoginTargetApp.FACEBOOK;
                break;
            } else {
                loginTargetApp = loginTargetAppArrValuesCustom[i10];
                i10++;
            }
        } while (!i.a(loginTargetApp.toString(), stringExtra3));
        if (a.f24754a[loginTargetApp.ordinal()] == 1) {
            bVar = new k(stringExtra, bundleExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                uriB = s.b(bundleExtra, p.b(), "oauth/authorize");
            } else {
                uriB = s.b(bundleExtra, p.b(), q.d() + "/dialog/" + stringExtra);
            }
            bVar.f4915b = uriB;
        } else {
            bVar = new P3.b(stringExtra, bundleExtra);
        }
        ReentrantLock reentrantLock = C1771c.f25109d;
        reentrantLock.lock();
        f fVar = C1771c.f25108c;
        C1771c.f25108c = null;
        reentrantLock.unlock();
        Intent intent = new Intent("android.intent.action.VIEW");
        if (fVar != null) {
            intent.setPackage(((ComponentName) fVar.f13066c).getPackageName());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBinder("android.support.customtabs.extra.SESSION", fVar == null ? null : (p198q.b) fVar.f13065b);
        intent.putExtras(bundle2);
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.setPackage(stringExtra2);
        try {
            intent.setData((Uri) bVar.f4915b);
            startActivity(intent, null);
            z10 = true;
        } catch (ActivityNotFoundException unused) {
            z10 = false;
        }
        this.f24752b = false;
        if (!z10) {
            setResult(0, getIntent().putExtra(j, true));
            finish();
        } else {
            b bVar2 = new b();
            this.f24753c = bVar2;
            p065f1.a.a(this).b(bVar2, new IntentFilter(CustomTabActivity.f24742c));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        i.e(intent, "intent");
        super.onNewIntent(intent);
        if (i.a(f24751i, intent.getAction())) {
            p065f1.a.a(this).c(new Intent(CustomTabActivity.f24743d));
            a(-1, intent);
        } else if (i.a(CustomTabActivity.f24742c, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f24752b) {
            a(0, null);
        }
        this.f24752b = true;
    }
}
