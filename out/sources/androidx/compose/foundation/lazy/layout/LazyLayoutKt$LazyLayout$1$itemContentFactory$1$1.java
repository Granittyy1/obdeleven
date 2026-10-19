package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.N0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 extends Lambda implements Ia.a<InterfaceC0985u> {
    final /* synthetic */ N0<Ia.a<InterfaceC0985u>> $currentItemProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(N0<? extends Ia.a<? extends InterfaceC0985u>> n10) {
        super(0);
        this.$currentItemProvider = n10;
    }

    @Override // Ia.a
    public final InterfaceC0985u invoke() {
        return this.$currentItemProvider.getValue().invoke();
    }
}
