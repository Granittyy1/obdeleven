package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.t0;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.android.gms.internal.measurement.M1;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: AsyncImagePainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter extends Painter implements t0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f22712v = new d(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.internal.f f22713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlowImpl f22714h = B.a(new I.h(0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1085f0 f22715i = J0.f(null);
    public final C1079c0 j = new C1079c0(1.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1085f0 f22716k = J0.f(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f22717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Painter f22718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Ia.l<? super a, ? extends a> f22719n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ia.l<? super a, p293xa.r> f22720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1161g f22721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1085f0 f22724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1085f0 f22725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1085f0 f22726u;

    /* JADX INFO: compiled from: AsyncImagePainter.kt */
    public static abstract class a {

        /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        public static final class C0239a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0239a f22727a = new C0239a();

            @Override // coil.compose.AsyncImagePainter.a
            public final Painter a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0239a);
            }

            public final int hashCode() {
                return -1515560141;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Painter f22728a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final coil.request.e f22729b;

            public b(Painter painter, coil.request.e eVar) {
                this.f22728a = painter;
                this.f22729b = eVar;
            }

            @Override // coil.compose.AsyncImagePainter.a
            public final Painter a() {
                return this.f22728a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.i.a(this.f22728a, bVar.f22728a) && kotlin.jvm.internal.i.a(this.f22729b, bVar.f22729b);
            }

            public final int hashCode() {
                Painter painter = this.f22728a;
                return this.f22729b.hashCode() + ((painter == null ? 0 : painter.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.f22728a + ", result=" + this.f22729b + ')';
            }
        }

        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Painter f22730a;

            public c(Painter painter) {
                this.f22730a = painter;
            }

            @Override // coil.compose.AsyncImagePainter.a
            public final Painter a() {
                return this.f22730a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.i.a(this.f22730a, ((c) obj).f22730a);
            }

            public final int hashCode() {
                Painter painter = this.f22730a;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.f22730a + ')';
            }
        }

        /* JADX INFO: compiled from: AsyncImagePainter.kt */
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Painter f22731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final coil.request.o f22732b;

            public d(Painter painter, coil.request.o oVar) {
                this.f22731a = painter;
                this.f22732b = oVar;
            }

            @Override // coil.compose.AsyncImagePainter.a
            public final Painter a() {
                return this.f22731a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return kotlin.jvm.internal.i.a(this.f22731a, dVar.f22731a) && kotlin.jvm.internal.i.a(this.f22732b, dVar.f22732b);
            }

            public final int hashCode() {
                return this.f22732b.hashCode() + (this.f22731a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.f22731a + ", result=" + this.f22732b + ')';
            }
        }

        public abstract Painter a();
    }

    public AsyncImagePainter(coil.f fVar, coil.request.g gVar) {
        a.C0239a c0239a = a.C0239a.f22727a;
        this.f22717l = c0239a;
        this.f22719n = f22712v;
        this.f22721p = InterfaceC1161g.a.f14244b;
        this.f22722q = 1;
        this.f22724s = J0.f(c0239a);
        this.f22725t = J0.f(gVar);
        this.f22726u = J0.f(fVar);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f10) {
        this.j.f(f10);
        return true;
    }

    @Override // androidx.compose.runtime.t0
    public final void b() {
        kotlinx.coroutines.internal.f fVar = this.f22713g;
        if (fVar != null) {
            kotlinx.coroutines.B.c(fVar, null);
        }
        this.f22713g = null;
        Object obj = this.f22718m;
        t0 t0Var = obj instanceof t0 ? (t0) obj : null;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    @Override // androidx.compose.runtime.t0
    public final void c() {
        kotlinx.coroutines.internal.f fVar = this.f22713g;
        if (fVar != null) {
            kotlinx.coroutines.B.c(fVar, null);
        }
        this.f22713g = null;
        Object obj = this.f22718m;
        t0 t0Var = obj instanceof t0 ? (t0) obj : null;
        if (t0Var != null) {
            t0Var.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.t0
    public final void d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f22713g == null) {
                B0 b0A = M1.a();
                Sa.b bVar = N.f43198a;
                kotlinx.coroutines.internal.f fVarA = kotlinx.coroutines.B.a(kotlin.coroutines.e.a.C0479a.d(b0A, kotlinx.coroutines.internal.q.f43500a.d1()));
                this.f22713g = fVarA;
                Object obj = this.f22718m;
                t0 t0Var = obj instanceof t0 ? (t0) obj : null;
                if (t0Var != null) {
                    t0Var.d();
                }
                if (this.f22723r) {
                    coil.request.g.a aVarA = coil.request.g.a((coil.request.g) this.f22725t.getValue());
                    aVarA.f23073b = ((coil.f) this.f22726u.getValue()).a();
                    aVarA.f23071A = null;
                    coil.request.g gVarA = aVarA.a();
                    Drawable drawableB = coil.util.j.b(gVarA, gVarA.f23041C, gVarA.f23040B, gVarA.f23045G.j);
                    k(new a.c(drawableB != null ? j(drawableB) : null));
                } else {
                    C2680e.c(fVarA, null, null, new AsyncImagePainter$onRemembered$1$1(this, null), 3);
                }
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean e(I i10) {
        this.f22716k.setValue(i10);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long h() {
        Painter painter = (Painter) this.f22715i.getValue();
        if (painter != null) {
            return painter.h();
        }
        return 9205357640488583168L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(J.e eVar) {
        I.h hVar = new I.h(eVar.j());
        StateFlowImpl stateFlowImpl = this.f22714h;
        stateFlowImpl.getClass();
        stateFlowImpl.k(null, hVar);
        Painter painter = (Painter) this.f22715i.getValue();
        if (painter != null) {
            painter.g(eVar, eVar.j(), this.j.j(), (I) this.f22716k.getValue());
        }
    }

    public final Painter j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? C6.b.a(new C1141q(((BitmapDrawable) drawable).getBitmap()), this.f22722q) : new DrawablePainter(drawable.mutate());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public final void k(a aVar) {
        coil.request.h hVar;
        Painter painterA;
        Ia.l<? super a, p293xa.r> lVar;
        Object objA;
        t0 t0Var;
        t0 t0Var2;
        a aVar2 = this.f22717l;
        a aVarInvoke = this.f22719n.invoke(aVar);
        this.f22717l = aVarInvoke;
        this.f22724s.setValue(aVarInvoke);
        if (!(aVarInvoke instanceof a.d)) {
            if (aVarInvoke instanceof a.b) {
                hVar = ((a.b) aVarInvoke).f22729b;
            } else {
                painterA = null;
            }
            if (painterA == null) {
                painterA = aVarInvoke.a();
            }
            this.f22718m = painterA;
            this.f22715i.setValue(painterA);
            if (this.f22713g != null && aVar2.a() != aVarInvoke.a()) {
                objA = aVar2.a();
                if (objA instanceof t0) {
                    t0Var = (t0) objA;
                } else {
                    t0Var = null;
                }
                if (t0Var != null) {
                    t0Var.c();
                }
                Object objA2 = aVarInvoke.a();
                t0Var2 = objA2 instanceof t0 ? (t0) objA2 : null;
                if (t0Var2 != null) {
                    t0Var2.d();
                }
            }
            lVar = this.f22720o;
            if (lVar != null) {
                lVar.invoke(aVarInvoke);
            }
        }
        hVar = ((a.d) aVarInvoke).f22732b;
        p029c3.c cVarA = hVar.b().j.a(f.f22767a, hVar);
        if (cVarA instanceof p029c3.a) {
            p029c3.a aVar3 = (p029c3.a) cVarA;
            painterA = new k(aVar2 instanceof a.c ? aVar2.a() : null, aVarInvoke.a(), this.f22721p, aVar3.f22283c, ((hVar instanceof coil.request.o) && ((coil.request.o) hVar).f23126g) ? false : true, aVar3.f22284d);
        } else {
            painterA = null;
        }
        if (painterA == null) {
            painterA = aVarInvoke.a();
        }
        this.f22718m = painterA;
        this.f22715i.setValue(painterA);
        if (this.f22713g != null) {
            objA = aVar2.a();
            if (objA instanceof t0) {
                t0Var = (t0) objA;
            } else {
                t0Var = null;
            }
            if (t0Var != null) {
                t0Var.c();
            }
            Object objA3 = aVarInvoke.a();
            if (objA3 instanceof t0) {
            }
            if (t0Var2 != null) {
                t0Var2.d();
            }
        }
        lVar = this.f22720o;
        if (lVar != null) {
            lVar.invoke(aVarInvoke);
        }
    }
}
