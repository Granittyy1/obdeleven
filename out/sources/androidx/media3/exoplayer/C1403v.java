package androidx.media3.exoplayer;

import android.util.Log;

/* JADX INFO: renamed from: androidx.media3.exoplayer.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1403v implements j1.j.a, p096h7.a.InterfaceC0377a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18827b;

    public /* synthetic */ C1403v(Object obj) {
        this.f18827b = obj;
    }

    @Override // p096h7.a.InterfaceC0377a
    public void d(p096h7.b bVar) {
        ((F7.a) bVar.get()).a((p264v6.d) this.f18827b);
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    @Override // j1.j.a
    public void invoke(Object obj) {
        ((g1.v.c) obj).q(((h0) this.f18827b).f18415e);
    }
}
