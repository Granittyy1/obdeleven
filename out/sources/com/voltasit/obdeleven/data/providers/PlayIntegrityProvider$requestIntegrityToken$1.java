package com.voltasit.obdeleven.data.providers;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PlayIntegrityProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PlayIntegrityProvider", f = "PlayIntegrityProvider.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle}, m = "requestIntegrityToken-gIAlu-s")
final class PlayIntegrityProvider$requestIntegrityToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayIntegrityProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityProvider$requestIntegrityToken$1(PlayIntegrityProvider playIntegrityProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = playIntegrityProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(null, this);
        return objB == CoroutineSingletons.f43038b ? objB : new Result(objB);
    }
}
