package androidx.compose.runtime;

/* JADX INFO: renamed from: androidx.compose.runtime.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1099m0<T> extends AbstractC1104p<T> {
    public AbstractC1099m0() {
        throw null;
    }

    public abstract C1101n0<T> b(T t8);

    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 java.lang.Object) = (r5v9 java.lang.Object), (r5v10 java.lang.Object) binds: [B:21:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final S0<T> c(C1101n0<T> c1101n0, S0<T> s10) {
        C1114v c1114v;
        Object obj;
        P0 p10;
        S0<T> p11;
        D d10 = null;
        if (s10 instanceof D) {
            if (c1101n0.f13101d) {
                d10 = (D) s10;
                d10.f12798a.setValue(c1101n0.a());
            }
        } else if (s10 instanceof P0) {
            if ((c1101n0.f13099b || c1101n0.f13102e != null) && !c1101n0.f13101d) {
                p10 = (P0) s10;
                if (kotlin.jvm.internal.i.a(c1101n0.a(), p10.f12885a)) {
                    obj = c1114v;
                    obj = p10;
                    d10 = (S0<T>) obj;
                }
            }
        } else if (s10 instanceof C1114v) {
            c1101n0.getClass();
            c1114v = (C1114v) s10;
            if (c1114v.f13249a == null) {
                obj = c1114v;
                obj = p10;
                d10 = (S0<T>) obj;
            }
        }
        if (d10 != null) {
            return d10;
        }
        if (c1101n0.f13101d) {
            I0 i10 = c1101n0.f13100c;
            if (i10 == null) {
                i10 = Q0.f12888a;
            }
            p11 = new D<>(new C1085f0(c1101n0.f13102e, i10));
        } else {
            p11 = new P0<>(c1101n0.a());
        }
        return p11;
    }
}
