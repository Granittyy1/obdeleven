package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Q extends f0.e.d.a.b.AbstractC0010d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0010d.AbstractC0011a> f764c;

    public Q() {
        throw null;
    }

    public Q(int i10, String str, List list) {
        this.f762a = str;
        this.f763b = i10;
        this.f764c = list;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d
    public final List<f0.e.d.a.b.AbstractC0010d.AbstractC0011a> a() {
        return this.f764c;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d
    public final int b() {
        return this.f763b;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0010d
    public final String c() {
        return this.f762a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0010d)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0010d abstractC0010d = (f0.e.d.a.b.AbstractC0010d) obj;
        return this.f762a.equals(abstractC0010d.c()) && this.f763b == abstractC0010d.b() && this.f764c.equals(abstractC0010d.a());
    }

    public final int hashCode() {
        return ((((this.f762a.hashCode() ^ 1000003) * 1000003) ^ this.f763b) * 1000003) ^ this.f764c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f762a + ", importance=" + this.f763b + ", frames=" + this.f764c + "}";
    }
}
