package kotlinx.coroutines.channels;

import kotlinx.coroutines.C2714y;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m<E> extends e<E> implements n<E> {
    @Override // kotlinx.coroutines.AbstractC2672a
    public final void t0(Throwable th, boolean z10) {
        if (this.f43290e.a(th) || z10) {
            return;
        }
        C2714y.a(this.f43222d, th);
    }

    @Override // kotlinx.coroutines.AbstractC2672a
    public final void u0(p293xa.r rVar) {
        this.f43290e.a(null);
    }

    @Override // kotlinx.coroutines.channels.n
    public final m getChannel() {
        return this;
    }
}
