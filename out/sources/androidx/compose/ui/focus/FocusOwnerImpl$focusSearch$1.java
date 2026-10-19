package androidx.compose.ui.focus;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImpl$focusSearch$1 extends Lambda implements Ia.l<FocusTargetNode, Boolean> {
    final /* synthetic */ Ia.l<FocusTargetNode, Boolean> $onFound;
    final /* synthetic */ FocusTargetNode $source;
    final /* synthetic */ FocusOwnerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl$focusSearch$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Ia.l<? super FocusTargetNode, Boolean> lVar) {
        super(1);
        this.$source = focusTargetNode;
        this.this$0 = focusOwnerImpl;
        this.$onFound = lVar;
    }

    @Override // Ia.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        boolean zBooleanValue;
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        if (kotlin.jvm.internal.i.a(focusTargetNode2, this.$source)) {
            zBooleanValue = false;
        } else {
            if (kotlin.jvm.internal.i.a(focusTargetNode2, this.this$0.f13419f)) {
                throw new IllegalStateException("Focus search landed at the root.");
            }
            zBooleanValue = this.$onFound.invoke(focusTargetNode2).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
