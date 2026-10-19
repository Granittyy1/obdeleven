package kotlinx.coroutines;

import java.io.Closeable;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Y extends AbstractC2712w implements Closeable {
    static {
        AbstractC2712w.a baseKey = AbstractC2712w.f43614b;
        kotlin.jvm.internal.i.e(baseKey, "baseKey");
        ExecutorCoroutineDispatcher$Key$1 safeCast = new Ia.l<kotlin.coroutines.e.a, Y>() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1
            @Override // Ia.l
            public final Y invoke(kotlin.coroutines.e.a aVar) {
                kotlin.coroutines.e.a aVar2 = aVar;
                if (aVar2 instanceof Y) {
                    return (Y) aVar2;
                }
                return null;
            }
        };
        kotlin.jvm.internal.i.e(safeCast, "safeCast");
    }
}
