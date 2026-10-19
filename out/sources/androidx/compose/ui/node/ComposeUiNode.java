package androidx.compose.ui.node;

/* JADX INFO: compiled from: ComposeUiNode.kt */
/* JADX INFO: loaded from: classes.dex */
public interface ComposeUiNode {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final Companion f14331c0 = Companion.f14332a;

    /* JADX INFO: compiled from: ComposeUiNode.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f14332a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Ia.a<ComposeUiNode> f14333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Ia.a<ComposeUiNode> f14334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> f14335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> f14336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> f14337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Ia.p<ComposeUiNode, Integer, p293xa.r> f14338g;

        static {
            LayoutNode.b bVar = LayoutNode.f14379R;
            f14333b = LayoutNode.f14380S;
            f14334c = new Ia.a<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
                @Override // Ia.a
                public final LayoutNode invoke() {
                    return new LayoutNode(true, 2, 0);
                }
            };
            f14335d = new Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
                @Override // Ia.p
                public final p293xa.r invoke(ComposeUiNode composeUiNode, androidx.compose.ui.h hVar) {
                    composeUiNode.e(hVar);
                    return p293xa.r.f47939a;
                }
            };
            f14336e = new Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
                @Override // Ia.p
                public final p293xa.r invoke(ComposeUiNode composeUiNode, androidx.compose.runtime.r rVar) {
                    composeUiNode.l(rVar);
                    return p293xa.r.f47939a;
                }
            };
            f14337f = new Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
                @Override // Ia.p
                public final p293xa.r invoke(ComposeUiNode composeUiNode, androidx.compose.ui.layout.E e10) {
                    composeUiNode.d(e10);
                    return p293xa.r.f47939a;
                }
            };
            f14338g = new Ia.p<ComposeUiNode, Integer, p293xa.r>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
                @Override // Ia.p
                public final p293xa.r invoke(ComposeUiNode composeUiNode, Integer num) {
                    num.intValue();
                    composeUiNode.getClass();
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    void d(androidx.compose.ui.layout.E e10);

    void e(androidx.compose.ui.h hVar);

    void l(androidx.compose.runtime.r rVar);
}
