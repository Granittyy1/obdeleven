package p107i6;

import com.google.common.util.concurrent.AbstractFuture;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractFuture abstractFuture, long j, AbstractFuture.h hVar, AbstractFuture.h hVar2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j, hVar, hVar2)) {
            if (unsafe.getObject(abstractFuture, j) != hVar) {
                return false;
            }
        }
        return true;
    }
}
