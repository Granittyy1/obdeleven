package coil.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.animation.D;
import coil.size.Precision;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.N;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: DefaultRequestOptions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2712w f23013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC2712w f23014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2712w f23015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2712w f23016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3.c.a f23017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Precision f23018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f23019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23021i;
    public final Drawable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f23022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f23023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CachePolicy f23024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CachePolicy f23025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CachePolicy f23026o;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (kotlin.jvm.internal.i.a(this.f23013a, bVar.f23013a) && kotlin.jvm.internal.i.a(this.f23014b, bVar.f23014b) && kotlin.jvm.internal.i.a(this.f23015c, bVar.f23015c) && kotlin.jvm.internal.i.a(this.f23016d, bVar.f23016d) && kotlin.jvm.internal.i.a(this.f23017e, bVar.f23017e) && this.f23018f == bVar.f23018f && this.f23019g == bVar.f23019g && this.f23020h == bVar.f23020h && this.f23021i == bVar.f23021i && kotlin.jvm.internal.i.a(this.j, bVar.j) && kotlin.jvm.internal.i.a(this.f23022k, bVar.f23022k) && kotlin.jvm.internal.i.a(this.f23023l, bVar.f23023l) && this.f23024m == bVar.f23024m && this.f23025n == bVar.f23025n && this.f23026o == bVar.f23026o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = D.b(D.b((this.f23019g.hashCode() + ((this.f23018f.hashCode() + ((this.f23017e.hashCode() + ((this.f23016d.hashCode() + ((this.f23015c.hashCode() + ((this.f23014b.hashCode() + (this.f23013a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f23020h), 31, this.f23021i);
        Drawable drawable = this.j;
        int iHashCode = (iB + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f23022k;
        int iHashCode2 = (iHashCode + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f23023l;
        return this.f23026o.hashCode() + ((this.f23025n.hashCode() + ((this.f23024m.hashCode() + ((iHashCode2 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public b(AbstractC2712w abstractC2712w, AbstractC2712w abstractC2712w2, AbstractC2712w abstractC2712w3, AbstractC2712w abstractC2712w4, c3.c.a aVar, Precision precision, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f23013a = abstractC2712w;
        this.f23014b = abstractC2712w2;
        this.f23015c = abstractC2712w3;
        this.f23016d = abstractC2712w4;
        this.f23017e = aVar;
        this.f23018f = precision;
        this.f23019g = config;
        this.f23020h = z10;
        this.f23021i = z11;
        this.j = drawable;
        this.f23022k = drawable2;
        this.f23023l = drawable3;
        this.f23024m = cachePolicy;
        this.f23025n = cachePolicy2;
        this.f23026o = cachePolicy3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(int i10) {
        Sa.b bVar = N.f43198a;
        q0 q0VarD1 = kotlinx.coroutines.internal.q.f43500a.d1();
        Sa.a aVar = N.f43200c;
        c3.b.a aVar2 = c3.c.a.f22289a;
        Precision precision = Precision.f23141d;
        Bitmap.Config config = coil.util.k.f23161b;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        this(q0VarD1, aVar, aVar, aVar, aVar2, precision, config, true, false, null, null, null, cachePolicy, cachePolicy, cachePolicy);
    }
}
