package coil.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.animation.D;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import coil.size.Precision;
import coil.size.Scale;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlinx.coroutines.AbstractC2712w;

/* JADX INFO: compiled from: ImageRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f23039A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Integer f23040B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Drawable f23041C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Integer f23042D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Drawable f23043E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final c f23044F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final coil.request.b f23045G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p004a3.b f23048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f23049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X2.b.a f23050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f23052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Precision f23053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<p016b3.d> f23054i;
    public final c3.c.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final okhttp3.o f23055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f23056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f23057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f23058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f23059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f23060p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CachePolicy f23061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CachePolicy f23062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CachePolicy f23063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC2712w f23064t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AbstractC2712w f23065u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AbstractC2712w f23066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC2712w f23067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Lifecycle f23068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Z2.f f23069y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Scale f23070z;

    public g() {
        throw null;
    }

    public g(Context context, Object obj, p004a3.b bVar, b bVar2, X2.b.a aVar, String str, Bitmap.Config config, Precision precision, List list, c3.c.a aVar2, okhttp3.o oVar, p pVar, boolean z10, boolean z11, boolean z12, boolean z13, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, AbstractC2712w abstractC2712w, AbstractC2712w abstractC2712w2, AbstractC2712w abstractC2712w3, AbstractC2712w abstractC2712w4, Lifecycle lifecycle, Z2.f fVar, Scale scale, l lVar, Integer num, Drawable drawable, Integer num2, Drawable drawable2, c cVar, coil.request.b bVar3) {
        this.f23046a = context;
        this.f23047b = obj;
        this.f23048c = bVar;
        this.f23049d = bVar2;
        this.f23050e = aVar;
        this.f23051f = str;
        this.f23052g = config;
        this.f23053h = precision;
        this.f23054i = list;
        this.j = aVar2;
        this.f23055k = oVar;
        this.f23056l = pVar;
        this.f23057m = z10;
        this.f23058n = z11;
        this.f23059o = z12;
        this.f23060p = z13;
        this.f23061q = cachePolicy;
        this.f23062r = cachePolicy2;
        this.f23063s = cachePolicy3;
        this.f23064t = abstractC2712w;
        this.f23065u = abstractC2712w2;
        this.f23066v = abstractC2712w3;
        this.f23067w = abstractC2712w4;
        this.f23068x = lifecycle;
        this.f23069y = fVar;
        this.f23070z = scale;
        this.f23039A = lVar;
        this.f23040B = num;
        this.f23041C = drawable;
        this.f23042D = num2;
        this.f23043E = drawable2;
        this.f23044F = cVar;
        this.f23045G = bVar3;
    }

    public static a a(g gVar) {
        Context context = gVar.f23046a;
        gVar.getClass();
        return new a(context, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (kotlin.jvm.internal.i.a(this.f23046a, gVar.f23046a) && kotlin.jvm.internal.i.a(this.f23047b, gVar.f23047b) && kotlin.jvm.internal.i.a(this.f23048c, gVar.f23048c) && kotlin.jvm.internal.i.a(this.f23049d, gVar.f23049d) && kotlin.jvm.internal.i.a(this.f23050e, gVar.f23050e) && kotlin.jvm.internal.i.a(this.f23051f, gVar.f23051f) && this.f23052g == gVar.f23052g && kotlin.jvm.internal.i.a(null, null) && this.f23053h == gVar.f23053h && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f23054i, gVar.f23054i) && kotlin.jvm.internal.i.a(this.j, gVar.j) && kotlin.jvm.internal.i.a(this.f23055k, gVar.f23055k) && kotlin.jvm.internal.i.a(this.f23056l, gVar.f23056l) && this.f23057m == gVar.f23057m && this.f23058n == gVar.f23058n && this.f23059o == gVar.f23059o && this.f23060p == gVar.f23060p && this.f23061q == gVar.f23061q && this.f23062r == gVar.f23062r && this.f23063s == gVar.f23063s && kotlin.jvm.internal.i.a(this.f23064t, gVar.f23064t) && kotlin.jvm.internal.i.a(this.f23065u, gVar.f23065u) && kotlin.jvm.internal.i.a(this.f23066v, gVar.f23066v) && kotlin.jvm.internal.i.a(this.f23067w, gVar.f23067w) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f23040B, gVar.f23040B) && kotlin.jvm.internal.i.a(this.f23041C, gVar.f23041C) && kotlin.jvm.internal.i.a(this.f23042D, gVar.f23042D) && kotlin.jvm.internal.i.a(this.f23043E, gVar.f23043E) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(null, null) && kotlin.jvm.internal.i.a(this.f23068x, gVar.f23068x) && kotlin.jvm.internal.i.a(this.f23069y, gVar.f23069y) && this.f23070z == gVar.f23070z && kotlin.jvm.internal.i.a(this.f23039A, gVar.f23039A) && kotlin.jvm.internal.i.a(this.f23044F, gVar.f23044F) && kotlin.jvm.internal.i.a(this.f23045G, gVar.f23045G)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23047b.hashCode() + (this.f23046a.hashCode() * 31)) * 31;
        p004a3.b bVar = this.f23048c;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.f23049d;
        int iHashCode3 = (iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        X2.b.a aVar = this.f23050e;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f23051f;
        int iHashCode5 = (this.f23039A.f23113b.hashCode() + ((this.f23070z.hashCode() + ((this.f23069y.hashCode() + ((this.f23068x.hashCode() + ((this.f23067w.hashCode() + ((this.f23066v.hashCode() + ((this.f23065u.hashCode() + ((this.f23064t.hashCode() + ((this.f23063s.hashCode() + ((this.f23062r.hashCode() + ((this.f23061q.hashCode() + D.b(D.b(D.b(D.b((this.f23056l.f23128a.hashCode() + ((((this.j.hashCode() + p005a4.p.d((this.f23053h.hashCode() + ((this.f23052g.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791, 31, this.f23054i)) * 31) + Arrays.hashCode(this.f23055k.f45568b)) * 31)) * 31, 31, this.f23057m), 31, this.f23058n), 31, this.f23059o), 31, this.f23060p)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        Integer num = this.f23040B;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f23041C;
        int iHashCode7 = (iHashCode6 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f23042D;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f23043E;
        return this.f23045G.hashCode() + ((this.f23044F.hashCode() + ((iHashCode8 + (drawable2 != null ? drawable2.hashCode() : 0)) * 29791)) * 31);
    }

    /* JADX INFO: compiled from: ImageRequest.kt */
    public interface b {
        default void onCancel(g gVar) {
        }

        default void onStart(g gVar) {
        }

        default void onError(g gVar, e eVar) {
        }

        default void onSuccess(g gVar, o oVar) {
        }
    }

    /* JADX INFO: compiled from: ImageRequest.kt */
    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public Scale f23071A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f23072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public coil.request.b f23073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f23074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p004a3.b f23075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f23076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public X2.b.a f23077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f23078g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Precision f23079h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<? extends p016b3.d> f23080i;
        public c3.c.a j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final okhttp3.o.a f23081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final LinkedHashMap f23082l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f23083m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f23084n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Sa.a f23085o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Sa.a f23086p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Sa.a f23087q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public l.a f23088r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Integer f23089s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Drawable f23090t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Integer f23091u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Drawable f23092v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Z2.f f23093w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Scale f23094x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Lifecycle f23095y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Z2.f f23096z;

        public a(Context context) {
            this.f23072a = context;
            this.f23073b = coil.util.j.f23159a;
            this.f23074c = null;
            this.f23075d = null;
            this.f23076e = null;
            this.f23077f = null;
            this.f23078g = null;
            this.f23079h = null;
            this.f23080i = EmptyList.f42983b;
            this.j = null;
            this.f23081k = null;
            this.f23082l = null;
            this.f23083m = true;
            this.f23084n = true;
            this.f23085o = null;
            this.f23086p = null;
            this.f23087q = null;
            this.f23088r = null;
            this.f23089s = null;
            this.f23090t = null;
            this.f23091u = null;
            this.f23092v = null;
            this.f23093w = null;
            this.f23094x = null;
            this.f23095y = null;
            this.f23096z = null;
            this.f23071A = null;
        }

        public final g a() {
            boolean z10;
            Z2.f fVar;
            View viewA;
            Z2.f bVar;
            ImageView.ScaleType scaleType;
            Object obj = this.f23074c;
            if (obj == null) {
                obj = i.f23097a;
            }
            Object obj2 = obj;
            p004a3.b bVar2 = this.f23075d;
            b bVar3 = this.f23076e;
            X2.b.a aVar = this.f23077f;
            String str = this.f23078g;
            coil.request.b bVar4 = this.f23073b;
            Bitmap.Config config = bVar4.f23019g;
            Precision precision = this.f23079h;
            if (precision == null) {
                precision = bVar4.f23018f;
            }
            Precision precision2 = precision;
            List<? extends p016b3.d> list = this.f23080i;
            c3.c.a aVar2 = this.j;
            c3.c.a aVar3 = aVar2 == null ? bVar4.f23017e : aVar2;
            okhttp3.o.a aVar4 = this.f23081k;
            okhttp3.o oVarE = aVar4 != null ? aVar4.e() : null;
            if (oVarE == null) {
                oVarE = coil.util.k.f23162c;
            } else {
                Bitmap.Config[] configArr = coil.util.k.f23160a;
            }
            okhttp3.o oVar = oVarE;
            LinkedHashMap linkedHashMap = this.f23082l;
            p pVar = linkedHashMap != null ? new p(coil.util.b.b(linkedHashMap)) : null;
            p pVar2 = pVar == null ? p.f23127b : pVar;
            coil.request.b bVar5 = this.f23073b;
            boolean z11 = bVar5.f23020h;
            boolean z12 = bVar5.f23021i;
            p pVar3 = pVar2;
            CachePolicy cachePolicy = bVar5.f23024m;
            CachePolicy cachePolicy2 = bVar5.f23025n;
            CachePolicy cachePolicy3 = bVar5.f23026o;
            AbstractC2712w abstractC2712w = bVar5.f23013a;
            AbstractC2712w abstractC2712w2 = this.f23085o;
            if (abstractC2712w2 == null) {
                abstractC2712w2 = bVar5.f23014b;
            }
            AbstractC2712w abstractC2712w3 = abstractC2712w2;
            AbstractC2712w abstractC2712w4 = this.f23086p;
            if (abstractC2712w4 == null) {
                abstractC2712w4 = bVar5.f23015c;
            }
            AbstractC2712w abstractC2712w5 = abstractC2712w4;
            Sa.a aVar5 = this.f23087q;
            AbstractC2712w abstractC2712w6 = aVar5 == null ? bVar5.f23016d : aVar5;
            Lifecycle lifecycle = this.f23095y;
            Context context = this.f23072a;
            if (lifecycle == null) {
                p004a3.b bVar6 = this.f23075d;
                z10 = z11;
                Object context2 = bVar6 instanceof p004a3.c ? ((p004a3.c) bVar6).a().getContext() : context;
                while (true) {
                    if (context2 instanceof InterfaceC1376t) {
                        lifecycle = ((InterfaceC1376t) context2).getLifecycle();
                        break;
                    }
                    if (!(context2 instanceof ContextWrapper)) {
                        lifecycle = null;
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (lifecycle == null) {
                    lifecycle = f.f23037b;
                }
            } else {
                z10 = z11;
            }
            Lifecycle lifecycle2 = lifecycle;
            Z2.f fVar2 = this.f23093w;
            if (fVar2 == null && (fVar2 = this.f23096z) == null) {
                p004a3.b bVar7 = this.f23075d;
                if (bVar7 instanceof p004a3.c) {
                    View viewA2 = ((p004a3.c) bVar7).a();
                    bVar = ((viewA2 instanceof ImageView) && ((scaleType = ((ImageView) viewA2).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? new Z2.c(Z2.e.f7731c) : new Z2.d(viewA2, true);
                } else {
                    bVar = new Z2.b(context);
                }
                fVar = bVar;
            } else {
                fVar = fVar2;
            }
            Scale scale = this.f23094x;
            if (scale == null && (scale = this.f23071A) == null) {
                Z2.f fVar3 = this.f23093w;
                Z2.i iVar = fVar3 instanceof Z2.i ? (Z2.i) fVar3 : null;
                if (iVar == null || (viewA = iVar.a()) == null) {
                    p004a3.b bVar8 = this.f23075d;
                    p004a3.c cVar = bVar8 instanceof p004a3.c ? (p004a3.c) bVar8 : null;
                    viewA = cVar != null ? cVar.a() : null;
                }
                if (viewA instanceof ImageView) {
                    Bitmap.Config[] configArr2 = coil.util.k.f23160a;
                    ImageView.ScaleType scaleType2 = ((ImageView) viewA).getScaleType();
                    int i10 = scaleType2 == null ? -1 : coil.util.k.a.f23163a[scaleType2.ordinal()];
                    scale = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? Scale.f23144c : Scale.f23143b;
                } else {
                    scale = Scale.f23144c;
                }
            }
            Scale scale2 = scale;
            l.a aVar6 = this.f23088r;
            l lVar = aVar6 != null ? new l(coil.util.b.b(aVar6.f23114a)) : null;
            return new g(this.f23072a, obj2, bVar2, bVar3, aVar, str, config, precision2, list, aVar3, oVar, pVar3, this.f23083m, z10, z12, this.f23084n, cachePolicy, cachePolicy2, cachePolicy3, abstractC2712w, abstractC2712w3, abstractC2712w5, abstractC2712w6, lifecycle2, fVar, scale2, lVar == null ? l.f23112c : lVar, this.f23089s, this.f23090t, this.f23091u, this.f23092v, new c(this.f23093w, this.f23094x, this.f23085o, this.f23086p, this.f23087q, this.j, this.f23079h), this.f23073b);
        }

        public final void b() {
            this.j = new p029c3.a.C0235a(100, 2);
        }

        public final void c(int i10) {
            this.f23091u = Integer.valueOf(i10);
            this.f23092v = null;
        }

        public final void d() {
            this.f23095y = null;
            this.f23096z = null;
            this.f23071A = null;
        }

        public final void e(int i10, int i11) {
            this.f23093w = new Z2.c(new Z2.e(new Z2.a.C0110a(i10), new Z2.a.C0110a(i11)));
            d();
        }

        public final void f(ImageView imageView) {
            this.f23075d = new p004a3.a(imageView);
            d();
        }

        public a(Context context, g gVar) {
            this.f23072a = context;
            this.f23073b = gVar.f23045G;
            this.f23074c = gVar.f23047b;
            this.f23075d = gVar.f23048c;
            this.f23076e = gVar.f23049d;
            this.f23077f = gVar.f23050e;
            this.f23078g = gVar.f23051f;
            c cVar = gVar.f23044F;
            cVar.getClass();
            this.f23079h = cVar.f23033g;
            this.f23080i = gVar.f23054i;
            this.j = cVar.f23032f;
            this.f23081k = gVar.f23055k.q();
            this.f23082l = y.y(gVar.f23056l.f23128a);
            this.f23083m = gVar.f23057m;
            this.f23084n = gVar.f23060p;
            this.f23085o = cVar.f23029c;
            this.f23086p = cVar.f23030d;
            this.f23087q = cVar.f23031e;
            l lVar = gVar.f23039A;
            lVar.getClass();
            this.f23088r = new l.a(lVar);
            this.f23089s = gVar.f23040B;
            this.f23090t = gVar.f23041C;
            this.f23091u = gVar.f23042D;
            this.f23092v = gVar.f23043E;
            this.f23093w = cVar.f23027a;
            this.f23094x = cVar.f23028b;
            if (gVar.f23046a == context) {
                this.f23095y = gVar.f23068x;
                this.f23096z = gVar.f23069y;
                this.f23071A = gVar.f23070z;
            } else {
                this.f23095y = null;
                this.f23096z = null;
                this.f23071A = null;
            }
        }
    }
}
