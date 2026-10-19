package androidx.compose.runtime;

import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Recomposer$broadcastFrameClock$1 extends Lambda implements Ia.a<p293xa.r> {
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    @Override // Ia.a
    public final p293xa.r invoke() {
        InterfaceC2691h<p293xa.r> interfaceC2691hX;
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.f12892b) {
            interfaceC2691hX = recomposer.x();
            if (((Recomposer.State) recomposer.f12909t.getValue()).compareTo(Recomposer.State.f12914c) <= 0) {
                throw kotlin.jvm.internal.h.b("Recomposer shutdown; frame clock awaiter will never resume", recomposer.f12894d);
            }
        }
        if (interfaceC2691hX != null) {
            ((C2693i) interfaceC2691hX).resumeWith(p293xa.r.f47939a);
        }
        return p293xa.r.f47939a;
    }
}
