package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.X;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TicketDetailContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$2$1", f = "TicketDetailContent.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend")
public final class TicketDetailContentKt$TicketDetailContent$2$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ X<CardState> $cardState$delegate;
    final /* synthetic */ X<Float> $submissionCardAlpha$delegate;
    final /* synthetic */ X<p013b0.f> $submissionCardOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketDetailContentKt$TicketDetailContent$2$1(X<p013b0.f> x10, X<Float> x11, X<CardState> x12, kotlin.coroutines.c<? super TicketDetailContentKt$TicketDetailContent$2$1> cVar) {
        super(2, cVar);
        this.$submissionCardOffset$delegate = x10;
        this.$submissionCardAlpha$delegate = x11;
        this.$cardState$delegate = x12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TicketDetailContentKt$TicketDetailContent$2$1(this.$submissionCardOffset$delegate, this.$submissionCardAlpha$delegate, this.$cardState$delegate, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            TicketDetailContentKt.TicketDetailContent$lambda$7(this.$submissionCardOffset$delegate, 0);
            TicketDetailContentKt.TicketDetailContent$lambda$10(this.$submissionCardAlpha$delegate, 1.0f);
            this.label = 1;
            if (I.b(5000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$cardState$delegate.setValue(CardState.TimelineCard);
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TicketDetailContentKt$TicketDetailContent$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
