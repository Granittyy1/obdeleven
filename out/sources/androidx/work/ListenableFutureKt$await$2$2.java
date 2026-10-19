package androidx.work;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ListenableFutureKt$await$2$2 extends Lambda implements Ia.l<Throwable, p293xa.r> {
    final /* synthetic */ p107i6.f<Object> $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$await$2$2(p107i6.f<Object> fVar) {
        super(1);
        this.$this_await = fVar;
    }

    @Override // Ia.l
    public final p293xa.r invoke(Throwable th) {
        this.$this_await.cancel(false);
        return p293xa.r.f47939a;
    }
}
