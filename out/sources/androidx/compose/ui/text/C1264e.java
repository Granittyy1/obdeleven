package androidx.compose.ui.text;

/* JADX INFO: renamed from: androidx.compose.ui.text.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1264e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f15423a;

    public C1264e(A a10) {
        this.f15423a = a10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264e)) {
            return false;
        }
        A a10 = this.f15423a;
        C1264e c1264e = (C1264e) obj;
        if (!kotlin.jvm.internal.i.a(a10.f15276a, c1264e.f15423a.f15276a)) {
            return false;
        }
        A a11 = c1264e.f15423a;
        return a10.f15277b.c(a11.f15277b) && kotlin.jvm.internal.i.a(a10.f15278c, a11.f15278c) && a10.f15279d == a11.f15279d && a10.f15280e == a11.f15280e && androidx.compose.ui.text.style.m.a(a10.f15281f, a11.f15281f) && kotlin.jvm.internal.i.a(a10.f15282g, a11.f15282g) && a10.f15283h == a11.f15283h && a10.f15284i == a11.f15284i && p013b0.a.b(a10.j, a11.j);
    }

    public final int hashCode() {
        A a10 = this.f15423a;
        int iHashCode = a10.f15276a.hashCode() * 31;
        F f10 = a10.f15277b;
        v vVar = f10.f15318a;
        vVar.getClass();
        p013b0.o[] oVarArr = p013b0.n.f20492b;
        int iHashCode2 = Long.hashCode(vVar.f15691b) * 31;
        androidx.compose.ui.text.font.l lVar = vVar.f15692c;
        int i10 = (iHashCode2 + (lVar != null ? lVar.f15447b : 0)) * 31;
        androidx.compose.ui.text.font.j jVar = vVar.f15693d;
        int iHashCode3 = (i10 + (jVar != null ? Integer.hashCode(jVar.f15436a) : 0)) * 31;
        androidx.compose.ui.text.font.k kVar = vVar.f15694e;
        int iHashCode4 = (iHashCode3 + (kVar != null ? Integer.hashCode(kVar.f15437a) : 0)) * 31;
        androidx.compose.ui.text.font.d dVar = vVar.f15695f;
        int iHashCode5 = (iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str = vVar.f15696g;
        int iC = C4.b.c(vVar.f15697h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        androidx.compose.ui.text.style.a aVar = vVar.f15698i;
        int iHashCode6 = (iC + (aVar != null ? Float.hashCode(aVar.f15654a) : 0)) * 31;
        androidx.compose.ui.text.style.j jVar2 = vVar.j;
        int iHashCode7 = (iHashCode6 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31;
        Z.c cVar = vVar.f15699k;
        int iHashCode8 = (iHashCode7 + (cVar != null ? cVar.f7672b.hashCode() : 0)) * 31;
        int i11 = androidx.compose.ui.graphics.H.f13505m;
        int iC2 = C4.b.c(vVar.f15700l, iHashCode8, 31);
        s sVar = vVar.f15703o;
        int iHashCode9 = (f10.f15319b.hashCode() + ((iC2 + (sVar != null ? sVar.hashCode() : 0)) * 31)) * 31;
        t tVar = f10.f15320c;
        return Long.hashCode(a10.j) + ((a10.f15284i.hashCode() + ((a10.f15283h.hashCode() + ((a10.f15282g.hashCode() + p005a4.q.b(a10.f15281f, androidx.compose.animation.D.b((p005a4.p.d((iHashCode9 + (tVar != null ? tVar.hashCode() : 0) + iHashCode) * 31, 31, a10.f15278c) + a10.f15279d) * 31, 31, a10.f15280e), 31)) * 31)) * 31)) * 31);
    }
}
