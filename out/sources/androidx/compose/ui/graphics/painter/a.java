package androidx.compose.ui.graphics.painter;

import A8.A;
import C4.b;
import J.e;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.P;
import androidx.compose.ui.graphics.W;
import kotlin.jvm.internal.i;
import p013b0.j;
import p013b0.l;

/* JADX INFO: compiled from: BitmapPainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W f13784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13786i;
    public int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public I f13789m;

    public a(W w3, long j, long j10) {
        int i10;
        int i11;
        this.f13784g = w3;
        this.f13785h = j;
        this.f13786i = j10;
        if (((int) (j >> 32)) < 0 || ((int) (j & 4294967295L)) < 0 || (i10 = (int) (j10 >> 32)) < 0 || (i11 = (int) (j10 & 4294967295L)) < 0 || i10 > w3.getWidth() || i11 > w3.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f13787k = j10;
        this.f13788l = 1.0f;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f10) {
        this.f13788l = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean e(I i10) {
        this.f13789m = i10;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f13784g, aVar.f13784g) && j.b(this.f13785h, aVar.f13785h) && l.b(this.f13786i, aVar.f13786i) && P.a(this.j, aVar.j);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long h() {
        return A.k(this.f13787k);
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + b.c(this.f13786i, b.c(this.f13785h, this.f13784g.hashCode() * 31, 31), 31);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(e eVar) {
        e.t1(eVar, this.f13784g, this.f13785h, this.f13786i, 0L, (((long) Math.round(Float.intBitsToFloat((int) (eVar.j() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (eVar.j() & 4294967295L)))) & 4294967295L), this.f13788l, null, this.f13789m, 0, this.j, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f13784g);
        sb2.append(", srcOffset=");
        sb2.append((Object) j.e(this.f13785h));
        sb2.append(", srcSize=");
        sb2.append((Object) l.c(this.f13786i));
        sb2.append(", filterQuality=");
        int i10 = this.j;
        if (P.a(i10, 0)) {
            str = "None";
        } else if (P.a(i10, 1)) {
            str = "Low";
        } else if (P.a(i10, 2)) {
            str = "Medium";
        } else {
            str = P.a(i10, 3) ? "High" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
