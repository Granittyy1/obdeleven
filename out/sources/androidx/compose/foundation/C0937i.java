package androidx.compose.foundation;

import androidx.compose.ui.graphics.m0;

/* JADX INFO: renamed from: androidx.compose.foundation.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BorderStroke.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0937i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f10066b;

    public C0937i(float f10, m0 m0Var) {
        this.f10065a = f10;
        this.f10066b = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0937i)) {
            return false;
        }
        C0937i c0937i = (C0937i) obj;
        return p013b0.f.a(this.f10065a, c0937i.f10065a) && this.f10066b.equals(c0937i.f10066b);
    }

    public final int hashCode() {
        return this.f10066b.hashCode() + (Float.hashCode(this.f10065a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) p013b0.f.b(this.f10065a)) + ", brush=" + this.f10066b + ')';
    }
}
