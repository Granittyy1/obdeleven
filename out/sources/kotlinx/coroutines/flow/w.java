package kotlinx.coroutines.flow;

import com.braze.support.BrazeLogger;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D3.l f43431a = new D3.l(4, "NO_VALUE");

    public static final v a(int i10, int i11, BufferOverflow bufferOverflow) {
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "replay cannot be negative, but was ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(J4.i.b(i11, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i11 <= 0 && bufferOverflow != BufferOverflow.f43243b) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = BrazeLogger.SUPPRESS;
        }
        return new v(i10, i12, bufferOverflow);
    }

    public static /* synthetic */ v b(int i10, int i11, BufferOverflow bufferOverflow, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.f43243b;
        }
        return a(i10, i11, bufferOverflow);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final <T> InterfaceC2686c<T> d(u<? extends T> uVar, kotlin.coroutines.e eVar, int i10, BufferOverflow bufferOverflow) {
        return ((i10 == 0 || i10 == -3) && bufferOverflow == BufferOverflow.f43243b) ? uVar : new kotlinx.coroutines.flow.internal.f(i10, eVar, bufferOverflow, uVar);
    }
}
