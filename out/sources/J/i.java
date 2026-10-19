package J;

import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.graphics.o0;
import p005a4.q;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3958d;

    public i(float f10, float f11, int i10, int i11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f3955a = f10;
        this.f3956b = f11;
        this.f3957c = i10;
        this.f3958d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3955a == iVar.f3955a && this.f3956b == iVar.f3956b && n0.a(this.f3957c, iVar.f3957c) && o0.a(this.f3958d, iVar.f3958d) && kotlin.jvm.internal.i.a(null, null);
    }

    public final int hashCode() {
        return q.b(this.f3958d, q.b(this.f3957c, O.a.d(this.f3956b, Float.hashCode(this.f3955a) * 31, 31), 31), 31) + 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f3955a);
        sb2.append(", miter=");
        sb2.append(this.f3956b);
        sb2.append(", cap=");
        int i10 = this.f3957c;
        String str2 = "Unknown";
        if (n0.a(i10, 0)) {
            str = "Butt";
        } else if (n0.a(i10, 1)) {
            str = "Round";
        } else {
            str = n0.a(i10, 2) ? "Square" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(", join=");
        int i11 = this.f3958d;
        if (o0.a(i11, 0)) {
            str2 = "Miter";
        } else if (o0.a(i11, 1)) {
            str2 = "Round";
        } else if (o0.a(i11, 2)) {
            str2 = "Bevel";
        }
        sb2.append((Object) str2);
        sb2.append(", pathEffect=");
        sb2.append((Object) null);
        sb2.append(')');
        return sb2.toString();
    }
}
