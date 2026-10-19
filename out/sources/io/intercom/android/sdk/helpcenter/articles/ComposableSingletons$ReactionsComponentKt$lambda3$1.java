package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: ReactionsComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ReactionsComponentKt$lambda3$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ReactionsComponentKt$lambda3$1 INSTANCE = new ComposableSingletons$ReactionsComponentKt$lambda3$1();

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            ReactionsComponentKt.ReactionsComponent(null, ArticleViewState.ReactionState.copy$default(ArticleViewState.ReactionState.Companion.getDefaultReactionState(), 0, 0, ArticleViewState.Reaction.Sad, 0, false, 27, null), new d(), new e(), new f(), interfaceC1084f, 28032, 1);
        }
    }
}
