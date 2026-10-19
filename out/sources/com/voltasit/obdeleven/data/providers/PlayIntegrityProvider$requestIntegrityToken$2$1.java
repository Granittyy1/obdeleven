package com.voltasit.obdeleven.data.providers;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PlayIntegrityProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PlayIntegrityProvider$requestIntegrityToken$2$1", f = "PlayIntegrityProvider.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "invokeSuspend")
final class PlayIntegrityProvider$requestIntegrityToken$2$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super String>, Object> {
    final /* synthetic */ b6.a.d $request;
    final /* synthetic */ PlayIntegrityProvider $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityProvider$requestIntegrityToken$2$1(PlayIntegrityProvider playIntegrityProvider, b6.a.d dVar, kotlin.coroutines.c<? super PlayIntegrityProvider$requestIntegrityToken$2$1> cVar) {
        super(2, cVar);
        this.$this_runCatching = playIntegrityProvider;
        this.$request = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PlayIntegrityProvider$requestIntegrityToken$2$1(this.$this_runCatching, this.$request, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super String> cVar) {
        return ((PlayIntegrityProvider$requestIntegrityToken$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            PlayIntegrityProvider playIntegrityProvider = this.$this_runCatching;
            b6.a.d request = this.$request;
            kotlin.jvm.internal.i.d(request, "$request");
            this.label = 1;
            obj = PlayIntegrityProvider.c(playIntegrityProvider, request, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
