package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* JADX INFO: loaded from: classes3.dex */
public final class O extends f0.e.d.a.b.AbstractC0009b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0010d.AbstractC0011a> f756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0.e.d.a.b.AbstractC0009b f757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f758e;

    public O() {
        throw null;
    }

    public O(String str, String str2, List list, f0.e.d.a.b.AbstractC0009b abstractC0009b, int i10) {
        this.f754a = str;
        this.f755b = str2;
        this.f756c = list;
        this.f757d = abstractC0009b;
        this.f758e = i10;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0009b
    public final f0.e.d.a.b.AbstractC0009b a() {
        return this.f757d;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0009b
    public final List<f0.e.d.a.b.AbstractC0010d.AbstractC0011a> b() {
        return this.f756c;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0009b
    public final int c() {
        return this.f758e;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0009b
    public final String d() {
        return this.f755b;
    }

    @Override // A6.f0.e.d.a.b.AbstractC0009b
    public final String e() {
        return this.f754a;
    }

    public final boolean equals(Object obj) {
        String str;
        f0.e.d.a.b.AbstractC0009b abstractC0009b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0009b)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0009b abstractC0009b2 = (f0.e.d.a.b.AbstractC0009b) obj;
        return this.f754a.equals(abstractC0009b2.e()) && ((str = this.f755b) != null ? str.equals(abstractC0009b2.d()) : abstractC0009b2.d() == null) && this.f756c.equals(abstractC0009b2.b()) && ((abstractC0009b = this.f757d) != null ? abstractC0009b.equals(abstractC0009b2.a()) : abstractC0009b2.a() == null) && this.f758e == abstractC0009b2.c();
    }

    public final int hashCode() {
        int iHashCode = (this.f754a.hashCode() ^ 1000003) * 1000003;
        String str = this.f755b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f756c.hashCode()) * 1000003;
        f0.e.d.a.b.AbstractC0009b abstractC0009b = this.f757d;
        return ((iHashCode2 ^ (abstractC0009b != null ? abstractC0009b.hashCode() : 0)) * 1000003) ^ this.f758e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f754a);
        sb2.append(", reason=");
        sb2.append(this.f755b);
        sb2.append(", frames=");
        sb2.append(this.f756c);
        sb2.append(", causedBy=");
        sb2.append(this.f757d);
        sb2.append(", overflowCount=");
        return p005a4.q.c(sb2, this.f758e, "}");
    }
}
