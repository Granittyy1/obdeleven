package com.facebook;

import Z3.C0835a;
import Z3.C0841g;
import Z3.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CurrentAccessTokenExpirationBroadcastReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i.e(context, "context");
        i.e(intent, "intent");
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && q.f7866p.get()) {
            C0841g c0841gA = C0841g.f7810f.a();
            C0835a c0835a = c0841gA.f7814c;
            c0841gA.b(c0835a, c0835a);
        }
    }
}
