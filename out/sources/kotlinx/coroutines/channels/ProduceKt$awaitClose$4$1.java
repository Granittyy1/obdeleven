package kotlinx.coroutines.channels;

import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes2.dex */
final class ProduceKt$awaitClose$4$1 extends Lambda implements Ia.l<Throwable, p293xa.r> {
    final /* synthetic */ InterfaceC2691h<p293xa.r> $cont;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceKt$awaitClose$4$1(C2693i c2693i) {
        super(1);
        this.$cont = c2693i;
    }

    @Override // Ia.l
    public final p293xa.r invoke(Throwable th) {
        InterfaceC2691h<p293xa.r> interfaceC2691h = this.$cont;
        p293xa.r rVar = p293xa.r.f47939a;
        interfaceC2691h.resumeWith(rVar);
        return rVar;
    }
}
