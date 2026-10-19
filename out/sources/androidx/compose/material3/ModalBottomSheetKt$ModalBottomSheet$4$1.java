package androidx.compose.material3;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.kt", l = {194}, m = "invokeSuspend")
public final class ModalBottomSheetKt$ModalBottomSheet$4$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ SheetState $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$4$1(SheetState sheetState, kotlin.coroutines.c<? super ModalBottomSheetKt$ModalBottomSheet$4$1> cVar) {
        super(2, cVar);
        this.$sheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ModalBottomSheetKt$ModalBottomSheet$4$1(this.$sheetState, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ModalBottomSheetKt$ModalBottomSheet$4$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            SheetState sheetState = this.$sheetState;
            this.label = 1;
            androidx.compose.material3.internal.q<SheetValue> qVarE = sheetState.f12302c.e();
            SheetValue sheetValue = SheetValue.f12306d;
            if (!qVarE.e(sheetValue)) {
                sheetValue = SheetValue.f12305c;
            }
            Object objA = SheetState.a(sheetState, sheetValue, this);
            if (objA != obj2) {
                objA = p293xa.r.f47939a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
