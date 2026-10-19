package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.s;
import androidx.compose.ui.layout.InterfaceC1167m;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.G;
import androidx.compose.ui.text.l;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.m;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: ParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f11462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.compose.ui.text.font.d.a f11463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11467g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC1167m f11469i;
    public AndroidParagraph j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f11472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f11473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LayoutDirection f11474o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11468h = a.f11434a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f11475p = p013b0.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11476q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11477r = -1;

    public f(String str, F f10, androidx.compose.ui.text.font.d.a aVar, int i10, boolean z10, int i11, int i12) {
        this.f11461a = str;
        this.f11462b = f10;
        this.f11463c = aVar;
        this.f11464d = i10;
        this.f11465e = z10;
        this.f11466f = i11;
        this.f11467g = i12;
        long j = 0;
        this.f11471l = (j & 4294967295L) | (j << 32);
    }

    public static long e(f fVar, long j, LayoutDirection layoutDirection) {
        F f10 = fVar.f11462b;
        c cVar = fVar.f11472m;
        InterfaceC1167m interfaceC1167m = fVar.f11469i;
        kotlin.jvm.internal.i.b(interfaceC1167m);
        c cVarA = c.a.a(cVar, layoutDirection, f10, interfaceC1167m, fVar.f11463c);
        fVar.f11472m = cVarA;
        return cVarA.a(fVar.f11467g, j);
    }

    public final int a(int i10, LayoutDirection layoutDirection) {
        int i11 = this.f11476q;
        int i12 = this.f11477r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = p013b0.b.a(0, i10, 0, BrazeLogger.SUPPRESS);
        int i13 = 1;
        if (this.f11467g > 1) {
            jA = e(this, jA, layoutDirection);
        }
        l lVarD = d(layoutDirection);
        long jA2 = b.a(jA, this.f11465e, this.f11464d, lVarD.c());
        boolean z10 = this.f11465e;
        int i14 = this.f11464d;
        int i15 = this.f11466f;
        if ((z10 || (!m.a(i14, 2) && !m.a(i14, 4) && !m.a(i14, 5))) && i15 >= 1) {
            i13 = i15;
        }
        int iA = s.a(new AndroidParagraph((AndroidParagraphIntrinsics) lVarD, i13, this.f11464d, jA2).d());
        int i16 = p013b0.a.i(jA);
        if (iA < i16) {
            iA = i16;
        }
        this.f11476q = i10;
        this.f11477r = iA;
        return iA;
    }

    public final void b() {
        this.j = null;
        this.f11473n = null;
        this.f11474o = null;
        this.f11476q = -1;
        this.f11477r = -1;
        this.f11475p = p013b0.b.h(0, 0, 0, 0);
        long j = 0;
        this.f11471l = (j & 4294967295L) | (j << 32);
        this.f11470k = false;
    }

    public final void c(InterfaceC1167m interfaceC1167m) {
        long jA;
        InterfaceC1167m interfaceC1167m2 = this.f11469i;
        if (interfaceC1167m != null) {
            int i10 = a.f11435b;
            jA = a.a(interfaceC1167m.getDensity(), interfaceC1167m.P0());
        } else {
            jA = a.f11434a;
        }
        if (interfaceC1167m2 == null) {
            this.f11469i = interfaceC1167m;
            this.f11468h = jA;
        } else if (interfaceC1167m == null || this.f11468h != jA) {
            this.f11469i = interfaceC1167m;
            this.f11468h = jA;
            b();
        }
    }

    public final l d(LayoutDirection layoutDirection) {
        l androidParagraphIntrinsics = this.f11473n;
        if (androidParagraphIntrinsics == null || layoutDirection != this.f11474o || androidParagraphIntrinsics.a()) {
            this.f11474o = layoutDirection;
            String str = this.f11461a;
            F fB = G.b(this.f11462b, layoutDirection);
            EmptyList emptyList = EmptyList.f42983b;
            InterfaceC1167m interfaceC1167m = this.f11469i;
            kotlin.jvm.internal.i.b(interfaceC1167m);
            androidParagraphIntrinsics = new AndroidParagraphIntrinsics(str, fB, emptyList, emptyList, this.f11463c, interfaceC1167m);
        }
        this.f11473n = androidParagraphIntrinsics;
        return androidParagraphIntrinsics;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        long j = this.f11468h;
        int i10 = a.f11435b;
        sb2.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb2.append(')');
        return sb2.toString();
    }
}
