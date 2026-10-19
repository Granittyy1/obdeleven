package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.F;
import androidx.compose.ui.text.G;
import androidx.compose.ui.text.m;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: MinLinesConstrainer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static c f11436h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutDirection f11437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f11438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p013b0.d f11439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d.a f11440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f11441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11442f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11443g = Float.NaN;

    /* JADX INFO: compiled from: MinLinesConstrainer.kt */
    public static final class a {
        public static c a(c cVar, LayoutDirection layoutDirection, F f10, p013b0.c cVar2, androidx.compose.ui.text.font.d.a aVar) {
            if (cVar != null && layoutDirection == cVar.f11437a && G.b(f10, layoutDirection).equals(cVar.f11438b) && cVar2.getDensity() == cVar.f11439c.f20476b && aVar == cVar.f11440d) {
                return cVar;
            }
            c cVar3 = c.f11436h;
            if (cVar3 != null && layoutDirection == cVar3.f11437a && G.b(f10, layoutDirection).equals(cVar3.f11438b) && cVar2.getDensity() == cVar3.f11439c.f20476b && aVar == cVar3.f11440d) {
                return cVar3;
            }
            c cVar4 = new c(layoutDirection, G.b(f10, layoutDirection), new p013b0.d(cVar2.getDensity(), cVar2.P0()), aVar);
            c.f11436h = cVar4;
            return cVar4;
        }
    }

    public c(LayoutDirection layoutDirection, F f10, p013b0.d dVar, androidx.compose.ui.text.font.d.a aVar) {
        this.f11437a = layoutDirection;
        this.f11438b = f10;
        this.f11439c = dVar;
        this.f11440d = aVar;
        this.f11441e = G.b(f10, layoutDirection);
    }

    public final long a(int i10, long j) {
        int i11;
        float f10 = this.f11443g;
        float fD = this.f11442f;
        if (Float.isNaN(f10) || Float.isNaN(fD)) {
            String str = d.f11444a;
            long jB = p013b0.b.b(0, 0, 15);
            p013b0.d dVar = this.f11439c;
            float fD2 = m.a(str, this.f11441e, jB, dVar, this.f11440d, null, 1, 96).d();
            fD = m.a(d.f11445b, this.f11441e, p013b0.b.b(0, 0, 15), dVar, this.f11440d, null, 2, 96).d() - fD2;
            this.f11443g = fD2;
            this.f11442f = fD;
            f10 = fD2;
        }
        if (i10 != 1) {
            int iRound = Math.round((fD * (i10 - 1)) + f10);
            i11 = iRound >= 0 ? iRound : 0;
            int iG = p013b0.a.g(j);
            if (i11 > iG) {
                i11 = iG;
            }
        } else {
            i11 = p013b0.a.i(j);
        }
        return p013b0.b.a(p013b0.a.j(j), p013b0.a.h(j), i11, p013b0.a.g(j));
    }
}
