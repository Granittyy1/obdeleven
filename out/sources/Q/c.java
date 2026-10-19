package Q;

import A1.C0575j;

/* JADX INFO: compiled from: RotaryScrollEvent.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4984d;

    public c(float f10, float f11, int i10, long j) {
        this.f4981a = f10;
        this.f4982b = f11;
        this.f4983c = j;
        this.f4984d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f4981a == this.f4981a && cVar.f4982b == this.f4982b && cVar.f4983c == this.f4983c && cVar.f4984d == this.f4984d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4984d) + C4.b.c(this.f4983c, O.a.d(this.f4982b, Float.hashCode(this.f4981a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f4981a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f4982b);
        sb2.append(",uptimeMillis=");
        sb2.append(this.f4983c);
        sb2.append(",deviceId=");
        return C0575j.b(sb2, this.f4984d, ')');
    }
}
