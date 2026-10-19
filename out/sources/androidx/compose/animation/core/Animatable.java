package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Animatable<T, V extends AbstractC0913m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0<T, V> f9336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f9337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0908h<T, V> f9338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1085f0 f9339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1085f0 f9340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L f9341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P<T> f9342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V f9343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V f9344i;
    public final V j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V f9345k;

    /* JADX WARN: Multi-variable type inference failed */
    public Animatable(Object obj, d0 d0Var, Object obj2) {
        this.f9336a = d0Var;
        this.f9337b = obj2;
        C0908h<T, V> c0908h = new C0908h<>(d0Var, obj, null, 60);
        this.f9338c = c0908h;
        this.f9339d = J0.f(Boolean.FALSE);
        this.f9340e = J0.f(obj);
        this.f9341f = new L();
        this.f9342g = new P<>(3, obj2);
        V v10 = c0908h.f9545d;
        V v11 = v10 instanceof C0909i ? C0901a.f9518e : v10 instanceof C0910j ? C0901a.f9519f : v10 instanceof C0911k ? C0901a.f9520g : C0901a.f9521h;
        kotlin.jvm.internal.i.c(v11, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f9343h = v11;
        V v12 = c0908h.f9545d;
        V v13 = v12 instanceof C0909i ? C0901a.f9514a : v12 instanceof C0910j ? C0901a.f9515b : v12 instanceof C0911k ? C0901a.f9516c : C0901a.f9517d;
        kotlin.jvm.internal.i.c(v13, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f9344i = v13;
        this.j = v11;
        this.f9345k = v13;
    }

    public static final Object a(Animatable animatable, Object obj) {
        V v10 = animatable.f9343h;
        V v11 = animatable.j;
        boolean zA = kotlin.jvm.internal.i.a(v11, v10);
        V v12 = animatable.f9345k;
        if (zA && kotlin.jvm.internal.i.a(v12, animatable.f9344i)) {
            return obj;
        }
        d0<T, V> d0Var = animatable.f9336a;
        V vInvoke = d0Var.a().invoke(obj);
        int iB = vInvoke.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < iB; i10++) {
            if (vInvoke.a(i10) < v11.a(i10) || vInvoke.a(i10) > v12.a(i10)) {
                vInvoke.e(Na.l.C(vInvoke.a(i10), v11.a(i10), v12.a(i10)), i10);
                z10 = true;
            }
        }
        return z10 ? d0Var.b().invoke(vInvoke) : obj;
    }

    public static final void b(Animatable animatable) {
        C0908h<T, V> c0908h = animatable.f9338c;
        c0908h.f9545d.d();
        c0908h.f9546e = Long.MIN_VALUE;
        animatable.f9339d.setValue(Boolean.FALSE);
    }

    public static Object c(Animatable animatable, Object obj, InterfaceC0906f interfaceC0906f, Ia.l lVar, kotlin.coroutines.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            interfaceC0906f = animatable.f9342g;
        }
        InterfaceC0906f interfaceC0906f2 = interfaceC0906f;
        T tInvoke = animatable.f9336a.b().invoke(animatable.f9338c.f9545d);
        if ((i10 & 8) != 0) {
            lVar = null;
        }
        Object objD = animatable.d();
        d0<T, V> d0Var = animatable.f9336a;
        return L.a(animatable.f9341f, new Animatable$runAnimation$2(animatable, tInvoke, new U(interfaceC0906f2, d0Var, objD, obj, d0Var.a().invoke(tInvoke)), animatable.f9338c.f9546e, lVar, null), cVar);
    }

    public final T d() {
        return this.f9338c.f9544c.getValue();
    }

    public final Object e(T t8, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objA = L.a(this.f9341f, new Animatable$snapTo$2(this, t8, null), cVar);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    public final Object f(SuspendLambda suspendLambda) {
        Object objA = L.a(this.f9341f, new Animatable$stop$2(this, null), suspendLambda);
        return objA == CoroutineSingletons.f43038b ? objA : p293xa.r.f47939a;
    }

    public /* synthetic */ Animatable(Object obj, e0 e0Var, Object obj2, int i10) {
        this(obj, e0Var, (i10 & 4) != 0 ? null : obj2);
    }
}
