package androidx.compose.runtime;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
final class Recomposer$writeObserverOf$1 extends Lambda implements Ia.l<Object, p293xa.r> {
    final /* synthetic */ InterfaceC1115w $composition;
    final /* synthetic */ androidx.collection.L<Object> $modifiedValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(androidx.collection.L l10, InterfaceC1115w interfaceC1115w) {
        super(1);
        this.$composition = interfaceC1115w;
        this.$modifiedValues = l10;
    }

    @Override // Ia.l
    public final p293xa.r invoke(Object obj) {
        this.$composition.n(obj);
        androidx.collection.L<Object> l10 = this.$modifiedValues;
        if (l10 != null) {
            l10.d(obj);
        }
        return p293xa.r.f47939a;
    }
}
