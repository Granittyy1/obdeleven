package Z9;

import io.ktor.util.date.Month;
import io.ktor.util.date.WeekDay;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: Date.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeekDay f7965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Month f7968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7969i;
    public final long j;

    static {
        a.a(0L);
    }

    public b(int i10, int i11, int i12, WeekDay dayOfWeek, int i13, int i14, Month month, int i15, long j) {
        i.e(dayOfWeek, "dayOfWeek");
        i.e(month, "month");
        this.f7962b = i10;
        this.f7963c = i11;
        this.f7964d = i12;
        this.f7965e = dayOfWeek;
        this.f7966f = i13;
        this.f7967g = i14;
        this.f7968h = month;
        this.f7969i = i15;
        this.j = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b other = bVar;
        i.e(other, "other");
        return i.h(this.j, other.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7962b == bVar.f7962b && this.f7963c == bVar.f7963c && this.f7964d == bVar.f7964d && this.f7965e == bVar.f7965e && this.f7966f == bVar.f7966f && this.f7967g == bVar.f7967g && this.f7968h == bVar.f7968h && this.f7969i == bVar.f7969i && this.j == bVar.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + q.b(this.f7969i, (this.f7968h.hashCode() + q.b(this.f7967g, q.b(this.f7966f, (this.f7965e.hashCode() + q.b(this.f7964d, q.b(this.f7963c, Integer.hashCode(this.f7962b) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GMTDate(seconds=");
        sb2.append(this.f7962b);
        sb2.append(", minutes=");
        sb2.append(this.f7963c);
        sb2.append(", hours=");
        sb2.append(this.f7964d);
        sb2.append(", dayOfWeek=");
        sb2.append(this.f7965e);
        sb2.append(", dayOfMonth=");
        sb2.append(this.f7966f);
        sb2.append(", dayOfYear=");
        sb2.append(this.f7967g);
        sb2.append(", month=");
        sb2.append(this.f7968h);
        sb2.append(", year=");
        sb2.append(this.f7969i);
        sb2.append(", timestamp=");
        return C4.a.h(sb2, this.j, ')');
    }
}
