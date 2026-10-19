package androidx.compose.foundation;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2702l0;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {1263, 1265, 1272, 1273, 1283}, m = "invokeSuspend")
final class AbstractClickableNode$handlePressInteraction$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.k $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ androidx.compose.foundation.gestures.p $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(androidx.compose.foundation.gestures.p pVar, long j, androidx.compose.foundation.interaction.k kVar, AbstractClickableNode abstractClickableNode, kotlin.coroutines.c<? super AbstractClickableNode$handlePressInteraction$2$1> cVar) {
        super(2, cVar);
        this.$this_handlePressInteraction = pVar;
        this.$offset = j;
        this.$interactionSource = kVar;
        this.this$0 = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.$offset, this.$interactionSource, this.this$0, cVar);
        abstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2694i0 interfaceC2694i0C;
        boolean z10;
        androidx.compose.foundation.interaction.m.b bVar;
        androidx.compose.foundation.interaction.m.c cVar;
        androidx.compose.foundation.interaction.k kVar;
        androidx.compose.foundation.interaction.k kVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC2694i0C = (InterfaceC2694i0) this.L$0;
                kotlin.b.b(obj);
            } else if (i10 == 2) {
                z10 = this.Z$0;
                kotlin.b.b(obj);
                if (z10) {
                    bVar = new androidx.compose.foundation.interaction.m.b(this.$offset);
                    cVar = new androidx.compose.foundation.interaction.m.c(bVar);
                    kVar = this.$interactionSource;
                    this.L$0 = cVar;
                    this.label = 3;
                    if (kVar.c(bVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kVar2 = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 4;
                    if (kVar2.c(cVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i10 == 3) {
                cVar = (androidx.compose.foundation.interaction.m.c) this.L$0;
                kotlin.b.b(obj);
                kVar2 = this.$interactionSource;
                this.L$0 = null;
                this.label = 4;
                if (kVar2.c(cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.f9679A = null;
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        interfaceC2694i0C = C2680e.c((kotlinx.coroutines.A) this.L$0, null, null, new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.$offset, this.$interactionSource, null), 3);
        androidx.compose.foundation.gestures.p pVar = this.$this_handlePressInteraction;
        this.L$0 = interfaceC2694i0C;
        this.label = 1;
        obj = pVar.O(this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (interfaceC2694i0C.c()) {
            this.L$0 = null;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (C2702l0.c(interfaceC2694i0C, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            z10 = zBooleanValue;
            if (z10) {
                bVar = new androidx.compose.foundation.interaction.m.b(this.$offset);
                cVar = new androidx.compose.foundation.interaction.m.c(bVar);
                kVar = this.$interactionSource;
                this.L$0 = cVar;
                this.label = 3;
                if (kVar.c(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kVar2 = this.$interactionSource;
                this.L$0 = null;
                this.label = 4;
                if (kVar2.c(cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            androidx.compose.foundation.interaction.m.b bVar2 = this.this$0.f9679A;
            if (bVar2 != null) {
                androidx.compose.foundation.interaction.k kVar3 = this.$interactionSource;
                androidx.compose.foundation.interaction.i cVar2 = zBooleanValue ? new androidx.compose.foundation.interaction.m.c(bVar2) : new androidx.compose.foundation.interaction.m.a(bVar2);
                this.L$0 = null;
                this.label = 5;
                if (kVar3.c(cVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        this.this$0.f9679A = null;
        return p293xa.r.f47939a;
    }
}
