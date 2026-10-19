package androidx.compose.ui.input.pointer;

import java.util.ArrayList;

/* JADX INFO: compiled from: InternalPointerInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f14128i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f14129k;

    public t() {
        throw null;
    }

    public t(long j, long j10, long j11, long j12, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j13, long j14) {
        this.f14120a = j;
        this.f14121b = j10;
        this.f14122c = j11;
        this.f14123d = j12;
        this.f14124e = z10;
        this.f14125f = f10;
        this.f14126g = i10;
        this.f14127h = z11;
        this.f14128i = arrayList;
        this.j = j13;
        this.f14129k = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p.a(this.f14120a, tVar.f14120a) && this.f14121b == tVar.f14121b && I.d.b(this.f14122c, tVar.f14122c) && I.d.b(this.f14123d, tVar.f14123d) && this.f14124e == tVar.f14124e && Float.compare(this.f14125f, tVar.f14125f) == 0 && y.a(this.f14126g, tVar.f14126g) && this.f14127h == tVar.f14127h && kotlin.jvm.internal.i.a(this.f14128i, tVar.f14128i) && I.d.b(this.j, tVar.j) && I.d.b(this.f14129k, tVar.f14129k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14129k) + C4.b.c(this.j, (this.f14128i.hashCode() + androidx.compose.animation.D.b(p005a4.q.b(this.f14126g, O.a.d(this.f14125f, androidx.compose.animation.D.b(C4.b.c(this.f14123d, C4.b.c(this.f14122c, C4.b.c(this.f14121b, Long.hashCode(this.f14120a) * 31, 31), 31), 31), 31, this.f14124e), 31), 31), 31, this.f14127h)) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) ("PointerId(value=" + this.f14120a + ')'));
        sb2.append(", uptime=");
        sb2.append(this.f14121b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) I.d.i(this.f14122c));
        sb2.append(", position=");
        sb2.append((Object) I.d.i(this.f14123d));
        sb2.append(", down=");
        sb2.append(this.f14124e);
        sb2.append(", pressure=");
        sb2.append(this.f14125f);
        sb2.append(", type=");
        int i10 = this.f14126g;
        if (i10 == 1) {
            str = "Touch";
        } else if (i10 == 2) {
            str = "Mouse";
        } else if (i10 != 3) {
            str = i10 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb2.append((Object) str);
        sb2.append(", activeHover=");
        sb2.append(this.f14127h);
        sb2.append(", historical=");
        sb2.append(this.f14128i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) I.d.i(this.j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) I.d.i(this.f14129k));
        sb2.append(')');
        return sb2.toString();
    }
}
