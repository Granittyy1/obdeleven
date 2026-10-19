package io.intercom.android.sdk.m5.home.ui;

import Ia.p;
import io.intercom.android.sdk.Injector;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: HomeContentScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt$HomeContentScreen$8$1$2$1", f = "HomeContentScreen.kt", l = {}, m = "invokeSuspend")
public final class HomeContentScreenKt$HomeContentScreen$8$1$2$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ int $index;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeContentScreenKt$HomeContentScreen$8$1$2$1(int i10, kotlin.coroutines.c<? super HomeContentScreenKt$HomeContentScreen$8$1$2$1> cVar) {
        super(2, cVar);
        this.$index = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new HomeContentScreenKt$HomeContentScreen$8$1$2$1(this.$index, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        Injector.get().getMetricTracker().viewedSearchBrowseCard(this.$index);
        return r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((HomeContentScreenKt$HomeContentScreen$8$1$2$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
