package androidx.compose.ui.text;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: compiled from: TextLayoutResult.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1260a f15276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f15277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<C1260a.c<p>> f15278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p013b0.c f15282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LayoutDirection f15283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.compose.ui.text.font.d.a f15284i;
    public final long j;

    public A() {
        throw null;
    }

    public A(C1260a c1260a, F f10, List list, int i10, boolean z10, int i11, p013b0.c cVar, LayoutDirection layoutDirection, androidx.compose.ui.text.font.d.a aVar, long j) {
        this.f15276a = c1260a;
        this.f15277b = f10;
        this.f15278c = list;
        this.f15279d = i10;
        this.f15280e = z10;
        this.f15281f = i11;
        this.f15282g = cVar;
        this.f15283h = layoutDirection;
        this.f15284i = aVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return kotlin.jvm.internal.i.a(this.f15276a, a10.f15276a) && kotlin.jvm.internal.i.a(this.f15277b, a10.f15277b) && kotlin.jvm.internal.i.a(this.f15278c, a10.f15278c) && this.f15279d == a10.f15279d && this.f15280e == a10.f15280e && androidx.compose.ui.text.style.m.a(this.f15281f, a10.f15281f) && kotlin.jvm.internal.i.a(this.f15282g, a10.f15282g) && this.f15283h == a10.f15283h && kotlin.jvm.internal.i.a(this.f15284i, a10.f15284i) && p013b0.a.b(this.j, a10.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.f15284i.hashCode() + ((this.f15283h.hashCode() + ((this.f15282g.hashCode() + p005a4.q.b(this.f15281f, androidx.compose.animation.D.b((p005a4.p.d(C4.v.c(this.f15276a.hashCode() * 31, 31, this.f15277b), 31, this.f15278c) + this.f15279d) * 31, 31, this.f15280e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f15276a) + ", style=" + this.f15277b + ", placeholders=" + this.f15278c + ", maxLines=" + this.f15279d + ", softWrap=" + this.f15280e + ", overflow=" + ((Object) androidx.compose.ui.text.style.m.b(this.f15281f)) + ", density=" + this.f15282g + ", layoutDirection=" + this.f15283h + ", fontFamilyResolver=" + this.f15284i + ", constraints=" + ((Object) p013b0.a.l(this.j)) + ')';
    }
}
