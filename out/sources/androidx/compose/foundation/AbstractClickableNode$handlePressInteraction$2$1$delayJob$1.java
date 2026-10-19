package androidx.compose.foundation;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1186g;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.e0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1257, 1260}, m = "invokeSuspend")
public final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.k $interactionSource;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j, androidx.compose.foundation.interaction.k kVar, kotlin.coroutines.c<? super AbstractClickableNode$handlePressInteraction$2$1$delayJob$1> cVar) {
        super(2, cVar);
        this.this$0 = abstractClickableNode;
        this.$offset = j;
        this.$interactionSource = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0103  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.compose.ui.h$c] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [androidx.compose.runtime.collection.c] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        androidx.compose.ui.node.K k10;
        androidx.compose.foundation.interaction.m.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (androidx.compose.foundation.interaction.m.b) this.L$0;
                kotlin.b.b(obj);
            }
            this.this$0.f9679A = bVar;
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        AbstractClickableNode abstractClickableNode = this.this$0;
        abstractClickableNode.getClass();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        androidx.compose.foundation.gestures.t.a aVar = androidx.compose.foundation.gestures.t.f10052r;
        Ia.l<e0, Boolean> lVar = new Ia.l<e0, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$hasScrollableContainer$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0017  */
            @Override // Ia.l
            public final Boolean invoke(e0 e0Var) {
                boolean z12;
                e0 e0Var2 = e0Var;
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                if (ref$BooleanRef2.element) {
                    z12 = true;
                } else {
                    kotlin.jvm.internal.i.c(e0Var2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (((androidx.compose.foundation.gestures.t) e0Var2).f10054q) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                ref$BooleanRef2.element = z12;
                return Boolean.valueOf(!ref$BooleanRef.element);
            }
        };
        if (!abstractClickableNode.f13985b.f13997o) {
            R.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.h.c cVar = abstractClickableNode.f13985b.f13989f;
        LayoutNode layoutNodeF = C1185f.f(abstractClickableNode);
        loop0: while (layoutNodeF != null) {
            if ((layoutNodeF.f14389G.f14368e.f13988e & 262144) != 0) {
                while (cVar != null) {
                    if ((cVar.f13987d & 262144) != 0) {
                        ?? B10 = cVar;
                        ?? cVar2 = 0;
                        while (B10 != 0) {
                            if (B10 instanceof e0) {
                                e0 e0Var = (e0) B10;
                                if (!(aVar.equals(e0Var.J()) ? ((Boolean) lVar.invoke(e0Var)).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else {
                                if (((B10.f13987d & 262144) != 0) && (B10 instanceof AbstractC1187h)) {
                                    androidx.compose.ui.h.c cVar3 = ((AbstractC1187h) B10).f14585q;
                                    int i11 = 0;
                                    while (cVar3 != null) {
                                        if ((cVar3.f13987d & 262144) != 0) {
                                            B10 = B10;
                                            cVar2 = cVar2;
                                            i11++;
                                            if (i11 == 1) {
                                                B10 = B10;
                                                cVar2 = cVar2;
                                                cVar2 = cVar2;
                                                B10 = cVar3;
                                            } else {
                                                if (cVar2 == 0) {
                                                    cVar2 = new androidx.compose.runtime.collection.c(new androidx.compose.ui.h.c[16]);
                                                }
                                                if (B10 != 0) {
                                                    cVar2.b(B10);
                                                    B10 = 0;
                                                }
                                                cVar2.b(cVar3);
                                            }
                                        } else {
                                            B10 = B10;
                                            cVar2 = cVar2;
                                            B10 = B10;
                                            cVar2 = cVar2;
                                        }
                                        cVar3 = cVar3.f13990g;
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    }
                                    if (i11 == 1) {
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    } else {
                                        B10 = B10;
                                        cVar2 = cVar2;
                                    }
                                }
                            }
                            B10 = C1185f.b(cVar2);
                        }
                    }
                    cVar = cVar.f13989f;
                }
            }
            layoutNodeF = layoutNodeF.G();
            cVar = (layoutNodeF == null || (k10 = layoutNodeF.f14389G) == null) ? null : k10.f14367d;
        }
        if (ref$BooleanRef.element) {
            z10 = true;
        } else {
            int i12 = C0939k.f10078b;
            ViewParent parent = C1186g.a(abstractClickableNode).getParent();
            while (true) {
                if (parent == null || !(parent instanceof ViewGroup)) {
                    z11 = false;
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.shouldDelayChildPressedState()) {
                    z11 = true;
                    break;
                }
                parent = viewGroup.getParent();
            }
            if (z11) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            long j = C0939k.f10077a;
            this.label = 1;
            if (kotlinx.coroutines.I.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        bVar = new androidx.compose.foundation.interaction.m.b(this.$offset);
        androidx.compose.foundation.interaction.k kVar = this.$interactionSource;
        this.L$0 = bVar;
        this.label = 2;
        if (kVar.c(bVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.this$0.f9679A = bVar;
        return p293xa.r.f47939a;
    }
}
