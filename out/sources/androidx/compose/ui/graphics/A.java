package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13472c;

    /* JADX WARN: Illegal instructions before constructor call */
    public A(int i10, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            B0.l.c();
            porterDuffColorFilter = B.a(Q3.d.K(j), C1137m.a(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(Q3.d.K(j), C1137m.b(i10));
        }
        super(porterDuffColorFilter);
        this.f13471b = j;
        this.f13472c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return H.c(this.f13471b, a10.f13471b) && C1149z.a(this.f13472c, a10.f13472c);
    }

    public final int hashCode() {
        int i10 = H.f13505m;
        return Integer.hashCode(this.f13472c) + (Long.hashCode(this.f13471b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        C4.v.h(this.f13471b, ", blendMode=", sb2);
        int i10 = this.f13472c;
        if (C1149z.a(i10, 0)) {
            str = "Clear";
        } else if (C1149z.a(i10, 1)) {
            str = "Src";
        } else if (C1149z.a(i10, 2)) {
            str = "Dst";
        } else if (C1149z.a(i10, 3)) {
            str = "SrcOver";
        } else if (C1149z.a(i10, 4)) {
            str = "DstOver";
        } else if (C1149z.a(i10, 5)) {
            str = "SrcIn";
        } else if (C1149z.a(i10, 6)) {
            str = "DstIn";
        } else if (C1149z.a(i10, 7)) {
            str = "SrcOut";
        } else if (C1149z.a(i10, 8)) {
            str = "DstOut";
        } else if (C1149z.a(i10, 9)) {
            str = "SrcAtop";
        } else if (C1149z.a(i10, 10)) {
            str = "DstAtop";
        } else if (C1149z.a(i10, 11)) {
            str = "Xor";
        } else if (C1149z.a(i10, 12)) {
            str = "Plus";
        } else if (C1149z.a(i10, 13)) {
            str = "Modulate";
        } else if (C1149z.a(i10, 14)) {
            str = "Screen";
        } else if (C1149z.a(i10, 15)) {
            str = "Overlay";
        } else if (C1149z.a(i10, 16)) {
            str = "Darken";
        } else if (C1149z.a(i10, 17)) {
            str = "Lighten";
        } else if (C1149z.a(i10, 18)) {
            str = "ColorDodge";
        } else if (C1149z.a(i10, 19)) {
            str = "ColorBurn";
        } else if (C1149z.a(i10, 20)) {
            str = "HardLight";
        } else if (C1149z.a(i10, 21)) {
            str = "Softlight";
        } else if (C1149z.a(i10, 22)) {
            str = "Difference";
        } else if (C1149z.a(i10, 23)) {
            str = "Exclusion";
        } else if (C1149z.a(i10, 24)) {
            str = "Multiply";
        } else if (C1149z.a(i10, 25)) {
            str = "Hue";
        } else if (C1149z.a(i10, 26)) {
            str = "Saturation";
        } else if (C1149z.a(i10, 27)) {
            str = "Color";
        } else {
            str = C1149z.a(i10, 28) ? "Luminosity" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
