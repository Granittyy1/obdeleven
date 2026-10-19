package io.ktor.client.plugins;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.I;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HttpRequestRetry.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.HttpRequestRetry$Configuration$delay$1", f = "HttpRequestRetry.kt", l = {R.styleable.AppCompatTheme_textColorSearchUrl}, m = "invokeSuspend")
public final class HttpRequestRetry$Configuration$delay$1 extends SuspendLambda implements Ia.p<Long, kotlin.coroutines.c<? super p293xa.r>, Object> {
    /* synthetic */ long J$0;
    int label;

    public HttpRequestRetry$Configuration$delay$1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        HttpRequestRetry$Configuration$delay$1 httpRequestRetry$Configuration$delay$1 = new HttpRequestRetry$Configuration$delay$1(2, cVar);
        httpRequestRetry$Configuration$delay$1.J$0 = ((Number) obj).longValue();
        return httpRequestRetry$Configuration$delay$1;
    }

    @Override // Ia.p
    public final Object invoke(Long l10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((HttpRequestRetry$Configuration$delay$1) create(Long.valueOf(l10.longValue()), cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            long j = this.J$0;
            this.label = 1;
            if (I.b(j, this) == coroutineSingletons) {
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
