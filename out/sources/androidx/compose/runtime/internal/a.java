package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1103o0;

/* JADX INFO: compiled from: ComposableLambda.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f13051a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final ComposableLambdaImpl b(int i10, p293xa.e eVar, InterfaceC1084f interfaceC1084f) {
        Object objF = interfaceC1084f.f();
        if (objF == InterfaceC1084f.a.f12980a) {
            objF = new ComposableLambdaImpl(true, i10, eVar);
            interfaceC1084f.E(objF);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) objF;
        composableLambdaImpl.l(eVar);
        return composableLambdaImpl;
    }

    public static final boolean c(InterfaceC1103o0 interfaceC1103o0, InterfaceC1103o0 interfaceC1103o1) {
        if (interfaceC1103o0 != null) {
            if ((interfaceC1103o0 instanceof C1105p0) && (interfaceC1103o1 instanceof C1105p0)) {
                C1105p0 c1105p0 = (C1105p0) interfaceC1103o0;
                if (!c1105p0.b() || interfaceC1103o0.equals(interfaceC1103o1) || kotlin.jvm.internal.i.a(c1105p0.f13108c, ((C1105p0) interfaceC1103o1).f13108c)) {
                }
            }
            return false;
        }
        return true;
    }
}
