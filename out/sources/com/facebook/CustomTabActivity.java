package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CustomTabActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24742c = i.k(".action_customTabRedirect", "CustomTabActivity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f24743d = i.k(".action_destroy", "CustomTabActivity");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f24744b;

    /* JADX INFO: compiled from: CustomTabActivity.kt */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            i.e(context, "context");
            i.e(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f24742c);
            intent2.putExtra(CustomTabMainActivity.f24749g, getIntent().getDataString());
            p065f1.a.a(this).c(intent2);
            a aVar = new a();
            p065f1.a.a(this).b(aVar, new IntentFilter(f24743d));
            this.f24744b = aVar;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f24742c);
        intent.putExtra(CustomTabMainActivity.f24749g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        a aVar = this.f24744b;
        if (aVar != null) {
            p065f1.a.a(this).d(aVar);
        }
        super.onDestroy();
    }
}
