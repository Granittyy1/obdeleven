package com.facebook;

import J2.l;
import Z3.C0842h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AuthenticationTokenManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f24737d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AuthenticationTokenManager f24738e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065f1.a f24739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f24740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0842h f24741c;

    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            i.e(context, "context");
            i.e(intent, "intent");
        }
    }

    /* JADX INFO: compiled from: AuthenticationTokenManager.kt */
    public static final class a {
    }

    public AuthenticationTokenManager(p065f1.a aVar, l lVar) {
        this.f24739a = aVar;
        this.f24740b = lVar;
    }
}
