package kotlinx.coroutines.flow;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m {
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public static final <T> y<T> a(InterfaceC2686c<? extends T> interfaceC2686c, int i10) {
        kotlinx.coroutines.flow.internal.d dVar;
        InterfaceC2686c<T> interfaceC2686cJ;
        kotlinx.coroutines.channels.d.f43287n0.getClass();
        int i11 = kotlinx.coroutines.channels.d.a.f43289b;
        if (i10 >= i11) {
            i11 = i10;
        }
        int i12 = i11 - i10;
        if (!(interfaceC2686c instanceof kotlinx.coroutines.flow.internal.d) || (interfaceC2686cJ = (dVar = (kotlinx.coroutines.flow.internal.d) interfaceC2686c).j()) == null) {
            return new y<>(i12, EmptyCoroutineContext.f43032b, BufferOverflow.f43243b, interfaceC2686c);
        }
        BufferOverflow bufferOverflow = dVar.f43395d;
        int i13 = dVar.f43394c;
        if (i13 != -3 && i13 != -2 && i13 != 0) {
            i12 = i13;
        } else if (bufferOverflow == BufferOverflow.f43243b) {
            if (i13 == 0) {
                i12 = 0;
            }
        } else if (i10 == 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return new y<>(i12, dVar.f43393b, bufferOverflow, interfaceC2686cJ);
    }
}
