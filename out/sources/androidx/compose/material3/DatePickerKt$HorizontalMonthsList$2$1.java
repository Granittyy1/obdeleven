package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.J0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1698}, m = "invokeSuspend")
public final class DatePickerKt$HorizontalMonthsList$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ androidx.compose.material3.internal.k $calendarModel;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Ia.l<Long, p293xa.r> $onDisplayedMonthChange;
    final /* synthetic */ Na.i $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$HorizontalMonthsList$2$1(LazyListState lazyListState, Ia.l<? super Long, p293xa.r> lVar, androidx.compose.material3.internal.k kVar, Na.i iVar, kotlin.coroutines.c<? super DatePickerKt$HorizontalMonthsList$2$1> cVar) {
        super(2, cVar);
        this.$lazyListState = lazyListState;
        this.$onDisplayedMonthChange = lVar;
        this.$calendarModel = kVar;
        this.$yearRange = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DatePickerKt$HorizontalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((DatePickerKt$HorizontalMonthsList$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final LazyListState lazyListState = this.$lazyListState;
            Ia.l<Long, p293xa.r> lVar = this.$onDisplayedMonthChange;
            androidx.compose.material3.internal.k kVar = this.$calendarModel;
            Na.i iVar = this.$yearRange;
            this.label = 1;
            float f10 = DatePickerKt.f12139a;
            Object objCollect = J0.j(new Ia.a<Integer>() { // from class: androidx.compose.material3.DatePickerKt$updateDisplayedMonth$2
                {
                    super(0);
                }

                @Override // Ia.a
                public final Integer invoke() {
                    return Integer.valueOf(lazyListState.h());
                }
            }).collect(new C1066s(lazyListState, lVar, kVar, iVar), this);
            if (objCollect != coroutineSingletons) {
                objCollect = p293xa.r.f47939a;
            }
            if (objCollect == coroutineSingletons) {
                return coroutineSingletons;
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
