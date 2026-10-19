package androidx.compose.material3.internal;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12554e;

    public n(int i10, int i11, int i12, int i13, long j) {
        this.f12550a = i10;
        this.f12551b = i11;
        this.f12552c = i12;
        this.f12553d = i13;
        this.f12554e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f12550a == nVar.f12550a && this.f12551b == nVar.f12551b && this.f12552c == nVar.f12552c && this.f12553d == nVar.f12553d && this.f12554e == nVar.f12554e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12554e) + p005a4.q.b(this.f12553d, p005a4.q.b(this.f12552c, p005a4.q.b(this.f12551b, Integer.hashCode(this.f12550a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarMonth(year=");
        sb2.append(this.f12550a);
        sb2.append(", month=");
        sb2.append(this.f12551b);
        sb2.append(", numberOfDays=");
        sb2.append(this.f12552c);
        sb2.append(", daysFromStartOfWeekToFirstOfMonth=");
        sb2.append(this.f12553d);
        sb2.append(", startUtcTimeMillis=");
        return C4.a.h(sb2, this.f12554e, ')');
    }
}
