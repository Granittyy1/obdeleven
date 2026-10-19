package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes2.dex */
public class C2685b<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SuspendLambda f43369e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2685b(Ia.p<? super kotlinx.coroutines.channels.n<? super T>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        super(eVar, i10, bufferOverflow);
        this.f43369e = (SuspendLambda) pVar;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final String toString() {
        return "block[" + this.f43369e + "] -> " + super.toString();
    }
}
