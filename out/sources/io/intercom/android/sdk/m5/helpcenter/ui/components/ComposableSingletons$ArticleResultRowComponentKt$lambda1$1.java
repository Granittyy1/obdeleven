package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.C0932d;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.h0;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.ui.theme.IntercomTheme;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleResultRowComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: ArticleResultRowComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ArticleResultRowComponentKt$lambda1$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            ArticleResultRowComponentKt.ArticleResultRowComponent(new ArticleSearchResultRow.ArticleResultRow("", "<highlight>Lorem Ipsum</highlight> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", "There are many variations of passages of <highlight>Lorem Ipsum</highlight> available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.", 0), new f(), C0932d.b(androidx.compose.ui.h.a.f13984b, IntercomTheme.INSTANCE.getColors(interfaceC1084f, IntercomTheme.$stable).m621getBackground0d7_KjU(), h0.f13629a), interfaceC1084f, 48, 0);
        }
    }
}
