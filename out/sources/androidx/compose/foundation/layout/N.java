package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
public final class N implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10172d;

    public N(float f10, float f11, float f12, float f13) {
        this.f10169a = f10;
        this.f10170b = f11;
        this.f10171c = f12;
        this.f10172d = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            p258v.a.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.L
    public final float a() {
        return this.f10172d;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float b(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f15717b ? this.f10169a : this.f10171c;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.f15717b ? this.f10171c : this.f10169a;
    }

    @Override // androidx.compose.foundation.layout.L
    public final float d() {
        return this.f10170b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return p013b0.f.a(this.f10169a, n10.f10169a) && p013b0.f.a(this.f10170b, n10.f10170b) && p013b0.f.a(this.f10171c, n10.f10171c) && p013b0.f.a(this.f10172d, n10.f10172d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f10172d) + O.a.d(this.f10171c, O.a.d(this.f10170b, Float.hashCode(this.f10169a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) p013b0.f.b(this.f10169a)) + ", top=" + ((Object) p013b0.f.b(this.f10170b)) + ", end=" + ((Object) p013b0.f.b(this.f10171c)) + ", bottom=" + ((Object) p013b0.f.b(this.f10172d)) + ')';
    }
}
