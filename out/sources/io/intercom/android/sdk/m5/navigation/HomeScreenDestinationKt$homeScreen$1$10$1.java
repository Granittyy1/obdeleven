package io.intercom.android.sdk.m5.navigation;

import androidx.activity.ComponentActivity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: HomeScreenDestination.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$10$1", f = "HomeScreenDestination.kt", l = {}, m = "invokeSuspend")
public final class HomeScreenDestinationKt$homeScreen$1$10$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ ComponentActivity $rootActivity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenDestinationKt$homeScreen$1$10$1(ComponentActivity componentActivity, kotlin.coroutines.c<? super HomeScreenDestinationKt$homeScreen$1$10$1> cVar) {
        super(2, cVar);
        this.$rootActivity = componentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new HomeScreenDestinationKt$homeScreen$1$10$1(this.$rootActivity, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.$rootActivity.finish();
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((HomeScreenDestinationKt$homeScreen$1$10$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }
}
