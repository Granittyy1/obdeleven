package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import androidx.compose.animation.D;
import coil.size.Scale;
import java.util.Arrays;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f23099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorSpace f23100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z2.e f23101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Scale f23102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23106i;
    public final okhttp3.o j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f23107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f23108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CachePolicy f23109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CachePolicy f23110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CachePolicy f23111o;

    public k(Context context, Bitmap.Config config, ColorSpace colorSpace, Z2.e eVar, Scale scale, boolean z10, boolean z11, boolean z12, String str, okhttp3.o oVar, p pVar, l lVar, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f23098a = context;
        this.f23099b = config;
        this.f23100c = colorSpace;
        this.f23101d = eVar;
        this.f23102e = scale;
        this.f23103f = z10;
        this.f23104g = z11;
        this.f23105h = z12;
        this.f23106i = str;
        this.j = oVar;
        this.f23107k = pVar;
        this.f23108l = lVar;
        this.f23109m = cachePolicy;
        this.f23110n = cachePolicy2;
        this.f23111o = cachePolicy3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kotlin.jvm.internal.i.a(this.f23098a, kVar.f23098a) && this.f23099b == kVar.f23099b && kotlin.jvm.internal.i.a(this.f23100c, kVar.f23100c) && kotlin.jvm.internal.i.a(this.f23101d, kVar.f23101d) && this.f23102e == kVar.f23102e && this.f23103f == kVar.f23103f && this.f23104g == kVar.f23104g && this.f23105h == kVar.f23105h && kotlin.jvm.internal.i.a(this.f23106i, kVar.f23106i) && kotlin.jvm.internal.i.a(this.j, kVar.j) && kotlin.jvm.internal.i.a(this.f23107k, kVar.f23107k) && kotlin.jvm.internal.i.a(this.f23108l, kVar.f23108l) && this.f23109m == kVar.f23109m && this.f23110n == kVar.f23110n && this.f23111o == kVar.f23111o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23099b.hashCode() + (this.f23098a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f23100c;
        int iB = D.b(D.b(D.b((this.f23102e.hashCode() + ((this.f23101d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f23103f), 31, this.f23104g), 31, this.f23105h);
        String str = this.f23106i;
        return this.f23111o.hashCode() + ((this.f23110n.hashCode() + ((this.f23109m.hashCode() + ((this.f23108l.f23113b.hashCode() + ((this.f23107k.f23128a.hashCode() + ((((iB + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.j.f45568b)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
