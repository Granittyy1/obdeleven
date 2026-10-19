package p107i6;

import com.google.common.util.concurrent.AbstractFuture;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractFuture abstractFuture, long j, AbstractFuture.c cVar, AbstractFuture.c cVar2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j, cVar, cVar2)) {
            if (unsafe.getObject(abstractFuture, j) != cVar) {
                return false;
            }
        }
        return true;
    }
}
