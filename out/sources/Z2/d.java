package Z2;

import android.view.View;

/* JADX INFO: compiled from: RealViewSizeResolver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d<T extends View> implements i<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f7729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7730c;

    public d(T t8, boolean z10) {
        this.f7729b = t8;
        this.f7730c = z10;
    }

    @Override // Z2.i
    public final T a() {
        return this.f7729b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (kotlin.jvm.internal.i.a(this.f7729b, dVar.f7729b)) {
                if (this.f7730c == dVar.f7730c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7730c) + (this.f7729b.hashCode() * 31);
    }

    @Override // Z2.i
    public final boolean l() {
        return this.f7730c;
    }
}
