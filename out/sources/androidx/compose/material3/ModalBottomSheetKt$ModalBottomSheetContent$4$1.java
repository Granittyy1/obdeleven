package androidx.compose.material3;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
public final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends SuspendLambda implements Ia.q<kotlinx.coroutines.A, Float, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.l<Float, p293xa.r> $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$ModalBottomSheetContent$4$1(Ia.l<? super Float, p293xa.r> lVar, kotlin.coroutines.c<? super ModalBottomSheetKt$ModalBottomSheetContent$4$1> cVar) {
        super(3, cVar);
        this.$settleToDismiss = lVar;
    }

    @Override // Ia.q
    public final Object invoke(kotlinx.coroutines.A a10, Float f10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        float fFloatValue = f10.floatValue();
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.$settleToDismiss, cVar);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.F$0 = fFloatValue;
        return modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$settleToDismiss.invoke(new Float(this.F$0));
        return p293xa.r.f47939a;
    }
}
