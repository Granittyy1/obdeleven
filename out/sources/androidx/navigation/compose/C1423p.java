package androidx.navigation.compose;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Iterator;
import java.util.List;
import p141l2.C2749t;
import p141l2.InterfaceC2739i;

/* JADX INFO: renamed from: androidx.navigation.compose.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogNavigator.kt */
/* JADX INFO: loaded from: classes.dex */
@l2.P.b("dialog")
public final class C1423p extends p141l2.P<a> {

    /* JADX INFO: renamed from: androidx.navigation.compose.p$a */
    /* JADX INFO: compiled from: DialogNavigator.kt */
    public static final class a extends p141l2.C implements InterfaceC2739i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final androidx.compose.ui.window.f f19190g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ComposableLambdaImpl f19191h;

        public a() {
            throw null;
        }

        public a(C1423p c1423p) {
            ComposableLambdaImpl composableLambdaImpl = C1410c.f19152a;
            androidx.compose.ui.window.f fVar = new androidx.compose.ui.window.f(7);
            super(c1423p);
            this.f19190g = fVar;
            this.f19191h = composableLambdaImpl;
        }
    }

    @Override // p141l2.P
    public final p141l2.C a() {
        ComposableLambdaImpl composableLambdaImpl = C1410c.f19152a;
        return new a(this);
    }

    @Override // p141l2.P
    public final void d(List<C2749t> list, p141l2.J j, l2.P.a aVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b().f((C2749t) it.next());
        }
    }

    @Override // p141l2.P
    public final void e(C2749t c2749t, boolean z10) {
        b().d(c2749t, z10);
        int iR = kotlin.collections.q.R((Iterable) b().f44279f.f43418b.getValue(), c2749t);
        int i10 = 0;
        for (Object obj : (Iterable) b().f44279f.f43418b.getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            C2749t c2749t2 = (C2749t) obj;
            if (i10 > iR) {
                b().b(c2749t2);
            }
            i10 = i11;
        }
    }
}
