package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.InterfaceC1258z0;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend")
final class LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<InterfaceC1258z0, kotlin.coroutines.c<?>, Object> $block;
    int label;
    final /* synthetic */ T this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(T t8, Ia.p<? super InterfaceC1258z0, ? super kotlin.coroutines.c<?>, ? extends Object> pVar, kotlin.coroutines.c<? super LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1> cVar) {
        super(2, cVar);
        this.this$0 = t8;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this.this$0, this.$block, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        ((LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw new KotlinNothingValueException();
        }
        kotlin.b.b(obj);
        T t8 = this.this$0;
        Ia.p<InterfaceC1258z0, kotlin.coroutines.c<?>, Object> pVar = this.$block;
        this.label = 1;
        PlatformTextInputModifierNodeKt.a(t8, pVar, this);
        return coroutineSingletons;
    }
}
