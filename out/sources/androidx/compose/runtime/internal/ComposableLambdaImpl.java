package androidx.compose.runtime.internal;

import Ia.k;
import Ia.m;
import Ia.n;
import Ia.p;
import Ia.q;
import Ia.r;
import Ia.s;
import Ia.t;
import Ia.u;
import Ia.v;
import Ia.w;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1103o0;
import java.util.ArrayList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableLambdaImpl implements p, q, r, s, t, u, v, w, Ia.b, Ia.c, Ia.e, Ia.f, Ia.g, Ia.h, Ia.i, Ia.j, k, m, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1103o0 f13049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f13050f;

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposableLambda.kt */
    public /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements p<InterfaceC1084f, Integer, p293xa.r> {
        @Override // Ia.p
        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            int iIntValue = num.intValue();
            ((ComposableLambdaImpl) this.receiver).c(interfaceC1084f, iIntValue);
            return p293xa.r.f47939a;
        }
    }

    public ComposableLambdaImpl(boolean z10, int i10, Object obj) {
        this.f13046b = i10;
        this.f13047c = z10;
        this.f13048d = obj;
    }

    public final Object a(final int i10, InterfaceC1084f interfaceC1084f, final Object obj) {
        C1086g c1086gP = interfaceC1084f.p(this.f13046b);
        h(c1086gP);
        int iA = c1086gP.K(this) ? a.a(2, 1) : a.a(1, 1);
        Object obj2 = this.f13048d;
        kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        o.d(3, obj2);
        Object objInvoke = ((q) obj2).invoke(obj, c1086gP, Integer.valueOf(iA | i10));
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
                    Object obj3 = obj;
                    composableLambdaImpl.a(L4.b.l(i10) | 1, interfaceC1084f2, obj3);
                    return p293xa.r.f47939a;
                }
            };
        }
        return objInvoke;
    }

    public final Object c(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(this.f13046b);
        h(c1086gP);
        int iA = i10 | (c1086gP.K(this) ? a.a(2, 0) : a.a(1, 0));
        Object obj = this.f13048d;
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        o.d(2, obj);
        Object objInvoke = ((p) obj).invoke(c1086gP, Integer.valueOf(iA));
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new AnonymousClass1(2, this, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    public final Object d(final Object obj, final Object obj2, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(this.f13046b);
        h(c1086gP);
        int iA = c1086gP.K(this) ? a.a(2, 2) : a.a(1, 2);
        Object obj3 = this.f13048d;
        kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        o.d(4, obj3);
        Object objInvoke = ((r) obj3).invoke(obj, obj2, c1086gP, Integer.valueOf(iA | i10));
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ComposableLambdaImpl.this.d(obj, obj2, interfaceC1084f2, L4.b.l(i10) | 1);
                    return p293xa.r.f47939a;
                }
            };
        }
        return objInvoke;
    }

    public final Object e(final Object obj, final Object obj2, final Object obj3, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(this.f13046b);
        h(c1086gP);
        int iA = c1086gP.K(this) ? a.a(2, 3) : a.a(1, 3);
        Object obj4 = this.f13048d;
        kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        o.d(5, obj4);
        Object objInvoke = ((s) obj4).invoke(obj, obj2, obj3, c1086gP, Integer.valueOf(iA | i10));
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ComposableLambdaImpl.this.e(obj, obj2, obj3, interfaceC1084f2, L4.b.l(i10) | 1);
                    return p293xa.r.f47939a;
                }
            };
        }
        return objInvoke;
    }

    public final Object f(final Object obj, final Object obj2, final Object obj3, final Object obj4, InterfaceC1084f interfaceC1084f, final int i10) {
        C1086g c1086gP = interfaceC1084f.p(this.f13046b);
        h(c1086gP);
        int iA = c1086gP.K(this) ? a.a(2, 4) : a.a(1, 4);
        Object obj5 = this.f13048d;
        kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        o.d(6, obj5);
        Object objI = ((t) obj5).i(obj, obj2, obj3, obj4, c1086gP, Integer.valueOf(iA | i10));
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl.invoke.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ComposableLambdaImpl.this.f(obj, obj2, obj3, obj4, interfaceC1084f2, L4.b.l(i10) | 1);
                    return p293xa.r.f47939a;
                }
            };
        }
        return objI;
    }

    public final void h(InterfaceC1084f interfaceC1084f) {
        C1105p0 c1105p0B;
        if (!this.f13047c || (c1105p0B = interfaceC1084f.b()) == null) {
            return;
        }
        interfaceC1084f.B(c1105p0B);
        if (a.c(this.f13049e, c1105p0B)) {
            this.f13049e = c1105p0B;
            return;
        }
        ArrayList arrayList = this.f13050f;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f13050f = arrayList2;
            arrayList2.add(c1105p0B);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (a.c((InterfaceC1103o0) arrayList.get(i10), c1105p0B)) {
                arrayList.set(i10, c1105p0B);
                return;
            }
        }
        arrayList.add(c1105p0B);
    }

    @Override // Ia.t
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return f(obj, obj2, obj3, obj4, (InterfaceC1084f) obj5, ((Number) obj6).intValue());
    }

    @Override // Ia.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return c((InterfaceC1084f) obj, ((Number) obj2).intValue());
    }

    public final void l(p293xa.e eVar) {
        if (kotlin.jvm.internal.i.a(this.f13048d, eVar)) {
            return;
        }
        boolean z10 = this.f13048d == null;
        this.f13048d = eVar;
        if (z10 || !this.f13047c) {
            return;
        }
        InterfaceC1103o0 interfaceC1103o0 = this.f13049e;
        if (interfaceC1103o0 != null) {
            interfaceC1103o0.invalidate();
            this.f13049e = null;
        }
        ArrayList arrayList = this.f13050f;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC1103o0) arrayList.get(i10)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // Ia.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a(((Number) obj3).intValue(), (InterfaceC1084f) obj2, obj);
    }

    @Override // Ia.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (InterfaceC1084f) obj3, ((Number) obj4).intValue());
    }

    @Override // Ia.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (InterfaceC1084f) obj4, ((Number) obj5).intValue());
    }
}
