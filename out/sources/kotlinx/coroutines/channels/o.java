package kotlinx.coroutines.channels;

import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.internal.v;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o<E> implements K0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2693i<h<? extends E>> f43298b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(C2693i<? super h<? extends E>> c2693i) {
        this.f43298b = c2693i;
    }

    @Override // kotlinx.coroutines.K0
    public final void d(v<?> vVar, int i10) {
        this.f43298b.d(vVar, i10);
    }
}
