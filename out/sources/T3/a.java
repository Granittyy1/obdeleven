package T3;

import A3.g;
import D3.h;
import K3.e;
import O3.f;
import T3.a;
import X3.j;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.android.gms.internal.measurement.M1;

/* JADX INFO: compiled from: BaseRequestOptions.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5800b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5804f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5808k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5810m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5815r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5817t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f5801c = h.f2748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Priority f5802d = Priority.f24457b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5805g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5806h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5807i = -1;
    public A3.b j = W3.a.f6999b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5809l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public A3.d f5811n = new A3.d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public X3.b f5812o = new X3.b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Class<?> f5813p = Object.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5816s = true;

    public static boolean g(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public T a(a<?> aVar) {
        if (this.f5815r) {
            return (T) clone().a(aVar);
        }
        int i10 = aVar.f5800b;
        if (g(aVar.f5800b, 1048576)) {
            this.f5817t = aVar.f5817t;
        }
        if (g(aVar.f5800b, 4)) {
            this.f5801c = aVar.f5801c;
        }
        if (g(aVar.f5800b, 8)) {
            this.f5802d = aVar.f5802d;
        }
        if (g(aVar.f5800b, 16)) {
            this.f5803e = 0;
            this.f5800b &= -33;
        }
        if (g(aVar.f5800b, 32)) {
            this.f5803e = aVar.f5803e;
            this.f5800b &= -17;
        }
        if (g(aVar.f5800b, 64)) {
            this.f5804f = 0;
            this.f5800b &= -129;
        }
        if (g(aVar.f5800b, 128)) {
            this.f5804f = aVar.f5804f;
            this.f5800b &= -65;
        }
        if (g(aVar.f5800b, 256)) {
            this.f5805g = aVar.f5805g;
        }
        if (g(aVar.f5800b, 512)) {
            this.f5807i = aVar.f5807i;
            this.f5806h = aVar.f5806h;
        }
        if (g(aVar.f5800b, 1024)) {
            this.j = aVar.j;
        }
        if (g(aVar.f5800b, 4096)) {
            this.f5813p = aVar.f5813p;
        }
        if (g(aVar.f5800b, 8192)) {
            this.f5810m = 0;
            this.f5800b &= -16385;
        }
        if (g(aVar.f5800b, 16384)) {
            this.f5810m = aVar.f5810m;
            this.f5800b &= -8193;
        }
        if (g(aVar.f5800b, 65536)) {
            this.f5809l = aVar.f5809l;
        }
        if (g(aVar.f5800b, 131072)) {
            this.f5808k = aVar.f5808k;
        }
        if (g(aVar.f5800b, 2048)) {
            this.f5812o.putAll(aVar.f5812o);
            this.f5816s = aVar.f5816s;
        }
        if (!this.f5809l) {
            this.f5812o.clear();
            int i11 = this.f5800b;
            this.f5808k = false;
            this.f5800b = i11 & (-133121);
            this.f5816s = true;
        }
        this.f5800b |= aVar.f5800b;
        this.f5811n.f580b.j(aVar.f5811n.f580b);
        m();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t8 = (T) super.clone();
            A3.d dVar = new A3.d();
            t8.f5811n = dVar;
            dVar.f580b.j(this.f5811n.f580b);
            X3.b bVar = new X3.b();
            t8.f5812o = bVar;
            bVar.putAll(this.f5812o);
            t8.f5814q = false;
            t8.f5815r = false;
            return t8;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final T c(Class<?> cls) {
        if (this.f5815r) {
            return (T) clone().c(cls);
        }
        this.f5813p = cls;
        this.f5800b |= 4096;
        m();
        return this;
    }

    public final T d(h hVar) {
        if (this.f5815r) {
            return (T) clone().d(hVar);
        }
        M1.d(hVar, "Argument must not be null");
        this.f5801c = hVar;
        this.f5800b |= 4;
        m();
        return this;
    }

    public final T e(int i10) {
        if (this.f5815r) {
            return (T) clone().e(i10);
        }
        this.f5803e = i10;
        this.f5800b = (this.f5800b | 32) & (-17);
        m();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.f5803e == aVar.f5803e && j.a(null, null) && this.f5804f == aVar.f5804f && j.a(null, null) && this.f5810m == aVar.f5810m && j.a(null, null) && this.f5805g == aVar.f5805g && this.f5806h == aVar.f5806h && this.f5807i == aVar.f5807i && this.f5808k == aVar.f5808k && this.f5809l == aVar.f5809l && this.f5801c.equals(aVar.f5801c) && this.f5802d == aVar.f5802d && this.f5811n.equals(aVar.f5811n) && this.f5812o.equals(aVar.f5812o) && this.f5813p.equals(aVar.f5813p) && j.a(this.j, aVar.j) && j.a(null, null);
    }

    public final T f(int i10) {
        if (this.f5815r) {
            return (T) clone().f(i10);
        }
        this.f5810m = i10;
        this.f5800b = (this.f5800b | 16384) & (-8193);
        m();
        return this;
    }

    public final a h(DownsampleStrategy downsampleStrategy, e eVar) {
        if (this.f5815r) {
            return clone().h(downsampleStrategy, eVar);
        }
        A3.c cVar = DownsampleStrategy.f24665f;
        M1.d(downsampleStrategy, "Argument must not be null");
        n(cVar, downsampleStrategy);
        return q(eVar, false);
    }

    public final int hashCode() {
        char[] cArr = j.f7214a;
        return j.f(j.f(j.f(j.f(j.f(j.f(j.f(j.e(0, j.e(0, j.e(this.f5809l ? 1 : 0, j.e(this.f5808k ? 1 : 0, j.e(this.f5807i, j.e(this.f5806h, j.e(this.f5805g ? 1 : 0, j.f(j.e(this.f5810m, j.f(j.e(this.f5804f, j.f(j.e(this.f5803e, j.e(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f5801c), this.f5802d), this.f5811n), this.f5812o), this.f5813p), this.j), null);
    }

    public final T i(int i10, int i11) {
        if (this.f5815r) {
            return (T) clone().i(i10, i11);
        }
        this.f5807i = i10;
        this.f5806h = i11;
        this.f5800b |= 512;
        m();
        return this;
    }

    public final T j(int i10) {
        if (this.f5815r) {
            return (T) clone().j(i10);
        }
        this.f5804f = i10;
        this.f5800b = (this.f5800b | 128) & (-65);
        m();
        return this;
    }

    public final a l() {
        Priority priority = Priority.f24458c;
        if (this.f5815r) {
            return clone().l();
        }
        this.f5802d = priority;
        this.f5800b |= 8;
        m();
        return this;
    }

    public final void m() {
        if (this.f5814q) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final <Y> T n(A3.c<Y> cVar, Y y10) {
        if (this.f5815r) {
            return (T) clone().n(cVar, y10);
        }
        M1.c(cVar);
        M1.c(y10);
        this.f5811n.f580b.put(cVar, y10);
        m();
        return this;
    }

    public final a o(W3.b bVar) {
        if (this.f5815r) {
            return clone().o(bVar);
        }
        this.j = bVar;
        this.f5800b |= 1024;
        m();
        return this;
    }

    public final a p() {
        if (this.f5815r) {
            return clone().p();
        }
        this.f5805g = false;
        this.f5800b |= 256;
        m();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T q(g<Bitmap> gVar, boolean z10) {
        if (this.f5815r) {
            return (T) clone().q(gVar, z10);
        }
        K3.j jVar = new K3.j(gVar, z10);
        r(Bitmap.class, gVar, z10);
        r(Drawable.class, jVar, z10);
        r(BitmapDrawable.class, jVar, z10);
        r(O3.c.class, new f(gVar), z10);
        m();
        return this;
    }

    public final <Y> T r(Class<Y> cls, g<Y> gVar, boolean z10) {
        if (this.f5815r) {
            return (T) clone().r(cls, gVar, z10);
        }
        M1.c(gVar);
        this.f5812o.put(cls, gVar);
        int i10 = this.f5800b;
        this.f5809l = true;
        this.f5800b = 67584 | i10;
        this.f5816s = false;
        if (z10) {
            this.f5800b = i10 | 198656;
            this.f5808k = true;
        }
        m();
        return this;
    }

    public final a s() {
        if (this.f5815r) {
            return clone().s();
        }
        this.f5817t = true;
        this.f5800b |= 1048576;
        m();
        return this;
    }
}
