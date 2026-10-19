package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A extends LayoutNode.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1178y f14155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.p<e0, p013b0.a, F> f14156c;

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class a implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f14157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1178y f14158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ F f14160d;

        public a(F f10, C1178y c1178y, int i10, F f11) {
            this.f14158b = c1178y;
            this.f14159c = i10;
            this.f14160d = f11;
            this.f14157a = f10;
        }

        @Override // androidx.compose.ui.layout.F
        public final int getHeight() {
            return this.f14157a.getHeight();
        }

        @Override // androidx.compose.ui.layout.F
        public final int getWidth() {
            return this.f14157a.getWidth();
        }

        @Override // androidx.compose.ui.layout.F
        public final Map<AbstractC1155a, Integer> o() {
            return this.f14157a.o();
        }

        @Override // androidx.compose.ui.layout.F
        public final void p() {
            C1178y c1178y = this.f14158b;
            c1178y.f14263f = this.f14159c;
            this.f14160d.p();
            androidx.collection.K<Object, SubcomposeLayoutState.a> k10 = c1178y.f14269m;
            long[] jArr = k10.f9127a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = k10.f9128b[i13];
                            SubcomposeLayoutState.a aVar = (SubcomposeLayoutState.a) k10.f9129c[i13];
                            int iL = c1178y.f14270n.l(obj);
                            if (iL < 0 || iL >= c1178y.f14263f) {
                                aVar.dispose();
                                k10.k(i13);
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        @Override // androidx.compose.ui.layout.F
        public final Ia.l<Object, p293xa.r> q() {
            return this.f14157a.q();
        }
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class b implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f14161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1178y f14162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f14163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ F f14164d;

        public b(F f10, C1178y c1178y, int i10, F f11) {
            this.f14162b = c1178y;
            this.f14163c = i10;
            this.f14164d = f11;
            this.f14161a = f10;
        }

        @Override // androidx.compose.ui.layout.F
        public final int getHeight() {
            return this.f14161a.getHeight();
        }

        @Override // androidx.compose.ui.layout.F
        public final int getWidth() {
            return this.f14161a.getWidth();
        }

        @Override // androidx.compose.ui.layout.F
        public final Map<AbstractC1155a, Integer> o() {
            return this.f14161a.o();
        }

        @Override // androidx.compose.ui.layout.F
        public final void p() {
            C1178y c1178y = this.f14162b;
            c1178y.f14262e = this.f14163c;
            this.f14164d.p();
            c1178y.b(c1178y.f14262e);
        }

        @Override // androidx.compose.ui.layout.F
        public final Ia.l<Object, p293xa.r> q() {
            return this.f14161a.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A(C1178y c1178y, Ia.p<? super e0, ? super p013b0.a, ? extends F> pVar, String str) {
        super(str);
        this.f14155b = c1178y;
        this.f14156c = pVar;
    }

    @Override // androidx.compose.ui.layout.E
    public final F g(H h8, List<? extends D> list, long j) {
        C1178y c1178y = this.f14155b;
        LayoutDirection layoutDirection = h8.getLayoutDirection();
        C1178y.c cVar = c1178y.f14266i;
        cVar.f14282b = layoutDirection;
        cVar.f14283c = h8.getDensity();
        cVar.f14284d = h8.P0();
        boolean zS0 = h8.S0();
        Ia.p<e0, p013b0.a, F> pVar = this.f14156c;
        if (zS0 || c1178y.f14259b.f14407i == null) {
            c1178y.f14262e = 0;
            F fInvoke = pVar.invoke(cVar, new p013b0.a(j));
            return new b(fInvoke, c1178y, c1178y.f14262e, fInvoke);
        }
        c1178y.f14263f = 0;
        F fInvoke2 = pVar.invoke(c1178y.j, new p013b0.a(j));
        return new a(fInvoke2, c1178y, c1178y.f14263f, fInvoke2);
    }
}
