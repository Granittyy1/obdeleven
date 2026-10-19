package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.s;
import androidx.compose.ui.text.A;
import androidx.compose.ui.text.B;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.C1268i;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.G;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.style.m;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: MultiParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1260a f11446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.text.font.d.a f11447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<C1260a.c<p>> f11452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f11453h;
    public p013b0.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F f11455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MultiParagraphIntrinsics f11456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LayoutDirection f11457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B f11458n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11454i = a.f11434a;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11459o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11460p = -1;

    public e(C1260a c1260a, F f10, androidx.compose.ui.text.font.d.a aVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f11446a = c1260a;
        this.f11447b = aVar;
        this.f11448c = i10;
        this.f11449d = z10;
        this.f11450e = i11;
        this.f11451f = i12;
        this.f11452g = list;
        this.f11455k = f10;
    }

    public final int a(int i10, LayoutDirection layoutDirection) {
        int i11 = this.f11459o;
        int i12 = this.f11460p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = p013b0.b.a(0, i10, 0, BrazeLogger.SUPPRESS);
        if (this.f11451f > 1) {
            c cVar = this.f11453h;
            F f10 = this.f11455k;
            p013b0.c cVar2 = this.j;
            kotlin.jvm.internal.i.b(cVar2);
            c cVarA = c.a.a(cVar, layoutDirection, f10, cVar2, this.f11447b);
            this.f11453h = cVarA;
            jA = cVarA.a(this.f11451f, jA);
        }
        int iA = s.a(b(jA, layoutDirection).f15474e);
        int i13 = p013b0.a.i(jA);
        if (iA < i13) {
            iA = i13;
        }
        this.f11459o = i10;
        this.f11460p = iA;
        return iA;
    }

    public final C1268i b(long j, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsicsD = d(layoutDirection);
        long jA = b.a(j, this.f11449d, this.f11448c, multiParagraphIntrinsicsD.c());
        boolean z10 = this.f11449d;
        int i10 = this.f11448c;
        int i11 = this.f11450e;
        int i12 = 1;
        if (z10 || (!m.a(i10, 2) && !m.a(i10, 4) && !m.a(i10, 5))) {
            if (i11 < 1) {
                i11 = 1;
            }
            i12 = i11;
        }
        return new C1268i(multiParagraphIntrinsicsD, jA, i12, this.f11448c);
    }

    public final void c(p013b0.c cVar) {
        long jA;
        p013b0.c cVar2 = this.j;
        if (cVar != null) {
            int i10 = a.f11435b;
            jA = a.a(cVar.getDensity(), cVar.P0());
        } else {
            jA = a.f11434a;
        }
        if (cVar2 == null) {
            this.j = cVar;
            this.f11454i = jA;
        } else if (cVar == null || this.f11454i != jA) {
            this.j = cVar;
            this.f11454i = jA;
            this.f11456l = null;
            this.f11458n = null;
            this.f11460p = -1;
            this.f11459o = -1;
        }
    }

    public final MultiParagraphIntrinsics d(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f11456l;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f11457m || multiParagraphIntrinsics.a()) {
            this.f11457m = layoutDirection;
            C1260a c1260a = this.f11446a;
            F fB = G.b(this.f11455k, layoutDirection);
            p013b0.c cVar = this.j;
            kotlin.jvm.internal.i.b(cVar);
            androidx.compose.ui.text.font.d.a aVar = this.f11447b;
            List list = this.f11452g;
            if (list == null) {
                list = EmptyList.f42983b;
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(c1260a, fB, list, cVar, aVar);
        }
        this.f11456l = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    public final B e(LayoutDirection layoutDirection, long j, C1268i c1268i) {
        float fMin = Math.min(c1268i.f15470a.c(), c1268i.f15473d);
        C1260a c1260a = this.f11446a;
        F f10 = this.f11455k;
        List list = this.f11452g;
        if (list == null) {
            list = EmptyList.f42983b;
        }
        int i10 = this.f11450e;
        boolean z10 = this.f11449d;
        int i11 = this.f11448c;
        p013b0.c cVar = this.j;
        kotlin.jvm.internal.i.b(cVar);
        return new B(new A(c1260a, f10, list, i10, z10, i11, cVar, layoutDirection, this.f11447b, j), c1268i, p013b0.b.d(j, (((long) s.a(fMin)) << 32) | (((long) s.a(c1268i.f15474e)) & 4294967295L)));
    }
}
