package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0959t implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10324d;

    public C0959t(float f10, float f11, float f12, float f13) {
        this.f10321a = f10;
        this.f10322b = f11;
        this.f10323c = f12;
        this.f10324d = f13;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int a(p013b0.c cVar, LayoutDirection layoutDirection) {
        return cVar.e1(this.f10321a);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int b(p013b0.c cVar) {
        return cVar.e1(this.f10324d);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int c(p013b0.c cVar, LayoutDirection layoutDirection) {
        return cVar.e1(this.f10323c);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int d(p013b0.c cVar) {
        return cVar.e1(this.f10322b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0959t)) {
            return false;
        }
        C0959t c0959t = (C0959t) obj;
        return p013b0.f.a(this.f10321a, c0959t.f10321a) && p013b0.f.a(this.f10322b, c0959t.f10322b) && p013b0.f.a(this.f10323c, c0959t.f10323c) && p013b0.f.a(this.f10324d, c0959t.f10324d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10324d) + O.a.d(this.f10323c, O.a.d(this.f10322b, Float.hashCode(this.f10321a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) p013b0.f.b(this.f10321a)) + ", top=" + ((Object) p013b0.f.b(this.f10322b)) + ", right=" + ((Object) p013b0.f.b(this.f10323c)) + ", bottom=" + ((Object) p013b0.f.b(this.f10324d)) + ')';
    }
}
