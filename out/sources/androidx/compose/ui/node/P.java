package androidx.compose.ui.node;

/* JADX INFO: compiled from: ObserverModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class P {
    public static final <T extends androidx.compose.ui.h.c & O> void a(T t8, Ia.a<p293xa.r> aVar) {
        ObserverNodeOwnerScope observerNodeOwnerScope = t8.f13991h;
        if (observerNodeOwnerScope == null) {
            observerNodeOwnerScope = new ObserverNodeOwnerScope(t8);
            t8.f13991h = observerNodeOwnerScope;
        }
        C1185f.g(t8).getSnapshotObserver().b(observerNodeOwnerScope, ObserverNodeOwnerScope.f14549c, aVar);
    }
}
