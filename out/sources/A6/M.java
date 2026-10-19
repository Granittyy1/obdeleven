package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends f0.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0010d> f745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0.a f747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P f748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0008a> f749e;

    public M() {
        throw null;
    }

    public M(List list, O o10, f0.a aVar, P p10, List list2) {
        this.f745a = list;
        this.f746b = o10;
        this.f747c = aVar;
        this.f748d = p10;
        this.f749e = list2;
    }

    @Override // A6.f0.e.d.a.b
    public final f0.a a() {
        return this.f747c;
    }

    @Override // A6.f0.e.d.a.b
    public final List<f0.e.d.a.b.AbstractC0008a> b() {
        return this.f749e;
    }

    @Override // A6.f0.e.d.a.b
    public final f0.e.d.a.b.AbstractC0009b c() {
        return this.f746b;
    }

    @Override // A6.f0.e.d.a.b
    public final f0.e.d.a.b.c d() {
        return this.f748d;
    }

    @Override // A6.f0.e.d.a.b
    public final List<f0.e.d.a.b.AbstractC0010d> e() {
        return this.f745a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b)) {
            return false;
        }
        f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
        List<f0.e.d.a.b.AbstractC0010d> list = this.f745a;
        if (list != null ? list.equals(bVar.e()) : bVar.e() == null) {
            O o10 = this.f746b;
            if (o10 != null ? o10.equals(bVar.c()) : bVar.c() == null) {
                f0.a aVar = this.f747c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f748d.equals(bVar.d()) && this.f749e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List<f0.e.d.a.b.AbstractC0010d> list = this.f745a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        O o10 = this.f746b;
        int iHashCode2 = (iHashCode ^ (o10 == null ? 0 : o10.hashCode())) * 1000003;
        f0.a aVar = this.f747c;
        return (((((aVar != null ? aVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f748d.hashCode()) * 1000003) ^ this.f749e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f745a + ", exception=" + this.f746b + ", appExitInfo=" + this.f747c + ", signal=" + this.f748d + ", binaries=" + this.f749e + "}";
    }
}
