package androidx.compose.foundation.text;

/* JADX INFO: compiled from: KeyboardActions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f11344g = new j(null, null, null, 63);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ia.l<InterfaceC1000i, p293xa.r> f11345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ia.l<InterfaceC1000i, p293xa.r> f11346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.l<InterfaceC1000i, p293xa.r> f11347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<InterfaceC1000i, p293xa.r> f11348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<InterfaceC1000i, p293xa.r> f11349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ia.l<InterfaceC1000i, p293xa.r> f11350f;

    public j() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11345a == jVar.f11345a && this.f11346b == jVar.f11346b && this.f11347c == jVar.f11347c && this.f11348d == jVar.f11348d && this.f11349e == jVar.f11349e && this.f11350f == jVar.f11350f;
    }

    public final int hashCode() {
        Ia.l<InterfaceC1000i, p293xa.r> lVar = this.f11345a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        Ia.l<InterfaceC1000i, p293xa.r> lVar2 = this.f11346b;
        int iHashCode2 = (iHashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        Ia.l<InterfaceC1000i, p293xa.r> lVar3 = this.f11347c;
        int iHashCode3 = (iHashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        Ia.l<InterfaceC1000i, p293xa.r> lVar4 = this.f11348d;
        int iHashCode4 = (iHashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        Ia.l<InterfaceC1000i, p293xa.r> lVar5 = this.f11349e;
        int iHashCode5 = (iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        Ia.l<InterfaceC1000i, p293xa.r> lVar6 = this.f11350f;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    public j(Ia.l lVar, Ia.l lVar2, Ia.l lVar3, int i10) {
        lVar = (i10 & 1) != 0 ? null : lVar;
        lVar2 = (i10 & 4) != 0 ? null : lVar2;
        lVar3 = (i10 & 16) != 0 ? null : lVar3;
        this.f11345a = lVar;
        this.f11346b = null;
        this.f11347c = lVar2;
        this.f11348d = null;
        this.f11349e = lVar3;
        this.f11350f = null;
    }
}
