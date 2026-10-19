package androidx.compose.runtime;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: MonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MonotonicFrameClockKt$withFrameMillis$2 extends Lambda implements Ia.l<Long, Object> {
    final /* synthetic */ Ia.l<Long, Object> $onFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MonotonicFrameClockKt$withFrameMillis$2(Ia.l<? super Long, Object> lVar) {
        super(1);
        this.$onFrame = lVar;
    }

    @Override // Ia.l
    public final Object invoke(Long l10) {
        return this.$onFrame.invoke(Long.valueOf(l10.longValue() / 1000000));
    }
}
