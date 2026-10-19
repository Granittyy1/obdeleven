package p131k5;

import com.google.android.gms.measurement.internal.h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m3 extends n3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42303c;

    public m3(h hVar) {
        super(hVar);
        this.f42311b.f26615r++;
    }

    public final void t() {
        if (!this.f42303c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u() {
        if (this.f42303c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        v();
        this.f42311b.f26616s++;
        this.f42303c = true;
    }

    public abstract boolean v();
}
