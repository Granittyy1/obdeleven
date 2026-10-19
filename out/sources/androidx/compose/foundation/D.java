package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;

/* JADX INFO: compiled from: OverscrollConfiguration.android.kt */
/* JADX INFO: loaded from: classes.dex */
@p293xa.d
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.layout.L f9748b;

    public D() {
        long jE = Q3.d.e(4284900966L);
        androidx.compose.foundation.layout.N nA = PaddingKt.a();
        this.f9747a = jE;
        this.f9748b = nA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!D.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        D d10 = (D) obj;
        return androidx.compose.ui.graphics.H.c(this.f9747a, d10.f9747a) && kotlin.jvm.internal.i.a(this.f9748b, d10.f9748b);
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return this.f9748b.hashCode() + (Long.hashCode(this.f9747a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        C4.v.h(this.f9747a, ", drawPadding=", sb2);
        sb2.append(this.f9748b);
        sb2.append(')');
        return sb2.toString();
    }
}
