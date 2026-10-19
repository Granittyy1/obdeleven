package p264v6;

import A6.b0;
import android.util.Log;
import com.google.firebase.messaging.C2051n;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements p264v6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47651c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p096h7.a<p264v6.a> f47652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<p264v6.a> f47653b = new AtomicReference<>(null);

    /* JADX INFO: compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    public static final class a implements g {
    }

    public c(p096h7.a<p264v6.a> aVar) {
        this.f47652a = aVar;
        aVar.a(new C2051n(this));
    }

    @Override // p264v6.a
    public final g a(String str) {
        p264v6.a aVar = this.f47653b.get();
        return aVar == null ? f47651c : aVar.a(str);
    }

    @Override // p264v6.a
    public final boolean b() {
        p264v6.a aVar = this.f47653b.get();
        return aVar != null && aVar.b();
    }

    @Override // p264v6.a
    public final boolean c(String str) {
        p264v6.a aVar = this.f47653b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // p264v6.a
    public final void d(final String str, final long j, final b0 b0Var) {
        Log.isLoggable("FirebaseCrashlytics", 2);
        this.f47652a.a(new p096h7.a.InterfaceC0377a() { // from class: v6.b
            @Override // p096h7.a.InterfaceC0377a
            public final void d(p096h7.b bVar) {
                ((a) bVar.get()).d(str, j, b0Var);
            }
        });
    }
}
