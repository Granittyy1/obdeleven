package androidx.compose.animation.core;

import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InfiniteTransition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<a<?, ?>> f9366a = new androidx.compose.runtime.collection.c<>(new a[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1085f0 f9367b = J0.f(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9368c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f9369d = J0.f(Boolean.TRUE);

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    public final class a<T, V extends AbstractC0913m> implements N0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f9370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f9371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d0<T, V> f9372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C1085f0 f9373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC0906f<T> f9374f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public U<T, V> f9375g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f9376h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f9377i;
        public long j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2, d0 d0Var, E e10) {
            this.f9370b = obj;
            this.f9371c = obj2;
            this.f9372d = d0Var;
            this.f9373e = J0.f(obj);
            this.f9375g = new U<>(e10, d0Var, this.f9370b, this.f9371c, null);
        }

        @Override // androidx.compose.runtime.N0
        public final T getValue() {
            return this.f9373e.getValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c1086gP.C(i11 & 1, (i11 & 3) != 2)) {
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = J0.f(null);
                c1086gP.E(objF);
            }
            androidx.compose.runtime.X x10 = (androidx.compose.runtime.X) objF;
            if (((Boolean) this.f9369d.getValue()).booleanValue() || ((Boolean) this.f9367b.getValue()).booleanValue()) {
                c1086gP.L(1719883733);
                boolean zK = c1086gP.k(this);
                Object objF2 = c1086gP.f();
                if (zK || objF2 == c0153a) {
                    objF2 = new InfiniteTransition$run$1$1(x10, this, null);
                    c1086gP.E(objF2);
                }
                androidx.compose.runtime.E.d((Ia.p) objF2, c1086gP, this);
                c1086gP.T(false);
            } else {
                c1086gP.L(1721270456);
                c1086gP.T(false);
            }
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp2_rcvr.a(interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
