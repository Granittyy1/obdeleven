package A6;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* JADX INFO: loaded from: classes3.dex */
public final class L extends f0.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.e.d.a.b f731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<f0.c> f732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f0.c> f733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0.e.d.a.c f735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<f0.e.d.a.c> f736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f737g;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    public static final class a extends f0.e.d.a.AbstractC0007a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f0.e.d.a.b f738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<f0.c> f739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<f0.c> f740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f0.e.d.a.c f742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<f0.e.d.a.c> f743f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f744g;
    }

    public L() {
        throw null;
    }

    public L(f0.e.d.a.b bVar, List list, List list2, Boolean bool, f0.e.d.a.c cVar, List list3, int i10) {
        this.f731a = bVar;
        this.f732b = list;
        this.f733c = list2;
        this.f734d = bool;
        this.f735e = cVar;
        this.f736f = list3;
        this.f737g = i10;
    }

    @Override // A6.f0.e.d.a
    public final List<f0.e.d.a.c> a() {
        return this.f736f;
    }

    @Override // A6.f0.e.d.a
    public final Boolean b() {
        return this.f734d;
    }

    @Override // A6.f0.e.d.a
    public final f0.e.d.a.c c() {
        return this.f735e;
    }

    @Override // A6.f0.e.d.a
    public final List<f0.c> d() {
        return this.f732b;
    }

    @Override // A6.f0.e.d.a
    public final f0.e.d.a.b e() {
        return this.f731a;
    }

    public final boolean equals(Object obj) {
        List<f0.c> list;
        List<f0.c> list2;
        Boolean bool;
        f0.e.d.a.c cVar;
        List<f0.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a)) {
            return false;
        }
        f0.e.d.a aVar = (f0.e.d.a) obj;
        return this.f731a.equals(aVar.e()) && ((list = this.f732b) != null ? list.equals(aVar.d()) : aVar.d() == null) && ((list2 = this.f733c) != null ? list2.equals(aVar.f()) : aVar.f() == null) && ((bool = this.f734d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && ((cVar = this.f735e) != null ? cVar.equals(aVar.c()) : aVar.c() == null) && ((list3 = this.f736f) != null ? list3.equals(aVar.a()) : aVar.a() == null) && this.f737g == aVar.g();
    }

    @Override // A6.f0.e.d.a
    public final List<f0.c> f() {
        return this.f733c;
    }

    @Override // A6.f0.e.d.a
    public final int g() {
        return this.f737g;
    }

    @Override // A6.f0.e.d.a
    public final a h() {
        a aVar = new a();
        aVar.f738a = this.f731a;
        aVar.f739b = this.f732b;
        aVar.f740c = this.f733c;
        aVar.f741d = this.f734d;
        aVar.f742e = this.f735e;
        aVar.f743f = this.f736f;
        aVar.f744g = Integer.valueOf(this.f737g);
        return aVar;
    }

    public final int hashCode() {
        int iHashCode = (this.f731a.hashCode() ^ 1000003) * 1000003;
        List<f0.c> list = this.f732b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.c> list2 = this.f733c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f734d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.e.d.a.c cVar = this.f735e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d.a.c> list3 = this.f736f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f737g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f731a);
        sb2.append(", customAttributes=");
        sb2.append(this.f732b);
        sb2.append(", internalKeys=");
        sb2.append(this.f733c);
        sb2.append(", background=");
        sb2.append(this.f734d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f735e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f736f);
        sb2.append(", uiOrientation=");
        return p005a4.q.c(sb2, this.f737g, "}");
    }
}
