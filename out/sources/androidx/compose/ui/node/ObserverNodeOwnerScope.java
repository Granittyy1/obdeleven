package androidx.compose.ui.node;

/* JADX INFO: compiled from: ObserverModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ObserverNodeOwnerScope implements V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ia.l<ObserverNodeOwnerScope, p293xa.r> f14549c = new Ia.l<ObserverNodeOwnerScope, p293xa.r>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // Ia.l
        public final p293xa.r invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            ObserverNodeOwnerScope observerNodeOwnerScope2 = observerNodeOwnerScope;
            if (observerNodeOwnerScope2.a0()) {
                observerNodeOwnerScope2.f14550b.a1();
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f14550b;

    public ObserverNodeOwnerScope(O o10) {
        this.f14550b = o10;
    }

    @Override // androidx.compose.ui.node.V
    public final boolean a0() {
        return this.f14550b.getNode().f13997o;
    }
}
