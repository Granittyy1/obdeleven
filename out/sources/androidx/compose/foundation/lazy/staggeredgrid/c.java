package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2;

/* JADX INFO: compiled from: LazyStaggeredGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c implements LazyLayoutIntervalContent.Interval {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2 f10814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposableLambdaImpl f10815b;

    public c(GifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2 gifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2, ComposableLambdaImpl composableLambdaImpl) {
        this.f10814a = gifGridKt$GifGrid$lambda$11$lambda$10$$inlined$itemsIndexed$default$2;
        this.f10815b = composableLambdaImpl;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final Ia.l<Integer, Object> getKey() {
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public final Ia.l<Integer, Object> getType() {
        return this.f10814a;
    }
}
