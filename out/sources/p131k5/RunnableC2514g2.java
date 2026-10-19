package p131k5;

import com.google.android.gms.measurement.internal.e;
import com.google.firebase.crashlytics.internal.settings.a;
import java.util.concurrent.atomic.AtomicReference;
import p302y6.E;

/* JADX INFO: renamed from: k5.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2514g2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42182d;

    public /* synthetic */ RunnableC2514g2(Object obj, int i10, Object obj2) {
        this.f42180b = i10;
        this.f42181c = obj2;
        this.f42182d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42180b) {
            case 0:
                synchronized (((AtomicReference) this.f42181c)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.f42181c;
                            C2523i1 c2523i1 = (C2523i1) ((e) this.f42182d).f3968a;
                            atomicReference.set(Long.valueOf(c2523i1.f42218g.v(c2523i1.o().w(), B.f41631N)));
                            ((AtomicReference) this.f42181c).notify();
                        } catch (Throwable th) {
                            ((AtomicReference) this.f42181c).notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                E.a((E) this.f42182d, (a) this.f42181c);
                return;
        }
    }
}
