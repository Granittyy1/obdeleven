package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1094k;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SubcomposeLayoutState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f14211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1178y f14212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ia.p<LayoutNode, SubcomposeLayoutState, p293xa.r> f14213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<LayoutNode, AbstractC1094k, p293xa.r> f14214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.p<LayoutNode, Ia.p<? super e0, ? super p013b0.a, ? extends F>, p293xa.r> f14215e;

    public SubcomposeLayoutState(f0 f0Var) {
        this.f14211a = f0Var;
        this.f14213c = new Ia.p<LayoutNode, SubcomposeLayoutState, p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setRoot$1
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
                LayoutNode layoutNode2 = layoutNode;
                SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
                C1178y c1178y = layoutNode2.f14391I;
                if (c1178y == null) {
                    c1178y = new C1178y(layoutNode2, subcomposeLayoutState2.f14211a);
                    layoutNode2.f14391I = c1178y;
                }
                subcomposeLayoutState2.f14212b = c1178y;
                this.this$0.a().c();
                C1178y c1178yA = this.this$0.a();
                f0 f0Var2 = this.this$0.f14211a;
                if (c1178yA.f14261d != f0Var2) {
                    c1178yA.f14261d = f0Var2;
                    c1178yA.d(false);
                    LayoutNode.f0(c1178yA.f14259b, false, 7);
                }
                return p293xa.r.f47939a;
            }
        };
        this.f14214d = new Ia.p<LayoutNode, AbstractC1094k, p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setCompositionContext$1
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(LayoutNode layoutNode, AbstractC1094k abstractC1094k) {
                this.this$0.a().f14260c = abstractC1094k;
                return p293xa.r.f47939a;
            }
        };
        this.f14215e = new Ia.p<LayoutNode, Ia.p<? super e0, ? super p013b0.a, ? extends F>, p293xa.r>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$setMeasurePolicy$1
            {
                super(2);
            }

            @Override // Ia.p
            public final p293xa.r invoke(LayoutNode layoutNode, Ia.p<? super e0, ? super p013b0.a, ? extends F> pVar) {
                C1178y c1178yA = this.this$0.a();
                layoutNode.d(new A(c1178yA, pVar, c1178yA.f14273q));
                return p293xa.r.f47939a;
            }
        };
    }

    public final C1178y a() {
        C1178y c1178y = this.f14212b;
        if (c1178y != null) {
            return c1178y;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public SubcomposeLayoutState() {
        this(M.f14193a);
    }

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public interface a {
        default int b() {
            return 0;
        }

        void dispose();

        default void c(Ia.l lVar) {
        }

        default void a(int i10, long j) {
        }
    }
}
