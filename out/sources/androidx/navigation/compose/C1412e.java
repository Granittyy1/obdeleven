package androidx.navigation.compose;

import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.StateFlowImpl;
import p141l2.C2749t;
import p141l2.S;

/* JADX INFO: renamed from: androidx.navigation.compose.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ComposeNavigator.kt */
/* JADX INFO: loaded from: classes.dex */
@l2.P.b("composable")
public final class C1412e extends p141l2.P<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f19154c = J0.f(Boolean.FALSE);

    /* JADX INFO: renamed from: androidx.navigation.compose.e$a */
    /* JADX INFO: compiled from: ComposeNavigator.kt */
    public static final class a extends p141l2.C {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ComposableLambdaImpl f19155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> f19156h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> f19157i;
        public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> f19158k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.y> f19159l;

        public a(C1412e c1412e, ComposableLambdaImpl composableLambdaImpl) {
            super(c1412e);
            this.f19155g = composableLambdaImpl;
        }
    }

    @Override // p141l2.P
    public final p141l2.C a() {
        return new a(this, C1409b.f19150a);
    }

    @Override // p141l2.P
    public final void d(List<C2749t> list, p141l2.J j, l2.P.a aVar) {
        for (C2749t backStackEntry : list) {
            S sB = b();
            kotlin.jvm.internal.i.e(backStackEntry, "backStackEntry");
            StateFlowImpl stateFlowImpl = sB.f44276c;
            Iterable iterable = (Iterable) stateFlowImpl.getValue();
            boolean z10 = iterable instanceof Collection;
            kotlinx.coroutines.flow.s sVar = sB.f44278e;
            if (!z10 || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C2749t) it.next()) == backStackEntry) {
                            Iterable iterable2 = (Iterable) sVar.f43418b.getValue();
                            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                                Iterator it2 = iterable2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((C2749t) it2.next()) == backStackEntry) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C2749t c2749t = (C2749t) kotlin.collections.q.W((List) sVar.f43418b.getValue());
            if (c2749t != null) {
                stateFlowImpl.k(null, kotlin.collections.B.B((Set) stateFlowImpl.getValue(), c2749t));
            }
            stateFlowImpl.k(null, kotlin.collections.B.B((Set) stateFlowImpl.getValue(), backStackEntry));
            sB.f(backStackEntry);
        }
        this.f19154c.setValue(Boolean.FALSE);
    }

    @Override // p141l2.P
    public final void e(C2749t c2749t, boolean z10) {
        b().d(c2749t, z10);
        this.f19154c.setValue(Boolean.TRUE);
    }
}
