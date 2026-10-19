package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f27733b;

    public /* synthetic */ c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f27733b = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d dVar = this.f27733b;
        dVar.f27736b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        dVar.a().post(new C2033a(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f27733b;
        dVar.f27736b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        dVar.a().post(new C2034b(this));
    }
}
