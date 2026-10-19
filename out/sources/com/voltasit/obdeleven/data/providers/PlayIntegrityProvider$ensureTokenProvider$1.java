package com.voltasit.obdeleven.data.providers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: PlayIntegrityProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.PlayIntegrityProvider", f = "PlayIntegrityProvider.kt", l = {161, R.styleable.AppCompatTheme_windowMinWidthMinor}, m = "ensureTokenProvider")
final class PlayIntegrityProvider$ensureTokenProvider$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PlayIntegrityProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayIntegrityProvider$ensureTokenProvider$1(PlayIntegrityProvider playIntegrityProvider, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = playIntegrityProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        PlayIntegrityProvider playIntegrityProvider = this.this$0;
        int i10 = PlayIntegrityProvider.f30220l;
        return playIntegrityProvider.e(this);
    }
}
