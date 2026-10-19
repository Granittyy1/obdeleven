package p131k5;

/* JADX INFO: renamed from: k5.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2589z0 extends C2538m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42546b;

    public AbstractC2589z0(C2523i1 c2523i1) {
        super(c2523i1);
        ((C2523i1) this.f3968a).f42208E++;
    }

    public final void t() {
        if (!this.f42546b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u() {
        if (this.f42546b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (v()) {
            return;
        }
        ((C2523i1) this.f3968a).f42210G.incrementAndGet();
        this.f42546b = true;
    }

    public abstract boolean v();
}
