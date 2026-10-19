package androidx.compose.runtime;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
final class Recomposer$readObserverOf$1 extends Lambda implements Ia.l<Object, p293xa.r> {
    final /* synthetic */ InterfaceC1115w $composition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$readObserverOf$1(InterfaceC1115w interfaceC1115w) {
        super(1);
        this.$composition = interfaceC1115w;
    }

    @Override // Ia.l
    public final p293xa.r invoke(Object obj) {
        this.$composition.a(obj);
        return p293xa.r.f47939a;
    }
}
