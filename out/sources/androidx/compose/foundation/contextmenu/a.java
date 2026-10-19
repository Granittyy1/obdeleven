package androidx.compose.foundation.contextmenu;

import C4.v;
import androidx.compose.ui.graphics.H;

/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9872e;

    public a(long j, long j10, long j11, long j12, long j13) {
        this.f9868a = j;
        this.f9869b = j10;
        this.f9870c = j11;
        this.f9871d = j12;
        this.f9872e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return H.c(this.f9868a, aVar.f9868a) && H.c(this.f9869b, aVar.f9869b) && H.c(this.f9870c, aVar.f9870c) && H.c(this.f9871d, aVar.f9871d) && H.c(this.f9872e, aVar.f9872e);
    }

    public final int hashCode() {
        int i10 = H.f13505m;
        return Long.hashCode(this.f9872e) + C4.b.c(this.f9871d, C4.b.c(this.f9870c, C4.b.c(this.f9869b, Long.hashCode(this.f9868a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        v.h(this.f9868a, ", textColor=", sb2);
        v.h(this.f9869b, ", iconColor=", sb2);
        v.h(this.f9870c, ", disabledTextColor=", sb2);
        v.h(this.f9871d, ", disabledIconColor=", sb2);
        sb2.append((Object) H.i(this.f9872e));
        sb2.append(')');
        return sb2.toString();
    }
}
