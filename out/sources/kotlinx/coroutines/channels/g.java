package kotlinx.coroutines.channels;

import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g {
    public static BufferedChannel a(int i10, int i11, BufferOverflow bufferOverflow) {
        BufferedChannel kVar;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.f43243b;
        }
        if (i10 != -2) {
            if (i10 == -1) {
                if (bufferOverflow == BufferOverflow.f43243b) {
                    return new k(1, BufferOverflow.f43244c, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i10 == 0) {
                kVar = bufferOverflow == BufferOverflow.f43243b ? new BufferedChannel(null, 0) : new k(1, bufferOverflow, null);
            } else {
                if (i10 != Integer.MAX_VALUE) {
                    return bufferOverflow == BufferOverflow.f43243b ? new BufferedChannel(null, i10) : new k(i10, bufferOverflow, null);
                }
                kVar = new BufferedChannel(null, BrazeLogger.SUPPRESS);
            }
        } else if (bufferOverflow == BufferOverflow.f43243b) {
            d.f43287n0.getClass();
            kVar = new BufferedChannel(null, d.a.f43289b);
        } else {
            kVar = new k(1, bufferOverflow, null);
        }
        return kVar;
    }
}
