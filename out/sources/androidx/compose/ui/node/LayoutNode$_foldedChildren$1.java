package androidx.compose.ui.node;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode$_foldedChildren$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$_foldedChildren$1(LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNode;
    }

    @Override // Ia.a
    public final p293xa.r invoke() {
        C1204z c1204z = this.this$0.f14390H;
        c1204z.f14641p.f14471B = true;
        LookaheadPassDelegate lookaheadPassDelegate = c1204z.f14642q;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.f14458v = true;
        }
        return p293xa.r.f47939a;
    }
}
