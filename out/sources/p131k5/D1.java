package p131k5;

import J2.l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D1 extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41749b;

    public D1(C2523i1 c2523i1) {
        super(c2523i1);
        ((C2523i1) this.f3968a).f42208E++;
    }

    public final void q() {
        if (!this.f41749b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f41749b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (s()) {
            return;
        }
        ((C2523i1) this.f3968a).f42210G.incrementAndGet();
        this.f41749b = true;
    }

    public abstract boolean s();
}
