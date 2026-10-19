package androidx.compose.ui.node;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BackwardsCompatNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14325a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ia.l<BackwardsCompatNode, p293xa.r> f14326b = new Ia.l<BackwardsCompatNode, p293xa.r>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // Ia.l
        public final p293xa.r invoke(BackwardsCompatNode backwardsCompatNode) {
            BackwardsCompatNode backwardsCompatNode2 = backwardsCompatNode;
            backwardsCompatNode2.f14320q = true;
            C1192m.a(backwardsCompatNode2);
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ia.l<BackwardsCompatNode, p293xa.r> f14327c = new Ia.l<BackwardsCompatNode, p293xa.r>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // Ia.l
        public final p293xa.r invoke(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.S1();
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    public static final class a implements androidx.compose.ui.modifier.g {
        /* JADX WARN: Type inference failed for: r1v1, types: [Ia.a, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.ui.modifier.g
        public final Object s(androidx.compose.ui.modifier.h hVar) {
            return hVar.f14302a.invoke();
        }
    }

    public static final boolean a(BackwardsCompatNode backwardsCompatNode) {
        c0 c0Var = C1185f.f(backwardsCompatNode).f14389G.f14367d;
        kotlin.jvm.internal.i.c(c0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return c0Var.f14578p;
    }
}
