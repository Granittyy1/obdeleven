package androidx.compose.material3.internal;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12545e;

    public j(int i10, int i11, int i12, long j) {
        this.f12542b = i10;
        this.f12543c = i11;
        this.f12544d = i12;
        this.f12545e = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        return kotlin.jvm.internal.i.h(this.f12545e, jVar.f12545e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12542b == jVar.f12542b && this.f12543c == jVar.f12543c && this.f12544d == jVar.f12544d && this.f12545e == jVar.f12545e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12545e) + p005a4.q.b(this.f12544d, p005a4.q.b(this.f12543c, Integer.hashCode(this.f12542b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalendarDate(year=");
        sb2.append(this.f12542b);
        sb2.append(", month=");
        sb2.append(this.f12543c);
        sb2.append(", dayOfMonth=");
        sb2.append(this.f12544d);
        sb2.append(", utcTimeMillis=");
        return C4.a.h(sb2, this.f12545e, ')');
    }
}
