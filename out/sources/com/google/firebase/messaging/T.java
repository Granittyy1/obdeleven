package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: compiled from: WithinAppServiceBinder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends Binder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractServiceC2046i.a f28333c;

    public T(AbstractServiceC2046i.a aVar) {
        this.f28333c = aVar;
    }

    public final void a(V.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseMessaging", 3);
        AbstractServiceC2046i.this.processIntent(aVar.f28342a).b(new p188p2.b(), new F0.b(aVar));
    }
}
