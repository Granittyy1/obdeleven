package androidx.compose.foundation.lazy;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public interface p {
    static /* synthetic */ void c(p pVar, String str, Ia.q qVar, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        pVar.e(str, null, qVar);
    }

    default void e(Object obj, Object obj2, Ia.q<? super b, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void g(int i10, Ia.l lVar, Ia.l lVar2, ComposableLambdaImpl composableLambdaImpl) {
        throw new IllegalStateException("The method is not implemented");
    }
}
