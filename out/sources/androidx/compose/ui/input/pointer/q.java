package androidx.compose.ui.input.pointer;

import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14108i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f14109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f14110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q f14113o;

    public q() {
        throw null;
    }

    public q(long j, long j10, long j11, boolean z10, float f10, long j12, long j13, boolean z11, boolean z12, int i10, long j14) {
        this.f14100a = j;
        this.f14101b = j10;
        this.f14102c = j11;
        this.f14103d = z10;
        this.f14104e = f10;
        this.f14105f = j12;
        this.f14106g = j13;
        this.f14107h = z11;
        this.f14108i = i10;
        this.j = j14;
        this.f14110l = 0L;
        this.f14111m = z12;
        this.f14112n = z12;
    }

    public final void a() {
        q qVar = this.f14113o;
        if (qVar == null) {
            this.f14111m = true;
            this.f14112n = true;
        } else if (qVar != null) {
            qVar.a();
        }
    }

    public final boolean b() {
        q qVar = this.f14113o;
        if (qVar != null) {
            return qVar.b();
        }
        return this.f14111m || this.f14112n;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) ("PointerId(value=" + this.f14100a + ')'));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f14101b);
        sb2.append(", position=");
        sb2.append((Object) I.d.i(this.f14102c));
        sb2.append(", pressed=");
        sb2.append(this.f14103d);
        sb2.append(", pressure=");
        sb2.append(this.f14104e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f14105f);
        sb2.append(", previousPosition=");
        sb2.append((Object) I.d.i(this.f14106g));
        sb2.append(", previousPressed=");
        sb2.append(this.f14107h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i10 = this.f14108i;
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
        sb2.append(", historical=");
        Object obj = this.f14109k;
        if (obj == null) {
            obj = EmptyList.f42983b;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) I.d.i(this.j));
        sb2.append(')');
        return sb2.toString();
    }

    public q(long j, long j10, long j11, boolean z10, float f10, long j12, long j13, boolean z11, int i10, ArrayList arrayList, long j14, long j15) {
        this(j, j10, j11, z10, f10, j12, j13, z11, false, i10, j14);
        this.f14109k = arrayList;
        this.f14110l = j15;
    }
}
