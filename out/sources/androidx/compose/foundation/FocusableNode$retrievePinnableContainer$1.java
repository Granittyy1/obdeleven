package androidx.compose.foundation;

import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.layout.X;
import androidx.compose.ui.node.C1183d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: Focusable.kt */
/* JADX INFO: loaded from: classes.dex */
final class FocusableNode$retrievePinnableContainer$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ Ref$ObjectRef<X> $container;
    final /* synthetic */ FocusableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$retrievePinnableContainer$1(Ref$ObjectRef<X> ref$ObjectRef, FocusableNode focusableNode) {
        super(0);
        this.$container = ref$ObjectRef;
        this.this$0 = focusableNode;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // Ia.a
    public final p293xa.r invoke() {
        this.$container.element = C1183d.a(this.this$0, PinnableContainerKt.f14203a);
        return p293xa.r.f47939a;
    }
}
