package A8;

import A1.J;
import Ia.p;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.C1039o;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.l0;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.google.android.gms.internal.measurement.AbstractC1856m;
import com.google.android.gms.internal.measurement.C1814g;
import com.google.android.gms.internal.measurement.C1835j;
import com.google.android.gms.internal.measurement.C1842k;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.InterfaceC1884q;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: OdxMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public class p implements J {
    public static boolean A(int i10) {
        return i10 != 0 && p222s0.a.c(i10) > 0.5d;
    }

    public static int B(float f10, int i10, int i11) {
        return p222s0.a.e(p222s0.a.h(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static final void C(C2693i c2693i, kotlin.coroutines.c cVar, boolean z10) {
        Object obj = C2693i.f43445h.get(c2693i);
        Throwable thE = c2693i.e(obj);
        Object objA = thE != null ? kotlin.b.a(thE) : c2693i.f(obj);
        if (!z10) {
            cVar.resumeWith(objA);
            return;
        }
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) cVar;
        ContinuationImpl continuationImpl = hVar.f43477f;
        kotlin.coroutines.e context = continuationImpl.getContext();
        Object objC = ThreadContextKt.c(context, hVar.f43479h);
        I0<?> i0D = objC != ThreadContextKt.f43460a ? CoroutineContextKt.d(continuationImpl, context, objC) : null;
        try {
            continuationImpl.resumeWith(objA);
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            if (i0D == null || i0D.w0()) {
                ThreadContextKt.a(context, objC);
            }
        }
    }

    public static final p013b0.k D(I.f fVar) {
        return new p013b0.k(Math.round(fVar.f3757a), Math.round(fVar.f3758b), Math.round(fVar.f3759c), Math.round(fVar.f3760d));
    }

    public static void E(ViewGroup viewGroup, float f10) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof S5.f) {
            ((S5.f) background).j(f10);
        }
    }

    public static void F(View view, S5.f fVar) {
        H5.a aVar = fVar.f5566b.f5590b;
        if (aVar == null || !aVar.f3731a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            fI += O.d.i((View) parent);
        }
        S5.f.b bVar = fVar.f5566b;
        if (bVar.f5599l != fI) {
            bVar.f5599l = fI;
            fVar.n();
        }
    }

    public static void G(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof S5.f) {
            F(viewGroup, (S5.f) background);
        }
    }

    public static Object H(Ia.p pVar, Object obj, kotlin.coroutines.c cVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        kotlin.coroutines.e context = cVar.getContext();
        BaseContinuationImpl intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = context == EmptyCoroutineContext.f43032b ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(cVar) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(cVar, context);
        kotlin.jvm.internal.o.d(2, pVar);
        return pVar.invoke(obj, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
    }

    public static int I(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static C1814g J(C1814g c1814g, Y1 y10, com.google.android.gms.internal.measurement.r rVar, Boolean bool, Boolean bool2) {
        C1814g c1814g2 = new C1814g();
        Iterator<Integer> itK = c1814g.K();
        while (itK.hasNext()) {
            int iIntValue = itK.next().intValue();
            if (c1814g.J(iIntValue)) {
                InterfaceC1884q interfaceC1884qA = rVar.a(y10, Arrays.asList(c1814g.d(iIntValue), new C1835j(Double.valueOf(iIntValue)), c1814g));
                if (interfaceC1884qA.b().equals(bool)) {
                    return c1814g2;
                }
                if (bool2 == null || interfaceC1884qA.b().equals(bool2)) {
                    c1814g2.I(iIntValue, interfaceC1884qA);
                }
            }
        }
        return c1814g2;
    }

    public static InterfaceC1884q K(C1814g c1814g, Y1 y10, ArrayList arrayList, boolean z10) {
        InterfaceC1884q interfaceC1884qA;
        D1.j(1, "reduce", arrayList);
        D1.m(2, "reduce", arrayList);
        InterfaceC1884q interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
        if (!(interfaceC1884qC instanceof AbstractC1856m)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC1884qA = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
            if (interfaceC1884qA instanceof C1842k) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c1814g.s() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC1884qA = null;
        }
        AbstractC1856m abstractC1856m = (AbstractC1856m) interfaceC1884qC;
        int iS = c1814g.s();
        int i10 = z10 ? 0 : iS - 1;
        int i11 = z10 ? iS - 1 : 0;
        int i12 = z10 ? 1 : -1;
        if (interfaceC1884qA == null) {
            interfaceC1884qA = c1814g.d(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (c1814g.J(i10)) {
                interfaceC1884qA = abstractC1856m.a(y10, Arrays.asList(interfaceC1884qA, c1814g.d(i10), new C1835j(Double.valueOf(i10)), c1814g));
                if (interfaceC1884qA instanceof C1842k) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return interfaceC1884qA;
    }

    public static final p013b0.k a(long j, long j10) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new p013b0.k(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (j10 & 4294967295L)) + i11);
    }

    public static String b(String str, int i10, int i11) {
        if (i10 < 0) {
            return A.h("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return A.h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(J4.i.b(i11, "negative size: "));
    }

    public static void c(int i10, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(A.h(str, Integer.valueOf(i10)));
        }
    }

    public static void d(long j, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(A.h(str, Long.valueOf(j)));
        }
    }

    public static void e(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(A.h(str, obj));
        }
    }

    public static void f(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void g(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(int i10, int i11) {
        String strH;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strH = A.h("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(J4.i.b(i11, "negative size: "));
                }
                strH = A.h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static final void i(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void k(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(b("index", i10, i11));
        }
    }

    public static final void l(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(f.d(i10, i11, "index: ", ", size: "));
        }
    }

    public static void m(int i10, int i11, int i12) {
        String strB;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strB = b("start index", i10, i12);
            } else {
                strB = (i11 < 0 || i11 > i12) ? b("end index", i11, i12) : A.h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static final void n(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbA = B6.a.a("fromIndex: ", ", toIndex: ", ", size: ", i10, i11);
            sbA.append(i12);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(f.d(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void o(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(A.h(str, obj));
        }
    }

    public static void p(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void q(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static final androidx.compose.ui.h r(androidx.compose.ui.h hVar, l0 l0Var) {
        return T.b(hVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, l0Var, true, 124927);
    }

    public static final androidx.compose.ui.h s(androidx.compose.ui.h hVar) {
        return T.b(hVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, true, 126975);
    }

    public static Cb.a t(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? new S5.h() : new S5.d();
        }
        return new S5.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kotlin.coroutines.c u(final Ia.p pVar, final kotlin.coroutines.c cVar, final kotlin.coroutines.c cVar2) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(cVar, cVar2);
        }
        final kotlin.coroutines.e context = cVar2.getContext();
        return context == EmptyCoroutineContext.f43032b ? new RestrictedContinuationImpl(cVar2) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    b.b(obj);
                    return obj;
                }
                this.label = 1;
                b.b(obj);
                i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                p pVar2 = pVar;
                o.d(2, pVar2);
                return pVar2.invoke(cVar, this);
            }
        } : new ContinuationImpl(cVar2, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            private int label;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("This coroutine had already completed");
                    }
                    this.label = 2;
                    b.b(obj);
                    return obj;
                }
                this.label = 1;
                b.b(obj);
                i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                p pVar2 = pVar;
                o.d(2, pVar2);
                return pVar2.invoke(cVar, this);
            }
        };
    }

    public static C1039o v(InterfaceC1084f interfaceC1084f) {
        float f10 = 6;
        float f11 = 12;
        float f12 = 8;
        float f13 = 8;
        boolean zG = interfaceC1084f.g(f10) | interfaceC1084f.g(f11) | interfaceC1084f.g(f12) | interfaceC1084f.g(f13);
        Object objF = interfaceC1084f.f();
        if (zG || objF == InterfaceC1084f.a.f12980a) {
            objF = new C1039o(f10, f11, f12, f13);
            interfaceC1084f.E(objF);
        }
        return (C1039o) objF;
    }

    public static int w(int i10, View view) {
        Context context = view.getContext();
        TypedValue typedValueC = P5.b.c(view.getContext(), view.getClass().getCanonicalName(), i10);
        int i11 = typedValueC.resourceId;
        return i11 != 0 ? p0.a.b.a(context, i11) : typedValueC.data;
    }

    public static int x(Context context, int i10, int i11) {
        Integer numValueOf;
        TypedValue typedValueA = P5.b.a(context, i10);
        if (typedValueA != null) {
            int i12 = typedValueA.resourceId;
            numValueOf = Integer.valueOf(i12 != 0 ? p0.a.b.a(context, i12) : typedValueA.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    public static kotlin.coroutines.c y(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c<Object> cVarIntercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        ContinuationImpl continuationImpl = cVar instanceof ContinuationImpl ? (ContinuationImpl) cVar : null;
        return (continuationImpl == null || (cVarIntercepted = continuationImpl.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static final boolean z(int i10) {
        return i10 == 1 || i10 == 2;
    }
}
