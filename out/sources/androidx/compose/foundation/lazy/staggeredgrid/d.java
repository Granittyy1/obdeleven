package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.P;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2;

/* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d extends LazyLayoutIntervalContent<c> implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P<c> f10816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W4.b f10817b;

    public d(Ia.l<? super q, p293xa.r> lVar) {
        P<c> p10 = new P<>();
        this.f10816a = p10;
        this.f10817b = new W4.b(p10);
        lVar.invoke(this);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.q
    public final void a(int i10, GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2 gifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2, ComposableLambdaImpl composableLambdaImpl) {
        this.f10816a.a(i10, new c(gifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2, composableLambdaImpl));
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public final P i() {
        return this.f10816a;
    }
}
